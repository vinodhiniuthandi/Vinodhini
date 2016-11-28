<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 
   
     
     
  <c:if test="${login}">
		<c:set var="a" scope="application" value="3" />
	</c:if>
	
	<c:if test="${logout}">
		<c:set var="a" scope="application" value="4" />
	</c:if>
	
	<div>
	<c:if test="${a eq 3}">
<div class=" col-xs-3 col-xs-offset-3">
  <strong>${errormessage}</strong> 
</div>
 </c:if></div>
 
 <div>
	<c:if test="${a eq 4}">
<div class="  col-xs-3 col-xs-offset-3">
  <strong>${errormessage1}</strong> 
</div>
 </c:if></div>
<style>
form {
  
    margin:0px;
	padding:0px;
        background-image:url(images/bg.jpg);
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
   
}

.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
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

   


  
  
<form:form action="login" method="post" class="form-horizontal">

<h2><center>Login</center></h2>
  <div class="container">
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="email" required>
    

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
        
        
    <button type="submit" class="btn btn-success">Submit</button>
    
  </div>

  <div class="container">
    <a href="registeruser" span class="btn btn-danger">Signup</a>
    <a href="home" span class="btn btn-danger">Cancel</a>
    
  </div>

</form:form>
 
     
</body>
</html>
	