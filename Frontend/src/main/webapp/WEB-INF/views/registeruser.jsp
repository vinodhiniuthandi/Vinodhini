<html>
    
    
     
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet"
		href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script
		src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<c:if test="${isAlreadyRegister}">
		<c:set var="a" scope="application" value="5" />
	</c:if>
	<c:if test="${isSignupClicked}">
		<c:set var="a" scope="application" value="6" />
	</c:if>
	
		<c:if test="${a eq 5}">
	<div>
<div class="  col-xs-3 col-xs-offset-3">
  <strong>${userexists}</strong> 
</div>
 </div></c:if>
 <c:if test="${a eq 6}">
<div class="  col-xs-3 col-xs-offset-3">
  <strong>${success}</strong> 
 
</div>
 </c:if>
<style>
form {
    border: 3px solid #f1f1f1;
    background-image:url(images/bg.jpg);
    margin:0px;
	padding:0px;
	background-repeat:no-repeat;
	background-size:100% 1000px;
    
}

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}


.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}
</style>
<body>


<form action="register">
  
<h2><center>Registration Form</center></h2>
  <div class="container">
    <label><b>Username</b></label>
    <input type="text" placeholder="Username" name="name" required>
    
    <label><b>Email</b></label>
    <input type="text" placeholder="Mailid" name="email" required>

    <label><b>Password</b></label>
    <input type="text" placeholder=" Password" name="password" required>

    <label><b>Mobile</b></label>
    <input type="text" placeholder="mobile" name="mobile" required>
   
    <label><b>Address</b></label>
    <input type="text" placeholder="address" name="address" required>
        
    <button type="submit">Register</button>
    <a href="home" class="btn btn-danger">Cancel</a>
    
  </div>
</form>
 
 </body>
 </html>
     
