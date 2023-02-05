package com.networkannonce.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.networkannonce.beans.Annonces;
import com.networkannonce.beans.Ncommentaire;


public class AnnoncesDaoImpl implements AnnoncesDao {

	     private DaoFactory daofactory;  
	public AnnoncesDaoImpl(DaoFactory daofactory) {
		// TODO Auto-generated constructor stub
		   this.daofactory=daofactory;
	}
	
	@Override
	public int insert(Annonces A) {
		// TODO Auto-generated method stub
		    int status=0;  
		    Connection con = null;
	        PreparedStatement ps = null;
	       
	        try{
   con=daofactory.getConnection();   
   ps=con.prepareStatement("insert into annonce(TitreAnnonce,DescriptionAnnonce,DateDepotAnnonce,VilleAnnonce,IdMember) values (?,?,?,?,?)"); 
	            ps.setString(1,A.getTitreannonce());  
	            ps.setString(2,A.getDescriptionannonce());  
	            ps.setString(3,A.getDatedepotannonce()); 
	            ps.setString(4,A.getVilleannonce());
	            ps.setInt(5,A.getIdmember());
	            status=ps.executeUpdate();  
	              
	        }catch(Exception ex){ex.printStackTrace();}  
	       
	        return status; 
	}

	@Override
	public int update(Annonces e) {
		// TODO Auto-generated method stub
		 int status=0;  
		 Connection con = null;
	     PreparedStatement ps = null;
        try{  
            con=daofactory.getConnection();   
            ps=con.prepareStatement(  
                         "update annonce set TitreAnnonce=?,DescriptionAnnonce=?,VilleAnnonce=? where IdAnnonce=?"
            		            );
            
            ps.setString(1,e.getTitreannonce());  
            ps.setString(2,e.getDatedepotannonce());  
            ps.setString(3,e.getVilleannonce());  
            ps.setInt(4,e.getIdannonce());
            status=ps.executeUpdate();  
              
             
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
		
	}

	@Override
	public int delete(int idannonce) {
		// TODO Auto-generated method stub
		Connection con = null;
        PreparedStatement ps = null;
		int status=0; 
        try{
        	con=daofactory.getConnection();
            ps=con.prepareStatement("delete from annonce where IdAnnonce="+idannonce+";"); 
            status=ps.executeUpdate();
            
        }catch(Exception e){e.printStackTrace();}  
          
        return status;
	}

	@Override
	public Annonces getAnnoncesById(int idmember) {
		// TODO Auto-generated method stub
		//    List<Annonces> annonces = new ArrayList<Annonces>();
	        Annonces  an=new Annonces();
	        Connection con = null;
	        PreparedStatement ps = null;
	        ResultSet rs = null;
        
        try{ 
        	con=daofactory.getConnection();   
            ps=con.prepareStatement("SELECT * FROM gestion_annonces.annonce where IdMember=?");  
            ps.setInt(1,idmember);
            rs=ps.executeQuery();
            if(rs.next()){
            	
            	 an.setIdannonce(rs.getInt(1));
	             an.setTitreannonce(rs.getString(2));
	             an.setDescriptionannonce(rs.getString(3));
	             an.setDatedepotannonce(rs.getString(4));
	             an.setEtatannonce(rs.getString(5));
	             an.setNombrelike(rs.getInt(6));
	             an.setVilleannonce(rs.getString(7));
	             an.setIdmember(rs.getInt(8));
	            
	             //annonces.add(an);
                 
            }
       
        }catch(Exception ex){ex.printStackTrace();}  
          
       // return annonces;
        return an;
	}

	@Override
	public List<Annonces> getAllAnnoncesMember(int id) {
		
		    List<Annonces> annonces = new ArrayList<Annonces>();
	        Connection con = null;
	        Statement st = null;
	        ResultSet rs = null;

	        try {
	            con = daofactory.getConnection();
	            st = con.createStatement();
	            rs = st.executeQuery("SELECT * FROM gestion_annonces.annonce where IdMember="+id+";");

	            while (rs.next()) {
	            	
	            	Annonces an = new Annonces();
	                an.setIdannonce(rs.getInt(1));
	                an.setTitreannonce(rs.getString(2));
	                an.setDescriptionannonce(rs.getString(3));
	                an.setDatedepotannonce(rs.getString(4));
	                an.setEtatannonce(rs.getString(5));
	                an.setNombrelike(rs.getInt(6));
	                an.setVilleannonce(rs.getString(7));
	                an.setIdmember(rs.getInt(8));
	               
	                annonces.add(an);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return annonces;
	
	}

	@Override
	public List<Annonces> getAllAnnonces() {
		// TODO Auto-generated method stub
		 List<Annonces> annonces = new ArrayList<Annonces>();
	        Connection con = null;
	        Statement st = null;
	        ResultSet rs = null;

	        try {
	            con = daofactory.getConnection();
	            st = con.createStatement();
	            rs = st.executeQuery("SELECT * FROM gestion_annonces.annonce ;");

	            while (rs.next()) {
	            	
	            	Annonces an = new Annonces();
	                an.setIdannonce(rs.getInt(1));
	                an.setTitreannonce(rs.getString(2));
	                an.setDescriptionannonce(rs.getString(3));
	                an.setDatedepotannonce(rs.getString(4));
	                an.setEtatannonce(rs.getString(5));
	                an.setNombrelike(rs.getInt(6));
	                an.setVilleannonce(rs.getString(7));
	                an.setIdmember(rs.getInt(8));
	            
	                annonces.add(an);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return annonces;
	
	}

	@Override
	public Annonces getMemberByIdAnnonce(int idannonce) {
		// TODO Auto-generated method stub
		  Annonces  an=new Annonces();
	        Connection con = null;
	        PreparedStatement ps = null;
	        ResultSet rs = null;
      
      try{  
      	con=daofactory.getConnection();   
          ps=con.prepareStatement("SELECT IdMember FROM gestion_annonces.annonce where IdAnnonce="+idannonce+";");  
          rs=ps.executeQuery();
          if(rs.next()){
	             an.setIdmember(rs.getInt(1));
	        
          }
     
      }catch(Exception ex){ex.printStackTrace();}  
        
                return an;
		
	}

	@Override
	public Annonces getAnnonceOnly(int idannonce) {
		// TODO Auto-generated method stub
		   Annonces  an=new Annonces();
	        Connection con = null;
	        PreparedStatement ps = null;
	        ResultSet rs = null;
       
       try{  
       	con=daofactory.getConnection();   
           ps=con.prepareStatement("SELECT * FROM gestion_annonces.annonce where IdAnnonce="+idannonce+"");  
           rs=ps.executeQuery();
           if(rs.next()){
           	    
           	     an.setIdannonce(rs.getInt(1));
	             an.setTitreannonce(rs.getString(2));
	             an.setDescriptionannonce(rs.getString(3));
	             an.setDatedepotannonce(rs.getString(4));
	             an.setEtatannonce(rs.getString(5));
	             an.setNombrelike(rs.getInt(6));
	             an.setVilleannonce(rs.getString(7));
	             an.setIdmember(rs.getInt(8));
	            
                
           }
      
       }catch(Exception ex){ex.printStackTrace();}  
     
       return an;
	}

	
	
	@Override
	public Annonces getIdLastAnnonceInserted() {
		// TODO Auto-generated method stub
		    Annonces  an=new Annonces();
	        Connection con = null;
	        PreparedStatement ps = null;
	        ResultSet rs = null;
    
    try{
    	con=daofactory.getConnection();
        ps=con.prepareStatement("SELECT MAX(IdAnnonce) AS LastID FROM annonce;");  
        rs=ps.executeQuery();
        if(rs.next()){
        	
        	     an.setIdannonce(rs.getInt(1));
	 
        }
   
    }catch(Exception ex){ex.printStackTrace();}  
  
    return an;
	
	}

	@Override
	public Ncommentaire getNombreDeAnnonces() {
		// TODO Auto-generated method stub
		   Ncommentaire NA=new Ncommentaire();
	        Connection con = null;
	        Statement st = null;
	        ResultSet rs = null;

	        try {
	            con = daofactory.getConnection();
	            st = con.createStatement();
	            rs = st.executeQuery("SELECT count(IdAnnonce) FROM annonce;");

	           while (rs.next()) {
	              
	                 NA.setCount(rs.getInt(1));;
	                  
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return NA;
		
	}

	@Override
	public int deleteMember(int m) {
		// TODO Auto-generated method stub
		Connection con = null;
        PreparedStatement ps = null;
		int status=0; 
        try{
        	con=daofactory.getConnection();
            ps=con.prepareStatement("delete from annonce where IdMember="+m+";"); 
            status=ps.executeUpdate();
            
        }catch(Exception e){e.printStackTrace();}  
          
        return status;
		
	}

	
}