<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${root}/public/css/AdminDashboard.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Admin Members Dashboard</title>
</head>
<body>
    <div class="side-menu">
        <div class="brand-name">
            <h1><a href="#" class="navbar-brand"><i class="fa fa-cube"></i><b>GoodDeals</b></a> </h1>
        </div>
        <ul>
            <li><i class="fa fa-house"></i>&nbsp;<span>Home</span> </li>
            <li><i class="fa fa-message"></i></i>&nbsp;<span>Messages</span> </li>
            <li><i class="fa fa-users"></i>&nbsp;<span>Membres</span> </li>
            <li><i class="fa fa-bullhorn"></i>&nbsp;<span>Annonces</span> </li>
            <li><i class="fa fa-gear"></i>&nbsp;<span>Paramètres</span> </li>
            <li><i class="fa fa-arrow-right-from-bracket"></i>&nbsp;   <span> <a href="${root}/Logout_servlet">Déconnexion</a></span> </li>
        </ul>
    </div>
    <div class="container">
        <div class="header">
            <div class="nav">
                <div class="search">
                    <input type="text" placeholder="Search..">
                    <button type="submit"><i class="fa fa-magnifying-glass"></i></button>
                </div>
                <div class="user">
                    <div class="img-case">
                        <a href="#"><i class="fa fa-user fa-2x"><c:out value="admin"/>
                  
                        </i>
                        </a>
                        
                    </div>
                </div>
            </div>
        </div>

        <div class="content">
            <div class="cards">
            
              <a  href="${root}/getAllAnnoncesAdminEvent?id=${m.idmember}">
                <div class="card">
                    <div class="box">
                        <h1>${NA.count}</h1>
                        <h3>Annonces</h3>
                    </div>
                    <div class="icon-case">
                        <img src="students.png" alt="">
                    </div>
                </div>
                </a>
                
                <a  href="${root}/getAllMembersAdminEvent?id=${m.idmember}">
                
                <div class="card">
                    <div class="box">
                        <h1>${NM.count}</h1>
                        <h3>Membres</h3>
                    </div>
                    <div class="icon-case">
                        <img src="teachers.png" alt="">
                    </div>
                </div>
                </a>
                
                
                
                <div class="card">
                    <div class="box">
                        <h1>${NMessage.count}</h1>
                        <h3>Messages</h3>
                    </div>
                    <div class="icon-case">
                        <img src="schools.png" alt="">
                    </div>
                </div>
                
                
    <!--             hidden page  -->            
                <div  class="content-2">
                <div class="recent-payments">
                    <div class="title">
                        <h2>Membres</h2>
                      
                    </div>
                    <table>
                   
                        <tr>
                            <th>Nom</th>
                            <th>Prenoms</th>
                            <th>Email</th>
                            <th>Adresse</th>
                            <th></th>
                           
                        </tr>
                         <c:forEach  items="${AllMembers}" var="a">
                        <tr>
                            <td><c:out value="${a.nommember}"/></td>
                            <td><c:out value="${a.prenomsmember}"/></td>
                            <td><c:out value="${a.emailmember}"/></td>
                            <td><c:out value="${a.addressmember }"/></td>
                           <td><a href="${root}/DeleteMemberByAdmin?id=${a.idmember}"><i class="fa fa-trash-o" style="font-size:25px;color:red"></i> </a></td>
                       </tr>
                        </c:forEach>
                        
                    </table>
                    
                    
                </div>
               
                </div>
                
  <!--             hidden page  -->      
                
                
            </div>

            
            
            </div>
        </div>
        <script type="text/javascript">
        $(document).ready(function () {
            $(document).on('click', '.cta', function () {
                $(this).toggleClass('active')
            })
        });


        $(document).ready(function(){
            $(".hamburger").click(function(){
                $('.sidebar-menu').removeClass("flowHide");  
                $(".sidebar-menu").toggleClass("full-side-bar");
                $('.nav-link-name').toggleClass('name-hide');        
            });
        });





         $(document).ready(function () {    
              $(".nav-link").hover(function () {           
                  $('.sidebar-menu').removeClass("flowHide");  
                  $(this).addClass('tax-active');
                      
              }, function () {
                  $('.sidebar-menu')
                     .addClass("flowHide");
                  $(this).removeClass('tax-active');
                     
              });    
          });
        
        </script>
</body>

</html>