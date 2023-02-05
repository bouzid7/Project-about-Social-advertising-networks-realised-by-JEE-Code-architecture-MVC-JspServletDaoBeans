<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="file" tagdir="/WEB-INF/tags" %>

 <c:set var="root" value="${pageContext.request.contextPath}"/>
 
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
        <style>
                             
body {
  display: flex;
  justify-content: center;
  margin: 0;
  height: 100vh;
}

[id=toggle-heart] {
  position: absolute;
  left: -100vw;
}
[id=toggle-heart]:checked + label {
  color: #e2264d;
  will-change: font-size;
  animation: heart 1s cubic-bezier(0.17, 0.89, 0.32, 1.49);
}

[for=toggle-heart] {
  align-self: center;
  color: #aab8c2;
  font-size: 2em;
  cursor: pointer;
}

@keyframes heart {
  0%, 15% {
    font-size: 0;
  }
}
                       
       </style>
   
    <title> <c:out value="${m.nommember}"></c:out> &nbsp;<c:out value="${m.prenomsmember}"></c:out></title>
    <file:head/>
    
</head>
<body>
<div class="wrapper" >
  
  <file:header/>
<!-- =================== Dashboard ============== -->
    <main >
     
        <div class="main-section">
            <div class="container">
                <div class="main-section-data"> 
                    <div class="row">
                        <div class="col-lg-3 col-md-4 pd-left-none no-pd">
                            <div class="main-left-sidebar no-margin">
   
                            
 <!-- --------------------------PROFILE----------------------------------------------------------------------------------------------- -->                  
                            
                        
<div class="user-data full-width">  
    <div class="user-profile">
        <div class="username-dt">
            <div class="usr-pic">
                <img style="width:100%" src="${root}/${m.imagemember}" alt="">
             </div>
        </div>
        <div class="user-specs">
            <h4><c:out value=" ${m.nommember}"></c:out> &nbsp; <c:out value=" ${m.prenomsmember}"></c:out></h4>
            <span> <c:out value="${m.specialite}"></c:out> </span>
               <br><br>
             <span><c:out value="${m.emailmember}"></c:out> </span>
            
           <div style="margin-top:20px;">
             <span style="margin-right:100px;"><c:out value="${m.nfollwers }"></c:out> <c:out value="follwers"></c:out></span>
               <span> <c:out value="${m.nfollwing }"></c:out> <c:out value="follwing"></c:out></span>
             </div>
        </div>
          
        
        </div> 
        <a href="profile.jsp" title="">
        <ul class="user-fw-status">
            <li>
           Voir profil
            </li>
         </ul>
         </a>
         </div>
                            
 <!-- --------------------------PROFILE---------------------------------------------------------------------------- ---------->     
        
        
                            </div>
                        </div>
            
                        <div class="col-lg-6 col-md-8 no-pd"   style="overflow-y:scroll; height:600px;,margin-top:0px;">
                            <div class="main-ws-sec">
                                <div class="post-topbar p-0">
                                    <form action="/dashboard" method="POST" enctype="multipart/form-data">
                                        <div class="p-1">
                                            <textarea class="form-control rounded-0" name="contenu" style="border: 0px;resize:none;" rows="3" placeholder="Exprimez-vous..."></textarea>
                                        </div>
                                        <hr class="m-0">
                                    

                                            <label for="upload">
                                                <span class="la la-2x la-camera text-primary m-2" aria-hidden="true"></span>
                                                <input type="file" id="upload" name="image" style="display:none" accept="image/*">
                                            </label>

                                            <label for="upload3">
                                                <span class="la la-2x la-file-pdf-o text-primary m-2" aria-hidden="true"></span>
                                                <input type="file" id="upload3" name="file"  style="display:none" accept="file/pdf,file/ppt,file/word,file/txt">
                                            </label>

                                            <button style="border-radius:100px;" type="submit" class="btn btn-primary btn-sm pull-right rounded-0 m-2"> <c:out value="Publier"></c:out></button>
                                      
                                    </form>
                                </div>


                                 
<!-- ------------------------------------------------ test-------------------------------------------- ------------------------------------------------------------------------>
                                       
                                      <c:forEach items="${annoncesM}"   var="annoncesM" >
                                      
                                    <div class="post-topbar p-0"  style="border-radius:8%;overflow:hidden;">
                                     
                                     <div  style="padding:10px;margin-bottom:6%;margin-top:0%;margin-left:0%">
                                     <a   href="${root}/profile.jsp">
                                      <img style="border-radius:100px;width:60px;float:left;"  alt="" src="${root}/${m.imagemember}">
                                      <br>
                                 <strong style="margin-left:1%;margin-top:20px;font-size:15px"><c:out value="${m.nommember}"></c:out>&nbsp; <c:out value="${m.prenomsmember}"></c:out></strong>
                                        <p><c:out value="${m.specialite}"></c:out></p>
                                    </a>
                                    
                     
                      
   
                                    </div>
                                        <span   style="margin-left:10px;margin-right:10px;"><i class='fas fa-map-marker-alt' style='font-size:15px'><c:out value="rabat"></c:out></i></span>
                                     <div style="margin-left:10px;margin-right:10px;">
                                      
                                        
                                       <span> <c:out value="${annoncesM.titreannonce}"></c:out></span>
                                       <p> <c:out value="date de publication:"  /> <c:out value="${annoncesM.datedepotannonce }"></c:out> </p>
                                        <img style="width:100%;margin-bottom:100px;" alt="" src="${root}/${annoncesM.imageannonce }">
                                       
                                       
                                       
                                       
                                       
                                         
                                     <div class="post-topbar p-0"  style="border-top:1px solid #fff;border-radius:100px">
                                    
                                    <div class="">
                                 <a  href="#" onclick="_${annoncesM.idannonce}_des()"><span style="float:right;margin-right:10%"><i class="fa fa-comment-o" style="font-size:40px;"></i>10</span></a>
                                            
                                             <script type="text/javascript">
                                           
                                            	  function _${annoncesM.idannonce}_des()
                                            	  {
                                            		   
                                            		  
                                            		
                                            		if ( $(".post-comment"+${annoncesM.idannonce}+"").is(':hidden'))
                                            		{
                                            		
                                            		 $(".post-comment"+${annoncesM.idannonce}+"").attr("hidden",false);
                                            		
                                            	     }
                                            		
                                            		else
                                            		{
                                            			
                                            		 $(".post-comment"+${annoncesM.idannonce}+"").attr("hidden",true);
                                            		
                                            		 }
                                            		
                                            	
                                          	     }
                                            	
                                            	 
                                             </script>
                                   
                              <span style="float:left;margin-left:10%;">
                              <input id="toggle-heart" type="checkbox"/>
                              <label for="toggle-heart">❤</label>45    
                              </span> 
      
 
                                     </div>
                                     </div>
                                    
                                    
                                    
                                    
                                    
                                    
                                       <div class="post-comment${annoncesM.idannonce}" hidden >
                                        <div class="cm_img">
                                            <img  style="border-radius:100px;" height="40" src="${root}/${m.imagemember}"  alt="">
                                              </div>
                                              <form  style="margin-bottom:20px" action="#" method="post">

                                                 <div class="comment_box"  >
                                                    <input style="border-radius:100px;" type="text" placeholder="your comment" name="comment" >
                                                  </div>
                                         <div class="">
                                       <button style="border-radius:100px;" type="submit" name="commentaire" class="btn btn-primary  putll-righ rounded-0 ml-1">Post</button>
                                         </div>      
                                           </form>
                                            </div>
                                        
                             <!-- we are going to fetch all data refer to commnets-->   
                            
                            
                            
                                    
                                     
                                       
                                   
                                    <div  style="margin-bottom:15px;" class="post-comment${annoncesM.idannonce}" hidden >
                                      
                                        <div class="cm_img">
                                         <c:forEach items="${commentairesM}"   var="a" >
                                              <img  style="border-radius:100px;" height="40" src="${root}/${m.imagemember}"  alt="">
                                            
                                              <form  style="margin-bottom:20px" action="#" method="#">
                                                 <div class="comment_box"  >
                                             <input style="border-radius:100px;" type="text" value="${a.descriptioncommentaire}" name="comment" disabled>
                                                  </div>
                                              </form>
                                              </c:forEach>
                                               </div>
                                           
                                            </div>
                                            
                                            
                                    
                                
                                 
                                 
                                 
                                 
                             <!-- we are going to fetch all data refer to commnets-->
                       
                                       </div>
                              
                                   
                                </c:forEach>
                                    <!-- comment / likes -->
<!--------------------------------------------------test---------------------------------------------------------->
                        </div>
                    </div>
                    
                      
                </div>
               
                    
            </div>
            
<!--------------------------------------------------suggestion member-------------------------------->
       
             <div   style="float:right;margin-left:40px;">
             
               
               
<div  class="f1">
 <div class="header">
   <img alt="" src="${root}/public/images/su.png">&nbsp;<strong>Suggestions membres</strong>
  </div >
  <div>
                   <c:forEach  begin="1"   end="3">
             <div  style="padding:10px;margin-bottom:6%;margin-top:0%;margin-left:0%">
                                 
                                      <a   href="${root}/profile.jsp">
                                      <img style="border-radius:100px;width:45px;float:left;"  alt="" src="${root}/public/images/users/Arnold.jpg">
                                      <br>
                                      <strong style="margin-left:2 %;;font-size:13px">BOUZID Abdelfattah</strong>   
                                        <p style="font-size:10px;">Student Enginner</p>
                                      </a>
                                      
                                   <button  style="margin-left:20px;border-raduis:100px;" id="switch" name="s1" class="btn btn-primary"> 
                                        
                                      <i id="ss1" class="fa fa-plus" style="font-size:15px">&nbsp;suivre </i>
                                 
                                      </button>
                                          
                                    <script type="text/javascript">
                                     
                                          
                                          $(document).ready(function(){
                                    	    $("button#switch").click(function(){
                                    	     $("#ss1").replaceWith("<i id='ss1' class='fa fa-plus' style='font-size:15px'>&nbsp;suivre</i>");
                                    	      });
                                    	      });
                                             
                                          
                                        	 $(document).ready(function(){
                                           	  $("button#switch").click(function(){
                                           	    $("#ss1").replaceWith("<i id='ss1' class='fa fa-check' style='font-size:15px'>&nbsp;suivi</i>");
                                           	  });
                                           	});
                                        	
                                     </script>
                                   
                 
   </div>

               </c:forEach>                            
  </div>
</div>


                 
                    </div>
   
                    
        </div>
    </main>
    
<style>
div.f1{

 position:absolute;
 margin-top:0px;
 margin-right:100px;
 float:right;
 width: 250px;
 box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
 
}

div.header{
  background-color: #4CAF50;
  color: white;
  padding:10px;

}
div.header img{
   width:24px;
}

</style>
  
<!--------------------------------------------------suggestion member-------------------------------->
       
    <!-- =================== !Dashboard ============== -->
    <file:footer/>

    <file:foot/>
</div>
</body>
</html>
