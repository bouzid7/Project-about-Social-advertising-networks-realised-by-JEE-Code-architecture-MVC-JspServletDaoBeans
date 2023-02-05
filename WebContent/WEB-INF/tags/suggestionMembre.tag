 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <c:set var="root" value="${pageContext.request.contextPath}"/>

<div  class="f1">
 <div class="header">
   <img alt="" src="${root}/public/images/su.png">&nbsp;<strong>Suggestions membres</strong>
  </div >
  <div>
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
                                       
  </div>
</div>


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