package com.networkannonce.beans;

public class MessageToMember {
	     
	
	 private int idmessage;
     private String titremessage;
     private String textmessage;
     private String datemessagemember;
     private int idmember;
     private int idannonce;
   
     
     //getters 
     
     public int getIdmessage()
     {
    	 return this.idmessage;
     }
     
     public String getTitremessage()
     {
    	 return this.titremessage;
     }
     
     public String  getTextmessage()
     {
    	 return this.textmessage;
     }
     
     public String  getDatemessagemember()
     {
    	 return this.datemessagemember;
     }
     
     public int getIdannonce()
     {
    	 return this.idannonce;
     }
     
     public int   getIdmember()
     {
    	 return this.idmember;
     }
     
    
     //setters 
     
     
     public int setIdmessage(int id)
     {
    	 return this.idmessage=id;
     }
     
     public String setTitremessage(String tm)
     {
    	 return this.titremessage=tm;
     }
     
     public String  setTextmessage(String tm)
     {
    	 return this.textmessage=tm;
     }
     
     public String  setDatemessagemember(String dm)
     {
    	 return this.datemessagemember=dm;
     }
     
     
     public void setIdannonce(int ida)
     {
    	 this.idannonce=ida;
     }
     
    
     public void setIdmember(int idm) 
     {
    	        this.idmember=idm;
     }
     
    
     
     @Override
	  public String toString()
	  
           {
   	
   return '{' + "idmessage=" + getIdmessage() +  ",titremessage=" + getTitremessage() + ",textmessage=" +getTextmessage() +  ", datemessagemember =" + getDatemessagemember() +  ",idmember =" + getIdmember() +  ",idannonce=" + getIdannonce() + '}';

		    }

}
