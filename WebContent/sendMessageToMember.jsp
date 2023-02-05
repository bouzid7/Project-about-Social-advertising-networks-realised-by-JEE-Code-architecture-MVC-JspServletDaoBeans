
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>envoyer message</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="${root}/public/css/formulaire_authentification.css">

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
                <a href="#" class="nav-item nav-link active t1"> <span></span></a>
                <a href="#" class="nav-item nav-link active t1"> <span></span></a>
            </div>
        </div>
    </nav>

</section>

<div class="login-form">

    <form action="${root}//sendMessageToMember" method="post">
		<div class="avatar">
			<i class="fa fa-envelope" style="font-size:48px;color:green"></i>
		</div>
 <% 
 String val1 = request.getParameter("NomMember");
 String val2 = request.getParameter("IdMember");
 String val3 = request.getParameter("IdAnnonce");
 %>
 <h2 class="text-center">votre message à <%=val1 %> </h2>
 <div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Objet</span>
  <input name="TitreMessage" type="text" class="form-control" placeholder="objet" aria-describedby="basic-addon1">
</div>
  <div class="col-auto"  >
      
    <textarea  style="background-color:white;" type="text" name="DescriptionMessage" placeholder="message"  class="form-control-plaintext" id="staticEmail2"> </textarea>
  </div>
   <input type="text" name="IdMember"  value=<%=val2 %> hidden>
   <input type="text" name="IdAnnonce" value="<%=val3 %>" hidden>
  <div class="col-auto">
    <button type="submit" class="btn btn-primary mb-3">envoyer</button>
  </div>
  </form>
 
</div>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>