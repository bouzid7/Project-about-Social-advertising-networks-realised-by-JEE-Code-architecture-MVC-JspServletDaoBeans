package com.networkannonce.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.networkannonce.beans.MessageToMember;
import com.networkannonce.dao.AnnoncesDao;
import com.networkannonce.dao.CommentairesDao;
import com.networkannonce.dao.DaoFactory;
import com.networkannonce.dao.ItemsEspaceMemberDao;
import com.networkannonce.dao.MemberDao;
import com.networkannonce.dao.PhotosAnnonceDao;
import com.networkannonce.dao.sendMessageToMemberDao;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class sendMessageToMember
 */

public class sendMessageToMember extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	    private CommentairesDao comDao;
	    private AnnoncesDao AnnDao;
	    private MemberDao  MemDao;
	    private ItemsEspaceMemberDao Iem;
	    private PhotosAnnonceDao PhotosAnn;
	    private sendMessageToMemberDao sendMessageTM;
	   
	        public void init() throws ServletException {
	        DaoFactory daoFactory = DaoFactory.getInstance();//charger le driver
	        this.comDao=daoFactory.getCommentairesDao();
	        this.AnnDao=daoFactory.getAnnonceDao();
	        this.MemDao=daoFactory.getMemberDao();
	        this.Iem=daoFactory.getItemsEspaceMemberDao();
	        this.PhotosAnn=daoFactory.getPhotosAnnonceDao();
	        this.sendMessageTM=daoFactory.getsendMessageToMemberDao();
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
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String currentDate=formatter.format(date);
		String TitreMessage=request.getParameter("TitreMessage");
	    String DescriptionMessage=request.getParameter("DescriptionMessage");
	    String IdMember = request.getParameter("IdMember");
	    String IdAnnonce= request.getParameter("IdAnnonce");
	    int idmember1 = Integer.parseInt(IdMember);
		int idannonce1 = Integer.parseInt(IdAnnonce);
	    MessageToMember mtm= new MessageToMember();
	     mtm.setTitremessage(TitreMessage);
	     mtm.setTextmessage(DescriptionMessage);
	     mtm.setDatemessagemember(currentDate);
	     mtm.setIdmember(idmember1);
	     mtm.setIdannonce(idannonce1);
	     int i=sendMessageTM.insert(mtm);
		 if(i>0) {
			 
			 //request.setAttribute("s",mtm);
		     RequestDispatcher rd=request.getRequestDispatcher("DetailAnnonceMemberInscrit.jsp");
			 rd.forward(request,response);
				  
		           }
		 
		 else {
			 
			 //request.setAttribute("s",mtm);
		     RequestDispatcher rd=request.getRequestDispatcher("sendMessageToMember.jsp");
			 rd.forward(request,response);
			   }
		 
	}

}
