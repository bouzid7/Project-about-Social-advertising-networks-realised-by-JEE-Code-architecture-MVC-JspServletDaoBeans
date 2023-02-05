<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.1/css/all.css" integrity="sha384-vp86vTRFVJgpjF9jiIGPEEqYqlDwgyBgEF109VFjmqGmIY/Y4HV4d3Gp2irVfcrp" crossorigin="anonymous">
<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<title>Insert title here</title>
</head>
<body>
 <div class="heart">
  <i class="fas fa-heart"></i>
  <span class="count">0</span>
</div>


<button onclick="dir()">  click</button>



<script type="text/javascript">
function dir(){

	const { value: formValues } = await Swal.fire({
		  title: 'Multiple inputs',
		  html:
		    '<input id="swal-input1" class="swal2-input">' +
		    '<input id="swal-input2" class="swal2-input">',
		  focusConfirm: false,
		  preConfirm: () => {
		    return [
		      document.getElementById('swal-input1').value,
		      document.getElementById('swal-input2').value
		    ]
		  }
		})

		if (formValues) {
		  Swal.fire(JSON.stringify(formValues))
		}

}




</script>
<style>
.heart {
  cursor: pointer;
  display: inline-block;
  position: relative;
  font-size: 24px;
}

.heart .count {
  position: absolute;
  top: 0;
  right: -10px;
  font-size: 12px;
}

.heart i {
  color: #ff0000;
  animation: beat 1s ease-in-out infinite;
}

@keyframes beat {
  0% {
    transform: scale(1);
  }
  14% {
    transform: scale(1.3);
  }
  28% {
    transform: scale(1);
  }
}




</style>

<script type="text/javascript">
const heart = document.querySelector(".heart");
const count = document.querySelector(".count");

heart.addEventListener("click", function() {
  count.textContent = parseInt(count.textContent) + 1;
});

</script>
</body>
</html>