package com.networkannonce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.networkannonce.beans.Member;
import com.networkannonce.beans.Ncommentaire;


public class MemberDaoImpl implements MemberDao {
	
    private DaoFactory daofactory;
    
	MemberDaoImpl(DaoFactory daofactory) {
		// TODO Auto-generated constructor stub
    	 this.daofactory=daofactory;
	}

	@Override
	public int insert(Member U) {
		// TODO Auto-generated method stub
		    int status=0;  
		    Connection con = null;
	        PreparedStatement ps = null;
	       
	        try{
	        	
	        	con=daofactory.getConnection();   
                ps=con.prepareStatement("insert into member(NomMember,PrenomsMember,TelephoneMember,EmailMember,PasswordMember,PasswordMemberConfirm) values (?,?,?,?,?,?)"); 

	            ps.setString(1,U.getNommember());  
	            ps.setString(2,U.getPrenomsmember());  
	            ps.setString(3,U.getTelephonemember());  
	            ps.setString(4,U.getEmailmember());
	            ps.setString(5,U.getPasswordmember());
	            ps.setString(6,U.getPasswordmemberconfirm());
	           
	            status=ps.executeUpdate();  
	              
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status; 
		
		}

	@Override
	public int update(Member U) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int U) {
		// TODO Auto-generated method stub
		Connection con = null;
        PreparedStatement ps = null;
		int status=0; 
        try{
        	con=daofactory.getConnection();
            ps=con.prepareStatement("delete from member where IdMember="+U+";"); 
            status=ps.executeUpdate();
            
        }catch(Exception e){e.printStackTrace();}  
          
        return status;
	}
	
	
	@Override
	public Member getMemberById(String username,String password) {
		// TODO Auto-generated method stub
	   //  List<Member> member = new ArrayList<Member>();
		    Member  m=new Member();
	        Connection con = null;
	        PreparedStatement ps = null;
	        ResultSet rs = null;
     
     try{
     	 con=daofactory.getConnection();   
         ps=con.prepareStatement("SELECT * FROM gestion_annonces.member where EmailMember=? and PasswordMember=?;");  
         ps.setString(1,username);
         ps.setString(2,password);
         rs=ps.executeQuery();
         if(rs.next()){
        	 
                 m.setIdmember(rs.getInt(1));
                 m.setNommember(rs.getString(2));
                 m.setPrenomsmember(rs.getString(3));
                 m.setEmailmember(rs.getString(4));
                 m.setSpecialite(rs.getString(5));
                 m.setAddressmember(rs.getString(6));
                 m.setTelephonemember(rs.getString(7));
                 m.setDateinscriptionmember(rs.getString(8));
                 m.setTypemember(rs.getString(9));
                 m.setPasswordmember(rs.getString(10));
                 m.setPasswordmemberconfirm(rs.getString(11));
                 m.setNfollwing(rs.getInt(12));
                 m.setNfollwers(rs.getInt(13));
                 
                // member.add(m);
                 
         }
    
     }catch(Exception ex){ex.printStackTrace();}  
       
     //return member;
       return m;
     
	}


	@Override
	public List<Member>getAllMembers() {
		// TODO Auto-generated method stub
		    List<Member> members = new ArrayList<Member>();
	        Connection con = null;
	        Statement st = null;
	        ResultSet rs = null;

	        try {
	            con = daofactory.getConnection();
	            st = con.createStatement();
	            rs = st.executeQuery("SELECT * FROM gestion_annonces.member;");

	            while (rs.next()) {
	            	
	                Member u = new Member();
	                u.setIdmember(rs.getInt(1));
	                u.setNommember(rs.getString(2));
	                u.setPrenomsmember(rs.getString(3));
	                u.setEmailmember(rs.getString(4));
	                u.setSpecialite(rs.getString(5));
	                u.setAddressmember(rs.getString(6));
	                u.setTelephonemember(rs.getString(7));
	                u.setDateinscriptionmember(rs.getString(8));
	                u.setTypemember(rs.getString(9));
	                u.setPasswordmember(rs.getString(10));
	                u.setPasswordmemberconfirm(rs.getString(11));
	                u.setNfollwing(rs.getInt(12));
	                u.setNfollwers(rs.getInt(13));
	                members.add(u);
	               
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return members;
	}

	@Override
	public boolean validate(String username,String password) { 
		boolean status=false;  
		 Connection con = null;
		 PreparedStatement  ps = null;
	     ResultSet rs = null;
		try{
	    con = daofactory.getConnection();
		ps=con.prepareStatement("select EmailMember,PasswordMember from gestion_annonces.member where EmailMember=? and PasswordMember=?;");  
		ps.setString(1,username);
		ps.setString(2,password);
	    rs=ps.executeQuery();  
		status=rs.next();
		}catch(Exception e){
			
			System.out.println(e);
			
	    }
		return status;  
		
		}

	@Override
	public Member getMember(int idmember) {
		// TODO Auto-generated method stub
		   Member  m=new Member();
	        Connection con = null;
	        PreparedStatement ps = null;
	        ResultSet rs = null;
    
    try{
    	 con=daofactory.getConnection();   
        ps=con.prepareStatement("SELECT * FROM gestion_annonces.member where IdMember="+idmember+";");
        rs=ps.executeQuery();
        if(rs.next()){
       	 
                m.setIdmember(rs.getInt(1));
                m.setNommember(rs.getString(2));
                m.setPrenomsmember(rs.getString(3));
                m.setEmailmember(rs.getString(4));
                m.setSpecialite(rs.getString(5));
                m.setAddressmember(rs.getString(6));
                m.setTelephonemember(rs.getString(7));
                m.setDateinscriptionmember(rs.getString(8));
                m.setTypemember(rs.getString(9));
                m.setPasswordmember(rs.getString(10));
                m.setPasswordmemberconfirm(rs.getString(11));
                m.setNfollwing(rs.getInt(12));
                m.setNfollwers(rs.getInt(13));
                
               // member.add(m);
                
        }
   
    }catch(Exception ex){ex.printStackTrace();}  
      
    //return member;
      return m;
    
	}

	@Override
	public Ncommentaire getNombreDeMembers() {
		// TODO Auto-generated method stub
		  Ncommentaire NM=new Ncommentaire();
	        Connection con = null;
	        Statement st = null;
	        ResultSet rs = null;

	        try {
	            con = daofactory.getConnection();
	            st = con.createStatement();
	            rs = st.executeQuery("SELECT count(IdMember) FROM member;");

	           while (rs.next()) {
	              
	                 NM.setCount(rs.getInt(1));;
	                  
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return NM;
	}

}