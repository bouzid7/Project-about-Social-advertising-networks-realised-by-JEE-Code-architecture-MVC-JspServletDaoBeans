package com.networkannonce.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

  public class Logout_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 response.setContentType("text/html");  
         PrintWriter out=response.getWriter();  
         HttpSession session=request.getSession();  
         session.invalidate();  
         out.print("<script>alert('You are successfully logged out!') </script>");
         request.getRequestDispatcher("Home.jsp").include(request, response);  
         out.close();
	}

}
