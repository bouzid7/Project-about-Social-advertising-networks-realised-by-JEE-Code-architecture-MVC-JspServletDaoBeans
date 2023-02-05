package com.networkannonce.dao;

import java.util.List;
import com.networkannonce.beans.Member;
import com.networkannonce.beans.Ncommentaire;

public interface MemberDao {

	 //CRUD commentaires
    int insert(Member U);
    int update(Member U);
    int delete(int U);
    Member getMemberById(String username,String password);
    List<Member>getAllMembers();
    boolean validate(String username,String password);
    Member getMember(int idmember);
    Ncommentaire getNombreDeMembers();
    
}
