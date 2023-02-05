package com.networkannonce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.networkannonce.beans.MessageToMember;
import com.networkannonce.beans.Ncommentaire;

public class sendMessageToMemberDaoImpl implements sendMessageToMemberDao  {
               
	    private DaoFactory daoFactory;

	    sendMessageToMemberDaoImpl (DaoFactory daoFactory) {
	    	
	    	 this.daoFactory = daoFactory;
	       } 
	
	
	@Override
	public int insert(MessageToMember A) {
		// TODO Auto-generated method stub
		    int status=0;  
		    Connection con = null;
	        PreparedStatement ps = null;
	       
	        try{
	        	
	            con=daoFactory.getConnection();
                ps=con.prepareStatement("insert into message(TitreMessage,Text_Message,DateMessageMember,IdMember,IdAnnonce) values (?,?,?,?,?);");
	            ps.setString(1,A.getTitremessage());
	            ps.setString(2,A.getTextmessage());  
	            ps.setString(3,A.getDatemessagemember());
	            ps.setInt(4,A.getIdmember());
	            ps.setInt(5,A.getIdannonce());
	            status=ps.executeUpdate();  
	              
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;   
	}

	@Override
	public int update(MessageToMember A) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public Ncommentaire getNombreDeMembers() {
		// TODO Auto-generated method stub
		  Ncommentaire NM=new Ncommentaire();
	        Connection con = null;
	        Statement st = null;
	        ResultSet rs = null;

	        try {
	            con = daoFactory.getConnection();
	            st = con.createStatement();
	            rs = st.executeQuery("SELECT count(IdMessage) FROM message;");

	           while (rs.next()) {
	              
	                 NM.setCount(rs.getInt(1));;
	                  
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return NM;
	}


	@Override
	public int deleteMember(int A) {
		// TODO Auto-generated method stub
		Connection con = null;
        PreparedStatement ps = null;
		int status=0; 
        try{
        	con=daoFactory.getConnection();
            ps=con.prepareStatement("delete from message where IdMember="+A+";"); 
            status=ps.executeUpdate();
            
        }catch(Exception e){e.printStackTrace();}  
          
        return status;
		
	}
	

}
