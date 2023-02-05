package com.networkannonce.beans;

public class PhotosAnnonce {

	private int idphotoannonce;
	private String imageannonce;
	private int idannonce;
	
	//getters 
	
	public int getIdphotoannonce() {
		return this.idphotoannonce;
	}
	
	public String getImageannonce() {
		return this.imageannonce;
	}
	
	public int getIdannonce() {
		return this.idannonce;
	}
	
	//setters 
	
	public void setIdphotoannonce(int idphan) {
		this.idphotoannonce=idphan;
	}
	
	public void setImageannonce(String ian) {
		this.imageannonce=ian;
	}
	
	public void setIdannonce(int idan) {
		this.idannonce=idan;
	}
	
  /////////////////////////////////////////////////////////////
	 @Override
	  public String toString()
	  
            {
  return '{' + "idphotoannonce=" + getIdphotoannonce() +  ",imageannonce=" + getImageannonce() + ",idannonce=" +getIdannonce()+'}';
		    }
       

}
