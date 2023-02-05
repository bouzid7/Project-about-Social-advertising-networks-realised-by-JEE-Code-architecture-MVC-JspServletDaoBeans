<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:400,700">
<title>editer une annonce</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="${root}/public/css/formulairedeposerannoncemember.css">
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
    <div id="navbarCollapse" class="collapse navbar-collapse justify-content-start">    
      <div class="navbar-nav ml-auto" >  
  <div class="btn-group ">
  <button type="button" class="btn btn-danger dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    <span class="sr-only"></span>
  </button>
  <div class="dropdown-menu">
  
    <a id="mesA" class="dropdown-item" href="#"><span>Mes annonces</span></a>
    <a class="dropdown-item" href="#"><span>Members</span></a>
    <a class="dropdown-item" href="#"><span>Messagerie</span></a>
    <a class="dropdown-item" href="Dashboardm_member.jsp"><span>Annonces</span></a>
     <a class="dropdown-item" href="#"><span>Favoris</span></a>
    <div class="dropdown-divider"></div>
    <a class="dropdown-item" href="${root}/Logout_servlet"><span>Déconnexion</span></a>
  </div>
			</div>
			<a href="#" class="nav-item nav-link active" style="background-color:red;"><span><i class="fa fa-user fa-3x"></i>&nbsp;<c:out value="${nomMember}"/>&nbsp;<c:out value="${prenomMember}"/></span></a>
		</div>
    </div>
  </nav>

</section>


<div class="signup-form">
    <form method="post" action="${root}/AnnonceUpdatedBySonMemberApresModif" enctype="multipart/form-data">
    
    <input type="hidden" name="idannonce" value="${annonceUpdate.idannonce}">
    <h2  style="font-size:20px;"> <strong>editer l'annonce</strong> </h2>
    <hr>
      
       
      <div class="form-group">
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text">
             titre
          </span>                    
        </div>
        <input type="text" class="form-control" name="TitreAnnonce" placeholder=" ${annonceUpdate.titreannonce}" required="required">
      </div>
        </div>

          <div class="form-group">
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text">
             description
          </span>                    
        </div>
        <input type="text" class="form-control" name="DescriptionAnnonce" placeholder=" ${annonceUpdate.descriptionannonce}" required="required">
      </div>
        </div>
     
          <div class="form-group">
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text">
             ville
          </span>                    
        </div>
        <select class="form-control search-slt" id="exampleFormControlSelect1" name="VilleAnnonce"  >
                                <option  value="${annonceUpdate.villeannonce}">${annonceUpdate.villeannonce}</option>
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
        </div>
        
        
        
        <div class="form-group">
          <div class="form-group">
            <button type="submit" class="btn btn-primary btn-lg">Update</button>
        </div>
    </form>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>