package com.networkannonce.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.networkannonce.beans.*;
import com.networkannonce.dao.*;


public class CommentairesDaoImpl implements CommentairesDao {
	
    private DaoFactory daoFactory;

    CommentairesDaoImpl (DaoFactory daoFactory) {
    	
    	 this.daoFactory = daoFactory;
    }
    
    @Override
    public List<Commentaires> getAllCommentairesAnnonce(int ida) {
        List<Commentaires> comments = new ArrayList<Commentaires>();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = daoFactory.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM gestion_annonces.commentaire where IdAnnonce="+ida+";");

            while (rs.next()) {
            	
                Commentaires co = new Commentaires();
                co.setIdcommentaire(rs.getInt(1));
                co.setDescriptioncommentaire(rs.getString(2));
                co.setIdmember(rs.getInt(3));
                co.setIdannonce(rs.getInt(4));
                comments.add(co);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return comments;
    }


	@Override
	public int insert(Commentaires C) {
		// TODO Auto-generated method stub
		    int status=0;  
		    Connection con = null;
	        PreparedStatement ps = null;
	       
	        try{
	        	
	        	con=daoFactory.getConnection();   
                ps=con.prepareStatement("insert into commentaire(DescriptionCommentaire,IdMember,IdAnnonce) values (?,?,?)");
	            ps.setString(1,C.getDescriptioncommentaire());  
	            ps.setInt(2,C.getIdmember());  
	            ps.setInt(3,C.getIdannonce());
	            status=ps.executeUpdate();  
	              
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status; 
	}


	@Override
	public int update(Commentaires C) {
		// TODO Auto-generated method stub
		return 0;
	}


	


	@Override
	public Commentaires getCommentairesById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commentaires> getAllCommentairesMember(int idm) {
		// TODO Auto-generated method stub
		List<Commentaires> comments = new ArrayList<Commentaires>();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = daoFactory.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM gestion_annonces.commentaire where IdMember="+idm+";");

            while (rs.next()) {
            	
                Commentaires co = new Commentaires();
                co.setIdcommentaire(rs.getInt(1));
                co.setDescriptioncommentaire(rs.getString(2));
                co.setIdmember(rs.getInt(3));
                co.setIdannonce(rs.getInt(4));
                comments.add(co);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return comments;

	}

	@Override
	public List<Ncommentaire> getNombreCommentairesAnnonce() {
		// TODO Auto-generated method stub
		List<Ncommentaire> Ncomments = new ArrayList<Ncommentaire>();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = daoFactory.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("SELECT IdAnnonce,count(IdAnnonce) FROM gestion_annonces.commentaire group by IdAnnonce;");

            while (rs.next()) {
                Ncommentaire nc=new Ncommentaire();
                 nc.setIdannonce(rs.getInt(1));;
                 nc.setCount(rs.getInt(2));;
                 Ncomments.add(nc);
            
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return Ncomments;
	}

	@Override
	public Ncommentaire getNombreDeCommentairesAnnonce(int idannonce) {
		// TODO Auto-generated method stub
	    Ncommentaire nc=new Ncommentaire();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = daoFactory.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("SELECT IdAnnonce,count(IdCommentaire) FROM gestion_annonces.commentaire where IdAnnonce="+idannonce+"");

            while (rs.next()) {
               
                 nc.setIdannonce(rs.getInt(1));;
                 nc.setCount(rs.getInt(2));;
               
            
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return nc;
	
	}

	@Override
	public int deleteMember(int C) {
		// TODO Auto-generated method stub
		Connection con = null;
        PreparedStatement ps = null;
		int status=0; 
        try{
        	con=daoFactory.getConnection();
            ps=con.prepareStatement("delete from commentaire where IdMember="+C+";"); 
            status=ps.executeUpdate();
            
        }catch(Exception e){e.printStackTrace();}  
          
        return status;
	}

	@Override
	public int delete(int C) {
		// TODO Auto-generated method stub
		return 0;
	}

	
 

}