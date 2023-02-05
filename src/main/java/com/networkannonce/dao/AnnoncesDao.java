package com.networkannonce.dao;

import com.networkannonce.beans.*;
import java.util.List;

public interface AnnoncesDao {
	  
	 //CRUD Annonces
    int insert(Annonces A);
    int update(Annonces A);
    int delete(int idannonce);
    int deleteMember(int m);
    Annonces getAnnonceOnly(int idannonce);
    Annonces getAnnoncesById(int id );
    List<Annonces> getAllAnnoncesMember(int id);
    List<Annonces> getAllAnnonces();
    Annonces getMemberByIdAnnonce(int idannonce);
    Annonces getIdLastAnnonceInserted();
    Ncommentaire getNombreDeAnnonces();
    
}
