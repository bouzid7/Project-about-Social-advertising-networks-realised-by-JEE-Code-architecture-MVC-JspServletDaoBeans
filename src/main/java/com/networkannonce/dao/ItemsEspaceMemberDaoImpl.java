package com.networkannonce.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.networkannonce.beans.ItemsEspaceMember;

public class ItemsEspaceMemberDaoImpl implements ItemsEspaceMemberDao {
	
	    private DaoFactory daofactory;  
		public ItemsEspaceMemberDaoImpl (DaoFactory daofactory) {
			// TODO Auto-generated constructor stub
			   this.daofactory=daofactory;
		}

	@Override
	public ItemsEspaceMember getAllitemsEspaceMember(int idmember) {
		// TODO Auto-generated method stub
		//  List<ItemsEspaceMember> itemsespacemember = new ArrayList<ItemsEspaceMember>();
		    ItemsEspaceMember an = new ItemsEspaceMember();
	        Connection con = null;
	        Statement st = null;
	        ResultSet rs = null;

	        try {
	            con = daofactory.getConnection();
	            st = con.createStatement();
rs = st.executeQuery("select * from annonce a,member m,photosannonce ph where a.IdMember="+idmember+" and m.IdMember="+idmember+" and ph.IdAnnonce=a.IdAnnonce;");

	            while (rs.next()) {
	                
	                an.setIdannonce(rs.getInt(1));
	                an.setTitreannonce(rs.getString(2));
	                an.setDescriptionannonce(rs.getString(3));
	                an.setDatedepotannonce(rs.getString(4));
	                an.setEtatannonce(rs.getString(5));
	                an.setNombrelike(rs.getInt(6));
	                an.setVilleannonce(rs.getString(7));
	                an.setIdmembera(rs.getInt(8));
	                
	                an.setIdmember(rs.getInt(9));
	                an.setNommember(rs.getString(10));
	                an.setPrenomsmember(rs.getString(11));
	                an.setEmailmember(rs.getString(12));
	                an.setSpecialite(rs.getString(13));
	                an.setAddressmember(rs.getString(14));
	                an.setTelephonemember(rs.getString(15));
	                an.setDateinscriptionmember(rs.getString(16));
	                an.setTypemember(rs.getString(17));
	                an.setPasswordmember(rs.getString(18));
	                an.setPasswordmemberconfirm(rs.getString(19));
	                an.setNfollwing(rs.getInt(20));
	                an.setNfollwers(rs.getInt(21));
	                
	                an.setIdphotoannonce(rs.getInt(22));
	                an.setImageannonceph(rs.getString(23));
	                an.setIdannonceph(24);
	               // itemsespacemember.add(an);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return an;
	}

}