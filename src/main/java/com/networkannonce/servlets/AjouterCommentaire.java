package com.networkannonce.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.networkannonce.beans.Commentaires;
import com.networkannonce.dao.AnnoncesDao;
import com.networkannonce.dao.CommentairesDao;
import com.networkannonce.dao.DaoFactory;
import com.networkannonce.dao.ItemsEspaceMemberDao;
import com.networkannonce.dao.MemberDao;
import com.networkannonce.dao.PhotosAnnonceDao;

/**
 * Servlet implementation class AjouterCommentaire
 */
public class AjouterCommentaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	    private CommentairesDao comDao;
	   private AnnoncesDao AnnDao;
	   private MemberDao  MemDao;
	   private ItemsEspaceMemberDao Iem;
	   private PhotosAnnonceDao PhotosAnn;
	   
	    public void init() throws ServletException {
	        DaoFactory daoFactory = DaoFactory.getInstance();//charger le driver
	        this.comDao=daoFactory.getCommentairesDao();
	        this.AnnDao=daoFactory.getAnnonceDao();
	        this.MemDao=daoFactory.getMemberDao();
	        this.Iem=daoFactory.getItemsEspaceMemberDao();
	        this.PhotosAnn=daoFactory.getPhotosAnnonceDao();
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
		String commentaire=request.getParameter("commentaire");
		String idmember1=request.getParameter("idmember");
		String idannonce1=request.getParameter("idannonce");
		String  previousPath=request.getParameter("previousPath");
		 int idmember = Integer.parseInt(idmember1);
		 int idannonce = Integer.parseInt(idannonce1);
		 //request.setAttribute("idmember",idmember);
		 //request.setAttribute("idannonce",idannonce);
		 Commentaires ajouterCommentaire= new Commentaires();
		 ajouterCommentaire.setIdannonce(idannonce);
		 ajouterCommentaire.setIdmember(idmember);
		 ajouterCommentaire.setDescriptioncommentaire(commentaire);
		 int i=comDao.insert(ajouterCommentaire);
	  if(i>0)
	  {
		  request.setAttribute(" previousPath", previousPath);
		  RequestDispatcher rd=request.getRequestDispatcher("fetchData.jsp");
		  rd.forward(request,response);
		  
	  }
	  
	    
	}

}
