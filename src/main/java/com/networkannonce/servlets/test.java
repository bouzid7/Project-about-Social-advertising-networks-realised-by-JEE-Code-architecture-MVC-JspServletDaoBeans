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
import com.networkannonce.dao.MemberDao;

/**
 * Servlet implementation class test
 */
public class test extends HttpServlet {
	  
	
	 private static final long serialVersionUID = 1L;
     
	    
     private CommentairesDao comDao;
     private AnnoncesDao AnnDao;
     private MemberDao  MemDao;
     private HashingPasswordMd5 HPMd5;
     public void init() throws ServletException {
     DaoFactory daoFactory = DaoFactory.getInstance();//charger le driver
    this.comDao=daoFactory.getCommentairesDao();
    this.AnnDao=daoFactory.getAnnonceDao();
    this.MemDao=daoFactory.getMemberDao();
    this.HPMd5=daoFactory.getPasswordHashing();
     }
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 String id1=request.getParameter("id");  
	        int id=Integer.parseInt(id1);
	        int status=AnnDao.delete(id); 
	        if(status>0)
	  	     {
	  		  
	  		  RequestDispatcher rd=request.getRequestDispatcher("fetchData.jsp");
	  		  
	  		  rd.forward(request,response);
	  		  
	  	     }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
