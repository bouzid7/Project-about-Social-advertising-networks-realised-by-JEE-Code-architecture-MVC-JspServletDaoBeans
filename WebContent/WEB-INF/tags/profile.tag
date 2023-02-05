 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <c:set var="root" value="${pageContext.request.contextPath}"/>

<div class="user-data full-width">  
    <div class="user-profile">
        <div class="username-dt">
            <div class="usr-pic">
                <img style="width:100%" src="${root}/public/images/annonce1.gif" alt="">
             </div>
        </div>
        <div class="user-specs">
            <h4><c:out value=" nom complet"/></h4>
            <span> <c:out value="specialite"></c:out> </span>
               <br><br>
             <span><c:out value="description"></c:out> </span>
            
           <div style="margin-top:20px;">
             <span style="margin-right:100px;"><c:out value="120"></c:out> <c:out value="follwers"></c:out></span>
               <span> <c:out value="13"></c:out> <c:out value="follwing"></c:out></span>
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
