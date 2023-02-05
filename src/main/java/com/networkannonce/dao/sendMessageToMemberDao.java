package com.networkannonce.dao;
import java.util.*;
import com.networkannonce.beans.*;

public interface sendMessageToMemberDao {
	//CRUD Annonces 
    int insert(MessageToMember A);
    int update(MessageToMember A);
    int deleteMember(int A);
    Ncommentaire getNombreDeMembers();

}
