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
<title>Inscription</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="${root}/public/css/formulaire_inscription.css">
</head>
<body>

<!--  nabar-->

  <nav class="navbar navbar-expand-xl navbar-dark bg-dark">
    <a href="#" class="navbar-brand"><i class="fa fa-cube"></i><b>GoodDeals</b></a>     
    <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
      <span class="navbar-toggler-icon"></span>
    </button>
    <!-- Collection of nav links, forms, and other content for toggling -->
    <div id="navbarCollapse" class="collapse navbar-collapse justify-content-start">    
      <div class="navbar-nav ml-auto">
        <a href="#" class="nav-item nav-link active t1"> <span>Se connecter</span></a>
              
      </div>
    </div>
  </nav>

</section>


<div class="signup-form">
    <form action="${root}/InscriptionMember_servlet" method="post">
    <h2>Sign Up</h2>
    <p>Please fill in this form to create an account!</p>
    <hr>
        <div class="form-group">
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text">
            <span class="fa fa-user"></span>
          </span>                    
        </div>
        <input type="text" class="form-control" name="nom" placeholder="Nom" required="required">
      </div>
        </div>


          <div class="form-group">
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text">
            <span class="fa fa-user"></span>
          </span>                    
        </div>
        <input type="text" class="form-control" name="prenoms" placeholder="Prenoms" required="required">
      </div>
        </div>



            <div class="form-group">
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text">
            <i class="fa fa-solid fa-phone"></i>
          </span>                    
        </div>
        <input type="text" class="form-control" name="telephone" placeholder="Ex: +212 6 08 50 52 05" required="required">
      </div>
        </div>





        <div class="form-group">
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text">
            <i class="fa fa-paper-plane"></i>
          </span>                    
        </div>
        <input type="email" class="form-control" name="email" placeholder="Email Address" required="required">
      </div>
        </div>


    <div class="form-group">
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text">
            <i class="fa fa-lock"></i>
          </span>                    
        </div>
        <input type="text" class="form-control" name="password" placeholder="Password" required="required">
      </div>
        </div>
    <div class="form-group">
      <div class="input-group">
        <div class="input-group-prepend">
          <span class="input-group-text">
            <i class="fa fa-lock"></i>
            <i class="fa fa-check"></i>
          </span>                    
        </div>
        <input type="text" class="form-control" name="confirm_password" placeholder="Confirm Password" required="required">
      </div>
        </div>
        <div class="form-group">
      <label class="form-check-label"><input type="checkbox" required="required"> I accept the <a href="#">Terms of Use</a> &amp; <a href="#">Privacy Policy</a></label>
    </div>
    <div class="form-group">
            <button type="submit" class="btn btn-primary btn-lg">Sign Up</button>
        </div>
    </form>
  <div class="text-center">Already have an account? <a href="Formulaire_Authentification.jsp">Login here</a></div>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>