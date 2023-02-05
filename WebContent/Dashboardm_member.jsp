<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="file" tagdir="/WEB-INF/tags" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title> <c:out value="${m.nommember}"/>&nbsp;<c:out value="${m.prenomsmember}"/> </title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://kit.fontawesome.com/a1cc24eccd.js" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="${root}/public/css/home.css">
<link rel="stylesheet" type="text/css" href="${root}/public/css/style1.css">
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>

</head>
<body>
<section>


<!--  nabar-->

	<nav class="navbar navbar-expand-xl navbar-dark bg-dark">
		<a href="#" class="navbar-brand"><i class="fa fa-cube"></i><b>GoodDeals</b></a>  		
		<button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
			<span class="navbar-toggler-icon"></span>
		</button>
		<!-- Collection of nav links, forms, and other content for toggling -->
<div class="navbar-nav ml-auto" >  

  <a href="${root}/DeposerAnnonce?id=${m.idmember}" class="nav-item nav-link active t2"> <span>Déposser une annonce</span></a>
  
  <div class="btn-group ">
  <button type="button" class="btn btn-danger dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    <span class="sr-only"></span>
  </button>
  <div class="dropdown-menu">
  
    <a id="mesA" class="dropdown-item" href="${root}/AnnoncesServlet"><span>Mes annonces</span></a>
    <a class="dropdown-item" href="#"><span>Members</span></a>
    <a class="dropdown-item" href="#"><span>Messagerie</span></a>
    <a class="dropdown-item" href="Dashboardm_member.jsp"><span>Annonces</span></a>
     <a class="dropdown-item" href="#"><span>Favoris</span></a>
    <div class="dropdown-divider"></div>
    <a class="dropdown-item" href="${root}/Logout_servlet"><span>Déconnexion</span></a>
  </div>
			</div>
			<a href="#" class="nav-item nav-link active" style="background-color:red;"><span><i class="fa fa-user fa-3x"></i>&nbsp;<c:out value="${m.nommember}"/>&nbsp;<c:out value="${m.prenomsmember}"/></span></a>
		</div>
	</nav>
	
</section>


<section >
		    <h1 class="content">Bienvenue sur GoodDeals &nbsp;<c:out value="${m.nommember}"/></h1>
			<video autoplay loop muted plays-inline class="back-video">
		     <source src="${root}/public/video_animation/production ID 4183292.mp4" type="video/mp4">
		    </video>

		    <div class="form-search">
		    		 <form action="#" method="post" novalidate="novalidate">
            <div class="row">
                <div class="col-lg-12">
                    <div class="row">
                        <div class="col-lg-3 col-md-3 col-sm-12 p-0">
                            <input type="text" class="form-control search-slt" placeholder="Entrer les mots clés" name="motCles" required>
                        </div>
                        <div class="col-lg-3 col-md-3 col-sm-12 p-0">
                            <select class="form-control search-slt" id="exampleFormControlSelect1" name="Catégorie">
                                <option>Choisir la catégorie</option>
                                <optgroup label="INFORMATIQUE ET MULTIMEDIA">
                                    <option  value="Téléphone"> Téléphones </option>
                                    <option  value="Tablette"> Tablette</option>
                                    <option  value="Ordinateurs Portables"> Ordinateurs Portables </option>
                                    <option  value="Ordinateurs de Bureau"> Ordinateur de Bureau </option>
                                </optgroup>

                                <optgroup label="Véhicules">
                                    <option value="Voiture d'occasion"> Voitures d'occasion</option>
                                    <option value="Voiture de Location"> Voitures de Location </option>
                                </optgroup>

                                <optgroup label="Effets personnels"> 
                                    <option value="Objets perdus"> Objets perdus</option>
                                    <option  value="Objets retrouvés">Objets retrouvés </option>

                                </optgroup>


                            </select>
                        </div>
                        <div class="col-lg-3 col-md-3 col-sm-12 p-0">
                            <select class="form-control search-slt" id="exampleFormControlSelect1" name="Ville">
                                <option>Choisir la ville</option>
                                <option value="Agadir">Agadir</option>
                                <option value="Beni Mellal">Beni Mellal</option>
                                <option value="Berkhane">Berkhane</option>
                                <option value="Casablanca">Casanblaca</option>
                                <option value="Fès">Fès</option>
                                 <option value="Kénitra">Kénitra</option>
                                  <option value="Khémisset">Khémisset</option>
                                   <option value="Khourigba">Khouribga</option>
                                 <option value="Laayoune">Laayoune</option>
                                <option value="Marrakech">Marrakech</option>
                                <option value="Meknès">Meknès</option>
                                <option value="Mohammedia">Mohammédia</option>
                                <option value="Nador">Nador</option>
                                 <option value="Oujda">Oujda</option>
                                  <option value="Rabat">Rabat</option>
                                   <option value=" El Jadida">El Jadida</option>

                                
                            </select>
                        </div>
                        <div class="col-lg-3 col-md-3 col-sm-12 p-0">
                            <button type="button" class="btn btn-danger wrn-btn">Search</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>

		    </div>


    </section>

<!--   Les annonces -->

<section class="the-cards">

<!-- SHADOW ANNONCE -->
    <div  id="mesA">
        
        <div class="gallery">

          <c:forEach  var="a"  items="${annoncesM}">
          <c:forEach  var="ph"  items="${gb}">
            
            <c:if test="${a.idannonce==ph.idannonce}">
            <div class="contents">
             <span style="margin-left:400px;">
             <a href="${root}/AnnonceUpdatedBySonmember?id=${a.idannonce}&&idM=${m.idmember}"> <i class="fa fa-edit" style="font-size:25px;color:red"></i> </a>  
             <a href="${root}/AnnonceDeletedBySonmember?id=${a.idannonce}">  <i class="fa fa-trash-o" style="font-size:25px;color:red"></i> </a>
             </span>
                <img src="${root}/${ph.imageannonce}" alt="Aucune photo">
                  
                 <!-- Prix -->
                <p></p>
                <!--  TItre -->
               <h3><c:out value="${a.titreannonce}"></c:out></h3>
                <ul>
                    <li> <i class="fa fa-star checked"></i> </li>
                    <li> <i class="fa fa-star checked"></i> </li>
                    <li> <i class="fa fa-star checked"></i> </li>
                    <li> <i class="fa fa-star "></i> </li>
                    <li> <i class="fa fa-star "></i> </li>
                </ul>
                 <!--Date depôt-->
                 <h6><c:out value="${a.datedepotannonce}"></c:out> </h6>
                   <div  style="border-top:1px solid #fff;margin-top:10px;">  
                             <a  href="#" onclick=""><span style="float:right;margin-right:10%;color:grey;">
                             <i class="fa fa-comment-o" style="font-size:40px;"></i>
                              <c:forEach  var="nc"  items="${noc}">
                               <c:if test="${nc.idannonce==a.idannonce}">
                               <c:out value="${nc.count}"/>
                               </c:if>

                             </c:forEach>
                             </span>
                             </a>
                            
                              <span style="float:left;margin-left:10%;color:grey;">
                              <input id="toggle-heart" type="checkbox"/>
                              <label for="toggle-heart">❤</label><c:out value="${a.nombrelike}"></c:out>
                              </span>
                              </div>
                              
                <a href="${root}/DetailAnnonceMemberInscrit?idannonce=${a.idannonce}">
                
                  
                 <button class="buy">
                  Détail
                 </button>
                 </a>
                 
                
               
                              
                              
                              
            </div>
            </c:if>
            </c:forEach>
             </c:forEach>
            
            
            
            
            
            
            



        </div>
    
    </div>
    
    <!-- SHADOW ANNONCE -->
    
<!--   Pieds de page -->

    <div class="footer-cards"> 
        <div class="footer">
        <div class="col1">
            <h3> LIENS UTILES</h3>
            <a href="#"> About</a>
            <a href="#"> Contact</a>
        </div>
     <div class="col2">
        <h3> NEWSLETTER</h3>
        <form action="#" method="POST">
            <input type="email" placeholder="Taper votre addresse mail" required />
            <br>
            <button type="submit"> S'abonner maintenant</button> 
        </form>
     </div>
     <div class="col3">
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

</body>
</html>