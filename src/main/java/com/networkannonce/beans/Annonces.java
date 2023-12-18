package com.networkannonce.beans;

public class Annonces {

     private int idannonce;
     private String titreannonce;
     private String descriptionannonce;
     private String  datedepotannonce ;
     private String etatannonce ;
     private int nombrelike;
     private String villeannonce ;
     private int idmember ;
	//modification by amine_branch
   
     
     //getters 
     
     public int getIdannonce()
     {
    	 return this.idannonce;
     }
     
     
     public String getTitreannonce()
     {
    	 return this.titreannonce;
     }
     
     public String  getDescriptionannonce()
     {
    	 return this.descriptionannonce;
     }
     
     public String  getDatedepotannonce()
     {
    	 return this.datedepotannonce;
     }
     
     public String  getEtatannonce()
     {
    	 return this.etatannonce;
     }
     
     public int  getNombrelike()
     {
    	 return this.nombrelike;
     }
    
     public String  getVilleannonce()
     {
    	 return this.villeannonce;
     }
     
     public int   getIdmember()
     {
    	 return this.idmember;
     }
     
    
    
     //setters 
     
     public void setIdannonce(int ida)
     {
    	 this.idannonce=ida;
     }
     
     public void setTitreannonce(String ta)
     {
    	     this.titreannonce=ta;
     }
     
     public void setDescriptionannonce(String da)
     {
    	   this.descriptionannonce=da;
     }
    
     public void setDatedepotannonce(String dda)
     {
    	    this.datedepotannonce=dda;
     }
     
     
     public void setEtatannonce(String ea) 
     {
    	    this.etatannonce=ea;
     }
     
     
     public void setNombrelike(int  nl) 
     {
    	     this.nombrelike=nl;
     }
     
     public void setVilleannonce(String va) 
     {
    	      this.villeannonce=va;
     }
     
     
     public void setIdmember(int idm) 
     {
    	        this.idmember=idm;
     }
     

     @Override
	  public String toString()
	  
           {
   	
   return '{' + "idannonce=" + getIdannonce() +  ",titreannonce=" + getTitreannonce() + ", descriptionannonce=" +getDescriptionannonce() +  ", datedepotannonce =" + getDatedepotannonce() + ",etatannonce =" + getEtatannonce() +  ",nombrelike =" + getNombrelike() +",villeannonce =" + getVilleannonce() + ",idmember =" + getIdmember() + '}';

		    }
        
}

