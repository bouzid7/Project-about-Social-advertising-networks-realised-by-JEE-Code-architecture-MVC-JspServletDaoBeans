package com.networkannonce.dao;
import com.networkannonce.beans.*;
import java.util.*;
public interface PhotosAnnonceDao {
	
	 //CRUD Annonces 
    int insert(PhotosAnnonce A);
    int update(PhotosAnnonce A);
    int delete(PhotosAnnonce A);
    PhotosAnnonce getPhotosAnnonceById(int id );
    PhotosAnnonce getAllPhotosAnnonceByIdAnnonceGroupBy(int idannonce);
    List<PhotosAnnonce> getAllPhotosAnnonceByIdAnnonceTout(int idannonce);
    List<PhotosAnnonce> getAllPhoto();
    
}
