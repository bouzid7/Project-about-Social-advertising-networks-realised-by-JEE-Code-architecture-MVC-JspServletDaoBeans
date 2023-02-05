package com.networkannonce.dao;
import java.util.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoFactory {

	    private String url;
	    private String username;
	    private String password;

	    DaoFactory(String url, String username, String password) {
	        this.url = url;
	        this.username = username;
	        this.password = password;
	    }

	    public static DaoFactory getInstance() {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	        } catch (ClassNotFoundException e) {

	        }

	        DaoFactory instance = new DaoFactory(
	                "jdbc:mysql://localhost:3306/gestion_annonces","root","!@#$ZT277359ab");
	        return instance;
	    }

	    public Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(url, username, password);
	    }

	    // Récupération du Dao
	   

	   
/*   functionnality using in our project  */
	   
	   public MemberDao getMemberDao() {
		   
		   return new MemberDaoImpl(this);
	   }
	   
	   public AnnoncesDao getAnnonceDao() {
		   
		   return new AnnoncesDaoImpl(this);
	   }
	   
	   public CommentairesDao getCommentairesDao() {
	        return new CommentairesDaoImpl(this);
	    }
	   
	   public ItemsEspaceMemberDao getItemsEspaceMemberDao() {
	        return new ItemsEspaceMemberDaoImpl(this);
	    }
	   
	   
       public HashingPasswordMd5 getPasswordHashing() {
		   
		   return new HashingPasswordMd5Impl();
	    }
       
       public PhotosAnnonceDao getPhotosAnnonceDao() {
		   
		   return new  PhotosAnnonceDaoImpl(this);
	    }
         
        public sendMessageToMemberDao getsendMessageToMemberDao() {
		   
		   return new  sendMessageToMemberDaoImpl(this);
	    }
       
      
    
	  
	   
      

       
}