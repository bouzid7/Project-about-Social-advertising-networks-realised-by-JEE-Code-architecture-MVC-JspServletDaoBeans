<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="file" tagdir="/WEB-INF/tags" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>GoodDeals.Détail.com</title>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.0.7/css/swiper.min.css">
<link rel="stylesheet" type="text/css" href="${root}/public/css/HomeDetail.css">
<link rel="stylesheet" type="text/css" href="${root}/public/css/style1.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"  />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" >
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://kit.fontawesome.com/a1cc24eccd.js" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="${root}/public/css/home.css">
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>



</head> 
<body>

<!--  nabar-->
<section >
	<nav class="navbar navbar-expand-xl navbar-dark bg-dark">
		<a href="#" class="navbar-brand"><i class="fa fa-cube"></i><b>GoodDeals</b></a>  		
		<button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
			<span class="navbar-toggler-icon"></span>
		</button>
		<!-- Collection of nav links, forms, and other content for toggling -->
		<div id="navbarCollapse" class="collapse navbar-collapse justify-content-start">		
			<div class="navbar-nav ml-auto">
				<a href="#" class="nav-item nav-link active t1"> <span>Home</span></a>
				
			</div>
		</div>
	</nav>
</section>


<!--- -->
<section>
	

	<div class="swiper-container">
                
                <div class="swiper-wrapper">
                
                 <c:forEach  items="${photosA}"  var="p">
                  <div class="swiper-slide card">
                    <div class="slide-inner">
                      <img src="${root}/${p.imageannonce}">
                    </div>
                  </div>
                  </c:forEach>
              </div>



                <div class="swiper-button-next swiper-button-white"></div>
                <div class="swiper-button-prev swiper-button-white"></div>
              </div>
</section>

  <section class="BackDetail">
      <div class="container">
  <div class="row">
    <div class="col-md-10">
        <p>   <c:out value="date de publication"/> &nbsp;<c:out value="${annOnly.datedepotannonce}"></c:out></p>
    </div>
    <div  class="col">
        <span style="float:left;margin-left:10%;color:white;">
                           
                          
                              <input  onclick="rps()" id="toggle-heart" type="checkbox"/>
                              <label for="toggle-heart">❤</label>
                             
                               <span  id="computerScore" data-value="${annOnly.nombrelike}">
                              <c:out value="${annOnly.nombrelike}"></c:out>
                              </span>
                              
                              </span>
                               <a  href="#commM" onclick="" ><span style="float:right;margin-right:10%;color:white;">
                             <i class="fa fa-comment-o" style="font-size:40px;"></i>
                             <span> <c:out value="${nombreC.count}"/> </span> 
                             </span>
                             </a>
                             
                            

     <script type="text/javascript">
    
     var computerScore = document.getElementById('computerScore');
     function rps() {
     var checkBox = document.getElementById("toggle-heart");
     if (checkBox.checked == true){
     computerScore.dataset.value++;
     computerScore.innerHTML = computerScore.dataset.value;
        var i=$('#computerScore').data('value');
       
     }
     else{
         computerScore.dataset.value--;
         computerScore.innerHTML = computerScore.dataset.value;
        var i=$('#computerScore').data('value')-1;
     }
     
   
     
     
     }
     
 
     
    	
         	 
         	
         	
     
     </script>
                 
                             
      
    </div>
    
  </div>
</div>


       <div class="div7">   
       </div>

        <table>
          <tr>
           <th class="col-md-6"><i class="fa-sharp fa-solid fa-circle-user fa-7x "></i> <c:out value="${memberA.nommember}" />&nbsp;<c:out value="${memberA.prenomsmember}"/></th>     
            <th class="col-md-4">
            
            <a href="#" class="btn btn-primary"  style="margin-left:20px;border-raduis:100px;" id="toggleBtn"> 
                       Suivi
                      
                    <script type="text/javascript">
                       const toggleBtn = document.querySelector("#toggleBtn");

                       toggleBtn.addEventListener("click", function() {
                         if (toggleBtn.textContent === " Suivi") {
                           toggleBtn.textContent = "+ Suivre";
                         } else {
                           toggleBtn.textContent = " Suivi";
                         }
                       });
                              
                    </script> 
                    
                        
               </a>
         
           <a href="sendMessageToMember.jsp?NomMember=${memberA.nommember}&&IdMember=${memberA.idmember}&&IdAnnonce=${annOnly.idannonce}" class="btn  btn-success" style="margin-left:100px;"> <p> Envoyer un message</p></a>
           
           </th> 
           
          </tr>
        </table>

          
        <div class="div8">
      </div>

       <div class="div1">
        <p> <c:out value="${annOnly.titreannonce}"></c:out></p>
      </div>

       <div class="div2">
       <p>  <c:out value="${annOnly.descriptionannonce}"></c:out></p>
         </div>

       <div class="div6">
       <a href="#">  <p> Signaler l'annonce </p></a>
      </div>
    
</section>

<section class="CommentaireBlocs "> 

<div class="container">
 <strong>  <h3>Commentaires:</h3> </strong>
 
 
 <!-- if allMember.idmember=commentaire.idmember -->
   <c:forEach items="${commentairesA}"  var="c">
   <c:if test="${c.idannonce==annOnly.idannonce}">
    <c:forEach items="${allM}"  var="m">
   <c:if test="${c.idmember==m.idmember}">
   
<div class="row row1">
    <div class="col-md-4">
      <i  style="color:white;" class="fa-sharp fa-solid fa-circle-user fa-4x "></i>
      <italic  style="color:white;font-size:13px;"> <c:out  value="${m.nommember}"/>&nbsp;<c:out  value="${m.prenomsmember}"/> </italic>
    </div>
      <p> <c:out  value="${c.descriptioncommentaire}"/> </p>
        <hr>
      
 </div>
 </c:if>
 </c:forEach>
 </c:if>
 </c:forEach>
 
<!---- Fin du commentaire-member  -->
     
     
  
     <div class="row"  id="commM">
       <form action="${root}/AjouterCommentaire" method="Post">
        <label for="commentaire">Commentaire:</label>
         <textarea class="form-control" placeholder="Laissez-nous un commentaire !" id="commentaire" name="commentaire" >  
         </textarea>
          <input name="idmember" value="${idmember}"  hidden>
          <input name="idannonce" value="${annOnly.idannonce}"  hidden>
          <input name="previousPath" value="<%= request.getRequestURL()%>"  hidden>

        <input class="btn btn-primary" type="submit" name="Ajouter" value="Ajouter"> 
       </form>
      </div>
    

</div>

</section>


<!-- Pied de page -->

<section >
  
    <div class="footer-cards"> 
        <div class="footer">
        <div class="coll1">
            <h3> LIENS UTILES</h3>
            <a href="#"> About</a>
            <a href="#"> Contact</a>
        </div>
     <div class="coll2">
        <h3> NEWSLETTER</h3>
        <form action="#" method="POST">
            <input type="email" placeholder="Taper votre addresse mail" required />
            <br>
            <button type="submit"> S'abonner maintenant</button> 
        </form>
     </div>
     <div class="coll3">
        <h3> CONTACT</h3>
        <p>Avenue Mohamed Ben Abdellah, Av. Regragui, Rabat</p>
        <div class="social-icons"> 
            <i class="fab fa-facebook"></i>
            <i class="fab fa-twitter"></i>
            <i class="fab fa-instagram"></i>
            <i class="fab fa-behance"></i>
        </div>
     </div> 
    </div>
    </div> 
</section>




<script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.0.7/js/swiper.min.js"></script>
 <script src="${root}/public/js/HomeDetail.js"></script>
</body>
</html>