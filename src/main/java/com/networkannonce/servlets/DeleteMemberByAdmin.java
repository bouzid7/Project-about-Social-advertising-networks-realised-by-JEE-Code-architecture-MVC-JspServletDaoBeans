package com.networkannonce.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.networkannonce.dao.AnnoncesDao;
import com.networkannonce.dao.CommentairesDao;
import com.networkannonce.dao.DaoFactory;
import com.networkannonce.dao.HashingPasswordMd5;
import com.networkannonce.dao.ItemsEspaceMemberDao;
import com.networkannonce.dao.MemberDao;
import com.networkannonce.dao.PhotosAnnonceDao;
import com.networkannonce.dao.sendMessageToMemberDao;

/**
 * Servlet implementation class DeleteMemberByAdmin
 */
public class DeleteMemberByAdmin extends HttpServlet {
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
		
		 String id1=request.getParameter("id");
		 int id = Integer.parseInt(id1);
		 int status1=AnnDao.deleteMember(id);
		 int status2=comDao.deleteMember(id);
		 int status3=MemDao.delete(id);
		 int status4=Smtm.deleteMember(id);
		 
		 request.setAttribute("m",MemDao.getMember(id));
		 request.setAttribute("AllMembers",MemDao.getAllMembers());
		 request.setAttribute("NM",MemDao.getNombreDeMembers());
	     request.setAttribute("NA",AnnDao.getNombreDeAnnonces());
	     request.setAttribute("NMessage", Smtm.getNombreDeMembers());
	    
		 RequestDispatcher rd=request.getRequestDispatcher("AdminDashboardAllMembers.jsp");
	     rd.forward(request,response);
	     
	
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	    
}