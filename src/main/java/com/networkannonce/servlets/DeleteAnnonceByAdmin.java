package com.networkannonce.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.networkannonce.beans.Annonces;
import com.networkannonce.dao.AnnoncesDao;
import com.networkannonce.dao.CommentairesDao;
import com.networkannonce.dao.DaoFactory;
import com.networkannonce.dao.HashingPasswordMd5;
import com.networkannonce.dao.ItemsEspaceMemberDao;
import com.networkannonce.dao.MemberDao;
import com.networkannonce.dao.PhotosAnnonceDao;
import com.networkannonce.dao.sendMessageToMemberDao;

/**
 * Servlet implementation class DeleteAnnonceByAdmin
 */
public class DeleteAnnonceByAdmin extends HttpServlet {

	   private static final long serialVersionUID = 1L;
	   private CommentairesDao comDao;
	   private AnnoncesDao AnnDao;
	   private MemberDao  MemDao;
	   private HashingPasswordMd5 HPMd5;
	   private ItemsEspaceMemberDao Iem;
	   private PhotosAnnonceDao PhotosAnn;
	   private sendMessageToMemberDao Smtm;
	   
	    public void init() throws ServletException {
	        DaoFactory daoFactory = DaoFactory.getInstance();//charger le driver
	        this.comDao=daoFactory.getCommentairesDao();
	        this.AnnDao=daoFactory.getAnnonceDao();
	        this.MemDao=daoFactory.getMemberDao();
	        this.HPMd5=daoFactory.getPasswordHashing();
	        this.Iem=daoFactory.getItemsEspaceMemberDao();
	        this.PhotosAnn=daoFactory.getPhotosAnnonceDao();
	        this.Smtm=daoFactory.getsendMessageToMemberDao();
	    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");  
         PrintWriter out=response.getWriter(); 
		    String idannonce=request.getParameter("id");  
	        int ida=Integer.parseInt(idannonce);
	        int status=AnnDao.delete(ida); 
	      
	       if(status>0) {
	    	  Annonces a1=new Annonces();
	    	  a1=AnnDao.getAnnonceOnly(ida);
	  		 request.setAttribute("m",MemDao.getMember(a1.getIdmember()));
	  		 request.setAttribute("AllMembers",MemDao.getAllMembers());
	  		 request.setAttribute("NM",MemDao.getNombreDeMembers());
	  	     request.setAttribute("NA",AnnDao.getNombreDeAnnonces());
	  	     request.setAttribute("NMessage", Smtm.getNombreDeMembers());
	  	     request.setAttribute("AllAnnonces",AnnDao.getAllAnnonces());
	  	     out.print("<script>alert('l'annonce a supprimé avec succes!') </script>");
	         request.getRequestDispatcher("AdminDashboardAllAnnonces.jsp").include(request, response);  
	         out.close();
	  		
	       }
	       
	       else {
	    	   
	    	      Annonces a1=new Annonces();
		    	  a1=AnnDao.getAnnonceOnly(ida);
		  		 request.setAttribute("m",MemDao.getMember(a1.getIdmember()));
		  		 request.setAttribute("AllMembers",MemDao.getAllMembers());
		  		 request.setAttribute("NM",MemDao.getNombreDeMembers());
		  	     request.setAttribute("NA",AnnDao.getNombreDeAnnonces());
		  	     request.setAttribute("NMessage", Smtm.getNombreDeMembers());
		  	     request.setAttribute("AllAnnonces",AnnDao.getAllAnnonces());
		  	     out.print("<script>alert('une erreur est survenue!') </script>");
		         request.getRequestDispatcher("AdminDashboardAllAnnonces.jsp").include(request, response);  
		         out.close();
	       }
		
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
