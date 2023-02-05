package com.networkannonce.dao;

import com.networkannonce.beans.*;
import java.util.*;

public interface CommentairesDao {
	
	  //CRUD commentaires
    int insert(Commentaires C);
    int update(Commentaires C);
    int delete(int C );
    int deleteMember(int C);
    Commentaires getCommentairesById(int id );
    List<Commentaires> getAllCommentairesAnnonce(int ida);
    List<Commentaires> getAllCommentairesMember(int idm);
    List<Ncommentaire> getNombreCommentairesAnnonce();
    Ncommentaire getNombreDeCommentairesAnnonce(int idannonce);
    
}
