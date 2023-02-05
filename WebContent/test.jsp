
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title>Test</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  </head>
  <body>
  
 <form   id = "schedulejob" action="${root}/test" method="GET">
<label>
<input type="checkbox"  id = "corporateClientCare" name="corporateClientCare" value="corporateClientCare" class="input_checkbox"> CorporateClientCare 
</label>
<label>
<input type="checkbox" id = "dayforce" name="dayforce" value="dayforce" class="input_checkbox"> Dayforce  </label>
<label>
<input type="checkbox" id = "tss" name="tss" value="tss" class="input_checkbox"> TSS </label>
<label>
<input type="checkbox" id = "multimax"  name="multimax" value="multimax" class="input_checkbox"> Multimax</label>
<label> <input type="checkbox" id = "arcot"  name="arcot" value="arcot" class="input_checkbox"> Arcot <br/></label> 
<input type="datetime-local" id="dateTime" name = "dateTime" value="2019-06-04T15:25:33">    
<input type="submit" name="Scheduler" value="Scheduler" class="submit"/></form>
  
  
  
  <script type="text/javascript">
  
  $("#schedulejob").on('submit',function( event ) { 

	  event.preventDefault();

	  var scheduleRequest = {};
	  scheduleRequest["corporateClientCare"] = verifychecked("corporateClientCare");
	  scheduleRequest["dayforce"] = verifychecked("dayforce");
	  scheduleRequest["tss"] = verifychecked("tss");
	  scheduleRequest["multimax"] = verifychecked("multimax");
	  scheduleRequest["arcot"] = verifychecked("arcot");
	  scheduleRequest["dateTime"] = document.getElementById("dateTime").value;
	  scheduleRequest["timeZone"] = "Asia/Kolkata";

	  $.ajax({

	  type : form.attr('method'),
	  contentType : "application/json;charset=utf-8",
	  url : form.attr('action'),
	  data : JSON.stringify(scheduleRequest),
	  dataType : 'json',              
	  success : function(data) {

	                      }
	                  });
	           });

	          function verifychecked(value) {
	          var varr = '';
	          if(document.getElementById(value).checked)
	          {
	             varr = value;
	          }
	          else{
	              varr = null;
	          }
	            return varr;

	    }); 
	  });
  
 
  </script>
  
<!-- ************************************************************************************************************ --> 
  
  <p id="myTag" onmouseover="displayModal()">Hover over me to display a modal</p>

<div id="modal" style="display:none">
  <p>This is the content of the modal window.</p>
  <button onclick="closeModal()">Close</button>
</div>

<script>


function closeModal() {
  var modal = document.getElementById("modal");
  modal.style.display = "none";
}
</script>
  
    <form id="loginForm">
      <label>Username:</label>
      <input type="text" id="username">
      <br>
      <label>Password:</label>
      <input type="password" id="password">
      <br>
      <input type="submit" value="Submit" onclick="submitForm()">
    </form>
    <script>
      function submitForm() {
        // Get the values from the form inputs
        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;

        // Create a JSON object with the form data
        var data = {
          "username": username,
          "password": password
        };

        // Convert the JSON object to a string
        var jsonData = JSON.stringify(data);

        // Send the data to the auth.jsp file using the Fetch API
        fetch("http://localhost:14253/Project_Network_announcement/fetchData.jsp", {
          method: "POST",
          headers: {
            "Content-Type": "application/json"
          },
          body: jsonData
        })
          .then(response => {
            if (!response.ok) {
              throw new Error(response.statusText);
            }
            return response.json();
          })
          .then(data => {
            console.log("Success:", data);
          })
          .catch(error => {
            console.error("Error:", error);
          });
      }
    </script>
  </body>
</html>
 