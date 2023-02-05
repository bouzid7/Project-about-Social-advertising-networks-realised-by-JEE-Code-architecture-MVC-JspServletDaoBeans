package com.networkannonce.beans;

public class Member {

	private int idmember;
    private String nommember;
    private String prenomsmember;
    private String  emailmember;
    private String specialite;
    private String  addressmember;
    private String telephonemember ;
    private String  dateinscriptionmember;
    private String typemember;
    private String passwordmember;
    private String passwordmemberconfirm;
    private int nfollwing ;
    private int nfollwers;

    // getters 
    
    public int getIdmember()
    {
    	   return this.idmember;
    }
    
    public String getNommember()
    {
    	  return this.nommember;
    }
    
    public String getPrenomsmember()
    {
    	return this.prenomsmember;
    }
    
    public String getEmailmember()
    {
    	return this.emailmember;
    }
    
    public String 	getSpecialite()
    {
    	return this.specialite;
    }
    
    public String  getAddressmember()
    {
    	  return this.addressmember;
    }
    
    public String getTelephonemember()
    {
    	return this.telephonemember;
    }
    
    public String getDateinscriptionmember()
    {
    	  return this.dateinscriptionmember;
    }
    
    public String getTypemember()
    {
    	  return this.typemember;
    }
    
    public String getPasswordmember()
    {
    	   return this.passwordmember;
    }
    
    public String getPasswordmemberconfirm()
    {
    	   return this.passwordmemberconfirm;
    }

    
    public int getNfollwing()
    {
    	  return this.nfollwing;
    }
    
    public int getNfollwers()
    {
    	return this.nfollwers;
    }
    
   
    
/////// setters  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void setIdmember(int idm)
    {
    	   this.idmember=idm;
    }
    
    public void setNommember(String nm)
    {
    	this.nommember=nm;
    }
    
    public void setPrenomsmember(String pm)
    {
    	this.prenomsmember=pm;
    }
    
    public void setEmailmember(String em)
    {
    	 this.emailmember=em;
    }
    
    public void setSpecialite(String s)
    {
    	this.specialite=s;
    }
    
    public void setAddressmember(String am)
    {
    	 this.addressmember=am;
    }
    
    public void setTelephonemember(String tm)
    {
    	this.telephonemember=tm;
    }
    
    public void setDateinscriptionmember(String dim)
    {
    	this.dateinscriptionmember=dim;
    }
    
    public void setTypemember(String tm)
    {
    	 this.typemember=tm;
    }
    
    public void setPasswordmember(String pm)
    {
    	  this.passwordmember=pm;
    }
    
    public void setPasswordmemberconfirm(String pm)
    {
    	  this.passwordmemberconfirm=pm;
    }
    
    public void setNfollwing(int nf)
    {
    	  this.nfollwing=nf;
    }
    
    public void setNfollwers(int nf)
    {
    	   this.nfollwers=nf;
    }
    
   
    @Override
    public String toString() 
    
                           {
    	
		    return "{" + "idmember=" + getIdmember() + ",nommember =" + getNommember() + ", prenomsmember=" +getPrenomsmember() + 
		    		 ",emailmember =" + getEmailmember() + ",specialite =" + getSpecialite() + ",addressmember =" + getAddressmember() +
		    		 ", telephonemember =" + getTelephonemember()  + ",dateinscriptionmember =" + getDateinscriptionmember() + 
		    		 ",typemember =" + getTypemember()  + ", passwordmember =" + getPasswordmember() + ", passwordmemberconfirm =" + getPasswordmemberconfirm() + 
		    	 ", nfollwing =" + getNfollwing()  + ", nfollwers =" + getNfollwers()  + "}";
		    
		                    }
    
}
