package com.networkannonce.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.networkannonce.beans.Member;
import com.networkannonce.dao.AnnoncesDao;
import com.networkannonce.dao.CommentairesDao;
import com.networkannonce.dao.DaoFactory;
import com.networkannonce.dao.HashingPasswordMd5;
import com.networkannonce.dao.MemberDao;
import com.networkannonce.dao.PhotosAnnonceDao;

/**
 * Servlet implementation class DeposerAnnonce
 */
public class DeposerAnnonce extends HttpServlet {
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
		String idmember1=request.getParameter("id");
		int idmember = Integer.parseInt(idmember1);
		Member  deposerAnnonceMember= new Member();
		deposerAnnonceMember=MemDao.getMember(idmember);
		request.setAttribute("nomMember",deposerAnnonceMember.getNommember());
		request.setAttribute("prenomMember",deposerAnnonceMember.getPrenomsmember());
		request.setAttribute("idMember",deposerAnnonceMember.getIdmember());
		RequestDispatcher rd=request.getRequestDispatcher("FormulaireDeposerAnnonceMember.jsp");
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
