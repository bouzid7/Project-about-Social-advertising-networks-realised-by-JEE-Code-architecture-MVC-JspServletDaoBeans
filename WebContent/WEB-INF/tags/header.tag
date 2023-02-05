<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="root" value="${pageContext.request.contextPath}"/>

<header>
    <div class="container">
        <div class="header-data">
            <div class="logo">
                <a title=""><img src="${root}/public/images/announce" style="width:20px " alt=""></a>
            </div>
            <div class="search-bar">
                <form action="/networks" method="post" autocomplete="off">
                    <input type="text" name="name" placeholder="Chercher...">
                    <button type="submit"><i class="la la-search"></i></button>
                </form>
            </div>
            <nav>
                <ul>
                    <li>
                        <a href="" title="">
                            <span><img src="${root}/public/images/icon1.png" alt=""></span> accueil
                        </a>
                    </li>
                    <li>
                        <a href="" title="">
                            <span><img src="${root}/public/images/icon4.png" alt=""></span> membres
                        </a>
                    </li>
                    <li>
                        <a href="" title="">
                            <span><img src="${root}/public/images/icon5.jpg" style="width:17px"  alt=""></span> announces
                        </a>
                    </li>
                    <c:if test="${user.recruiter == 1}">

                        <li>
                            <a href="profile.jsp" title="">
                                <span><img src="${root}/public/images/icon7.png" alt=""></span> 
                            </a>
                        </li>
                    </c:if>
                    <li>
                        <a href="" title="" class="not-box-open">
                            <span><img src="${root}/public/images/icon6.png" alt=""></span> messagerie
                        </a>
                    </li>
                    
                     <li>
                        <a href="" title="" class="not-box-open">
                            <span><i class="fa fa-star-o" style="font-size:17px;"></i></span>favoris
                        </a>
                    </li>


                </ul>
            </nav>

            <div class="menu-btn">
                <a  title=""><i class="fa fa-bars"></i></a>
            </div>

            <div class="user-account">

               
                <div class="user-info">
                    
                    <img src="${root}/public/images/users/avatar.jpg" height="35" alt="">
                   <a href="profile.jsp" title=""><strong>${user.firstName}</strong></a>
                   
                </div>
                <div class="user-account-settingss">
                    <ul class="us-links">
                        <li><a href="profile.jsp" title="Profile">Profile</a></li>
                        <li><a href="/edit" title="Update">Update</a></li>
                        <li><a href="/password" title="Update">Password</a></li>
                    </ul>
                    <h3 class="tc"><a href="${root}/Logout_servlet" title="Logout">Logout</a></h3>
                </div>

            </div>
        </div>
    </div>
</header>