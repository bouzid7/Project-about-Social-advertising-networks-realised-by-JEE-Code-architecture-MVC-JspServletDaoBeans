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

import com.networkannonce.beans.*;
import com.networkannonce.dao.*;


/**
 * Servlet implementation class Login
 */
public class Login_servlet extends HttpServlet {
	  private static final long serialVersionUID = 1L;
       
	   
	   private CommentairesDao comDao;
	 
	   private AnnoncesDao AnnDao;
	 
	   private MemberDao  MemDao;
	   
	    public void init() throws ServletException {
	        DaoFactory daoFactory = DaoFactory.getInstance();//charger le driver
	        
	        this.comDao=daoFactory.getCommentairesDao();
	      
	        this.AnnDao=daoFactory.getAnnonceDao();
	     
	        this.MemDao=daoFactory.getMemberDao();
	        
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
		String PM=request.getParameter("prenom");
	    String NM=request.getParameter("nom");
	    
	 
	    
	    if( MemDao.validate(NM, PM))
	    {
	    	
	    	request.setAttribute("commentairesM",comDao.getAllCommentairesMember(MemDao.getMemberById(NM, PM).getIdmember()));
	      	request.setAttribute("members",MemDao.getAllMembers());
	    	request.setAttribute("m",MemDao.getMemberById(NM, PM));
	    	request.setAttribute("annoncesM",AnnDao.getAllAnnoncesMember(MemDao.getMemberById(NM, PM).getIdmember()));
	    	request.setAttribute("annonces",AnnDao.getAllAnnonces());
	        RequestDispatcher rd=request.getRequestDispatcher("Dashboard_membre.jsp");
	        rd.forward(request,response);
	        
         }
	    
	    else
	    {
	    	 RequestDispatcher rd=request.getRequestDispatcher("test.jsp");  
		     rd.forward(request,response);
	    }
	    
	}

}