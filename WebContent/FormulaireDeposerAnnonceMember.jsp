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
<title>Formulaire ajouter une annonce</title>
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
    <form method="post" action="${root}/FormulaireDeposerAnnonceMember" enctype="multipart/form-data">
    <h2>Ajouter une nouvelle annonce</h2>
    <hr>
          
        <input type="text" name="idmember"  value="<%=request.getParameter("id")%>" hidden>
      <div class="form-group">
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text">
            
          </span>                    
        </div>
        <input type="text" class="form-control" name="TitreAnnonce" placeholder="Titre" required="required">
      </div>
        </div>

          <div class="form-group">
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text">
      
          </span>                    
        </div>
        <input type="text" class="form-control" name="DescriptionAnnonce" placeholder="Description" required="required">
      </div>
        </div>
       
        <div class="form-group">
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text">
               <strong> inserer l'image 1 </strong>
          </span>                 
        </div>
        <input type="file" class="form-control" name="file1" placeholder="inserer l'image" required="required">
      </div>
        </div>
        
         <div class="form-group">
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text">
             <strong> inserer l'image 2 </strong> 
          </span>                 
        </div>
        <input type="file" class="form-control" name="file2" placeholder="inserer l'image" >
      </div>
        </div>
        
        
         <div class="form-group">
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text">
              <strong>  inserer l'image 3 </strong> 
          </span>                 
        </div>
        <input type="file" class="form-control" name="file3" placeholder="inserer l'image" >
      </div>
        </div>
        
         <div class="form-group">
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text">
            <strong>    inserer l'image 4 </strong> 
          </span>                 
        </div>
        <input type="file" class="form-control" name="file4" placeholder="inserer l'image" >
      </div>
        </div>
       
        


          <div class="form-group">
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text">
            
          </span>                    
        </div>
        <select class="form-control search-slt" id="exampleFormControlSelect1" name="VilleAnnonce"  >
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
        </div>
        
        
        
        <div class="form-group">
          <div class="form-group">
            <button type="submit" class="btn btn-primary btn-lg">Ajouter</button>
        </div>
    </form>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>