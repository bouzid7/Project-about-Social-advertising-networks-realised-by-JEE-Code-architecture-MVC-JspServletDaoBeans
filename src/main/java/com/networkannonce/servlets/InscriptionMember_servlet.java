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
 * Servlet implementation class Inscription_servlet
 */
public class InscriptionMember_servlet extends HttpServlet {
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom=request.getParameter("nom");
	    String prenoms=request.getParameter("prenoms");
	    String telephone=request.getParameter("telephone");
	    String email=request.getParameter("email");
	    String password=request.getParameter("password");
	    String confirm_password=request.getParameter("confirm_password");
	    
	    Member mi= new Member();
	    mi.setNommember(nom);
	    mi.setPrenomsmember(prenoms);
	    mi.setTelephonemember(telephone);
	    mi.setEmailmember(email);
	    mi.setPasswordmember(HPMd5.getMd5Hash(password));
	    mi.setPasswordmemberconfirm(HPMd5.getMd5Hash(confirm_password));
	    int MI=MemDao.insert(mi);
	    
	    
	    if(MI>0)
	    {
	    	
	    	request.setAttribute("annonces",AnnDao.getAllAnnonces());
	        RequestDispatcher rd=request.getRequestDispatcher("Dashboardm_member.jsp");
	        rd.forward(request,response);
	        
         }
	    
	    else
	    {
	    	 RequestDispatcher rd=request.getRequestDispatcher("Formulaire_Inscription.jsp.jsp");  
		     rd.forward(request,response);
	    }
	    
		
	}

}