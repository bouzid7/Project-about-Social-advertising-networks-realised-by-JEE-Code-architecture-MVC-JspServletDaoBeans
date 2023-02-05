package com.networkannonce.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.networkannonce.beans.Annonces;
import com.networkannonce.beans.PhotosAnnonce;
import com.networkannonce.dao.AnnoncesDao;
import com.networkannonce.dao.PhotosAnnonceDao;
import com.networkannonce.dao.CommentairesDao;
import com.networkannonce.dao.DaoFactory;
import com.networkannonce.dao.HashingPasswordMd5;
import com.networkannonce.dao.MemberDao;

/**
 * Servlet implementation class FormulaireDeposerAnnonceMember
 */

@MultipartConfig
public class FormulaireDeposerAnnonceMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	   
    private CommentairesDao comDao;
    private AnnoncesDao AnnDao;
    private MemberDao  MemDao;
    private HashingPasswordMd5 HPMd5;
    private PhotosAnnonceDao  PhotosDao;
    
    public void init() throws ServletException {
   DaoFactory daoFactory = DaoFactory.getInstance();//charger le driver
   this.comDao=daoFactory.getCommentairesDao();
   this.AnnDao=daoFactory.getAnnonceDao();
   this.MemDao=daoFactory.getMemberDao();
   this.HPMd5=daoFactory.getPasswordHashing();
   this.PhotosDao=daoFactory.getPhotosAnnonceDao();
}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/* Receive file uploaded to the Servlet from the HTML5 form */
		
		/*-------------------file1------------------------*/
		Part filePart1 = request.getPart("file1");
	    String fileName1 = filePart1.getSubmittedFileName();
	    for (Part part1 : request.getParts()) {
	      part1.write("C:/eclipse-workspace/Project_Network_announcement/WebContent/public/images/" + fileName1);
	    }
/*
	    
	     Part filePart2 = request.getPart("file2");
	    String fileName2 = filePart2.getSubmittedFileName();
	    for (Part part2 : request.getParts()) {
	      part2.write("C:/eclipse-workspace/Project_Network_announcement/WebContent/public/images/" + fileName2);
	    }
	   
	     Part filePart3 = request.getPart("file3");
	    String fileName3 = filePart3.getSubmittedFileName();
	    for (Part part3 : request.getParts()) {
	      part3.write("C:/eclipse-workspace/Project_Network_announcement/WebContent/public/images/" + fileName3);
	    }
	    
	    
	     Part filePart4 = request.getPart("file4");
	    String fileName4 = filePart4.getSubmittedFileName();
	    for (Part part4 : request.getParts()) {
	      part4.write("C:/eclipse-workspace/Project_Network_announcement/WebContent/public/images/" + fileName4); 
	    }
 /*-------------------------------------------------------------------------------------------*/
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String currentDate=formatter.format(date);
		String idmember1=request.getParameter("idmember");
		int idmember = Integer.parseInt(idmember1);
		String titreannonce=request.getParameter("TitreAnnonce");
		String descriptionannonce=request.getParameter("DescriptionAnnonce");
		String villeannonce=request.getParameter("VilleAnnonce");
		request.setAttribute("titreannonce",titreannonce);
		request.setAttribute("descriptionannonce",descriptionannonce);
		request.setAttribute("nomfile1",fileName1);
		//request.setAttribute("nomfile2",fileName2);
		//request.setAttribute("nomfile3",fileName3);
		//request.setAttribute("nomfile4",fileName4);
		request.setAttribute("villeannonce",villeannonce);
		Annonces annonceM=new Annonces();
		annonceM.setTitreannonce(titreannonce);
		annonceM.setDescriptionannonce(descriptionannonce);
		annonceM.setDatedepotannonce(currentDate);
		annonceM.setVilleannonce(villeannonce);
		annonceM.setIdmember(idmember);
		int statusA=AnnDao.insert(annonceM);
		
		Annonces LastID=new Annonces();
		LastID=AnnDao.getIdLastAnnonceInserted();
		  PhotosAnnonce phA=new PhotosAnnonce();
		  phA.setImageannonce("public/images/"+fileName1);
		  phA.setIdannonce(LastID.getIdannonce());
		  int statusPH=PhotosDao.insert(phA);
		//request.setAttribute("LastID",LastID.getIdannonce());
		if(statusA>0 && statusPH>0 )
		{
		
		RequestDispatcher rd=request.getRequestDispatcher("fetchData.jsp");
 		rd.forward(request,response);
 		
		}
		else {
			
			 response.getWriter().print("il y a un probleme .");
			
		     }
	   //response.getWriter().print("The file uploaded sucessfully.");
	  }
}