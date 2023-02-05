package com.networkannonce.beans;

public class Commentaires {
     
      private int idcommentaire ;
      private String descriptioncommentaire;
      private int idmember;
      private int idannonce;
      // getters 
      
      public int  getIdcommentaire()
      {
    	    return this.idcommentaire;
      }
      
      public int getIdmember()
      {
    	  return this.idmember;
      }
      
      public int getIdannonce()
      {
    	  return this.idannonce;
      }

      
      public String getDescriptioncommentaire()
      {
    	   return this.descriptioncommentaire;
      }
      
      
      // setters 
      
      public void setIdcommentaire(int i)
      {
    	  this.idcommentaire=i;
      }
      
      public void setIdmember(int id)
      {
    	  this.idmember=id;
      }
      
      public void setIdannonce(int id)
      {
    	  this.idannonce=id;
      }
      
      public void setDescriptioncommentaire(String c)
      {
    	  this.descriptioncommentaire=c;
      }
      
     
      @Override
      public String toString() 
                             {
      return "{" + "idcommentaire=" + getIdcommentaire() +  ",descriptioncommentaire=" + getDescriptioncommentaire()  + ",idmember=" +getIdmember() + ",idannonce =" + getIdannonce() +  "}";
  		                     }
      
}
