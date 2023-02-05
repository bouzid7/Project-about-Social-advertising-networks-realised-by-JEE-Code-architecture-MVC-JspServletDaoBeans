package com.networkannonce.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.networkannonce.beans.Annonces;
import com.networkannonce.dao.AnnoncesDao;
import com.networkannonce.dao.CommentairesDao;
import com.networkannonce.dao.DaoFactory;
import com.networkannonce.dao.HashingPasswordMd5;
import com.networkannonce.dao.ItemsEspaceMemberDao;
import com.networkannonce.dao.MemberDao;
import com.networkannonce.dao.PhotosAnnonceDao;

/**
 * Servlet implementation class HomeDetail
 */
public class HomeDetail extends HttpServlet {
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
		  String idannonce=request.getParameter("idannonce");
	      int id=Integer.parseInt(idannonce);
	      Annonces idmember=AnnDao.getMemberByIdAnnonce(id);
	      
	      request.setAttribute("photosA",PhotosAnn.getAllPhotosAnnonceByIdAnnonceTout(id));
	      request.setAttribute("memberA",MemDao.getMember(idmember.getIdmember()));
	      request.setAttribute("commentairesA",comDao.getAllCommentairesAnnonce(id));
	      request.setAttribute("allM",MemDao.getAllMembers());
	      request.setAttribute("annOnly",AnnDao.getAnnonceOnly(id));
	      request.setAttribute("nombreC",comDao.getNombreDeCommentairesAnnonce(id));
	      RequestDispatcher rd=request.getRequestDispatcher("HomeDetail.jsp");
	      rd.forward(request,response);
	   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
