<%@ include file= "Common-Header.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body
  
#username{
          margin-right: -20px;
          }  
</style>
<body>

	<a class="hiddenanchor" id="tologin"></a>
	<div id="wrapper">
		<div id="login" class="animate form">
			<form  action="mysuperscript.php" autocomplete="on"> 
				<h1><center>Login</center></h1> <a class="container-fluid text-center">
				<p> <center>
					<label for="username" class="uname" data-icon="u" >Email</label>
					<input id="username" name="username" required="required" type="text" placeholder="myusername or mymail@mail.com"/></center>
				</p>
				<p> <center>
					<label for="password" class="youpasswd" data-icon="p"> Password </label>
					<input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EO" /> 
				</center></p>
				<p class="keeplogin"> <center>
					<input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" /> 
					<label for="loginkeeping">Keep me logged in</label>
				</center></p>
				<p class="login button"> <center>
					<input type="submit" value="Login" /> 
				</center></p>
				<p class="change_link"><center>
					Not a member yet ?
					<a href="SignUp" class="register">Join us</a>
				</center></p>
			</a></form>
		

				
		</div>
		
	</div>
</body>
</html>
<%@ include file= "Common-Footer.jsp"%>