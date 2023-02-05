package com.networkannonce.servlets;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Servlet implementation class AuthentificationMember_servlet
 */
public class AuthentificationMember_servlet extends HttpServlet {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
	    String password=request.getParameter("password");
	    //************************************************
	   
	    	
	        
		    String pwd=HPMd5.getMd5Hash(password);
		    if(MemDao.validate(username,pwd))
		    {
		    	
		    	
		        //request.setAttribute("commentairesM",comDao.getAllCommentairesMember(MemDao.getMemberById(NM, PM).getIdmember()));
		        //request.setAttribute("members",MemDao.getAllMembers());
		       //request.setAttribute("m",MemDao.getMemberById(NM, PM));
		       // request.setAttribute("annoncesM",AnnDao.getAllAnnoncesMember(MemDao.getMemberById(username,pwd).getIdmember()));
		        // request.setAttribute("x",Iem.getAllitemsEspaceMember(MemDao.getMemberById(username,pwd).getIdmember()));
		    	// request.setAttribute("photoann",PhotosAnn.getAllPhotosAnnonceByIdAnnonceTout(1));
		    	
		    	request.setAttribute("noc",comDao.getNombreCommentairesAnnonce());
		    	request.setAttribute("commentaires",comDao.getAllCommentairesMember(MemDao.getMemberById(username,pwd).getIdmember()));
		        request.setAttribute("m",MemDao.getMemberById(username,pwd));
		    	request.setAttribute("annoncesM",AnnDao.getAllAnnoncesMember(MemDao.getMemberById(username,pwd).getIdmember()));
		        request.setAttribute("gb",PhotosAnn.getAllPhoto());
		        request.setAttribute("usernameBack",username);
		        request.setAttribute("pwdBack",pwd);
		        request.setAttribute("NM",MemDao.getNombreDeMembers());
		        request.setAttribute("NA",AnnDao.getNombreDeAnnonces());
		        request.setAttribute("NMessage", Smtm.getNombreDeMembers());
		        
		        String str="admin@gmail.com";
		        if(str.equals(username)) {
		        	  RequestDispatcher rd=request.getRequestDispatcher("AdminDashboard.jsp");
				      rd.forward(request,response);
		                                  }
		        
		        else {
		        	 RequestDispatcher rd=request.getRequestDispatcher("Dashboardm_member.jsp");
				      rd.forward(request,response);
		              }
		       
		        
		        
	        }
		    
		    else
		    {
		    	 RequestDispatcher rd=request.getRequestDispatcher("/Formulaire_Authentification.jsp");  
			     rd.forward(request,response);
		    }
		    
	
	    
	}

}