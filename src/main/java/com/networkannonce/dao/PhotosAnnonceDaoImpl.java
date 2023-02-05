package com.networkannonce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.networkannonce.beans.PhotosAnnonce;

public class PhotosAnnonceDaoImpl implements PhotosAnnonceDao {
	
	 
	    private DaoFactory daofactory;  
		public PhotosAnnonceDaoImpl(DaoFactory daofactory) {
			// TODO Auto-generated constructor stub
			   this.daofactory=daofactory;
		}

	@Override
	public int insert(PhotosAnnonce A) {
		// TODO Auto-generated method stub
		    int status=0;
		    Connection con = null;
	        PreparedStatement ps = null;
	       
	        try{
                con=daofactory.getConnection();   
                ps=con.prepareStatement("insert into photosannonce(ImageAnnonce,IdAnnonce) values (?,?)");
	            ps.setString(1,A.getImageannonce());
	            ps.setInt(2,A.getIdannonce());
	            status=ps.executeUpdate();
	              
	        }catch(Exception ex){ex.printStackTrace();}  
	       
	        return status; 
	}

	@Override
	public int update(PhotosAnnonce A) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(PhotosAnnonce A) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PhotosAnnonce getPhotosAnnonceById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PhotosAnnonce getAllPhotosAnnonceByIdAnnonceGroupBy(int idannonce) {
		// TODO Auto-generated method stub
		PhotosAnnonce an = new PhotosAnnonce();
	        Connection con = null;
	        Statement st = null;
	        ResultSet rs = null;

	        try {
	            con = daofactory.getConnection();
	            st = con.createStatement();
	            rs = st.executeQuery("SELECT * FROM gestion_annonces.photosannonce where IdAnnonce="+idannonce+" group by IdAnnonce;");

	            while (rs.next()) {
	            	
	            	an.setIdphotoannonce(rs.getInt(1));
	            	an.setImageannonce(rs.getString(2));
	                an.setIdannonce(rs.getInt(3));
	                
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return an;
	}
	

	@Override
	public List<PhotosAnnonce> getAllPhotosAnnonceByIdAnnonceTout(int idannonce) {
		    List<PhotosAnnonce> photosannonces = new ArrayList<PhotosAnnonce>();
	        Connection con = null;
	        Statement st = null;
	        ResultSet rs = null;

	        try {
	            con = daofactory.getConnection();
	            st = con.createStatement();
	            rs = st.executeQuery("SELECT * FROM gestion_annonces.photosannonce where IdAnnonce="+idannonce+";");

	            while (rs.next()) {
	            	
	            	PhotosAnnonce an = new PhotosAnnonce();
	            	an.setIdphotoannonce(rs.getInt(1));
	            	an.setImageannonce(rs.getString(2));
	                an.setIdannonce(rs.getInt(3));
	                photosannonces.add(an);
	                
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return photosannonces;
	}

	@Override
	public List<PhotosAnnonce> getAllPhoto() {
		// TODO Auto-generated method stub
		 List<PhotosAnnonce> photosannonces = new ArrayList<PhotosAnnonce>();
	        Connection con = null;
	        Statement st = null;
	        ResultSet rs = null;

	        try {
	            con = daofactory.getConnection();
	            st = con.createStatement();
	            rs = st.executeQuery("SELECT * FROM gestion_annonces.photosannonce  group by IdAnnonce;");

	            while (rs.next()) {
	            	
	            	PhotosAnnonce an = new PhotosAnnonce();
	            	an.setIdphotoannonce(rs.getInt(1));
	            	an.setImageannonce(rs.getString(2));
	                an.setIdannonce(rs.getInt(3));
	                photosannonces.add(an);
	                
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return photosannonces;
	}
	

}