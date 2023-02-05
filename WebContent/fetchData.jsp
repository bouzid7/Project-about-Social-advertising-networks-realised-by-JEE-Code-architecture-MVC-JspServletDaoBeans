<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title> Test Data .</title>
</head>
<body>
          <ul>
          <li>
            <c:out value="${titreannonce}"></c:out>
            
              </li>
              <li>
            <c:out value="${descriptionannonce}"></c:out>
              </li>
                <li>
            <c:out value="${nomfile1}"></c:out>
              </li>
               <li>
            <c:out value="${nomfile2}"></c:out>
              </li>
               <li>
            <c:out value="${nomfile3}"></c:out>
              </li>
               <li>
            <c:out value="${nomfile4}"></c:out>
              </li>
                <li>
            <c:out value="${villeannonce}"></c:out>
          </li>
           <li>
            <c:out value="${LastID}"></c:out>
          </li>
          </ul>
          
</body>
</html>