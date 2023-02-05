package com.networkannonce.beans;

public class Ncommentaire {

	  private int idannonce;
	  private int count;
	      
	 //getters 
	  
	  public int getIdannonce() {
		  return this.idannonce;
	  }
	  
	  public int getCount() {
		  return this.count;
	  }
	  
	  //setters 
	  
	  public void setIdannonce(int id) {
		    this.idannonce=id;
	  }
	  public void setCount(int c ) {
		    this.count=c;
	  }
	  
	  
       @Override
	  public String toString() 
          {
		    return '{' + "idannonce=" + getIdannonce() +  ",count=" + getCount() +'}';
		  }
       
}