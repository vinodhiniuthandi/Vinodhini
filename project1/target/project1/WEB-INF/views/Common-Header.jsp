<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body style="background-color: lavender">
	<title>Bootstrap Example</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet"
		href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script
		src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style>
/* Remove the navbar's default margin-bottom and rounded borders */
.navbar {
	margin-bottom: 0;
	border-radius: 0;
}

/* Set height of the grid so .sidenav can be 100% (adjust as needed) */
.row.content {
	height: 450px
}

/* Set gray background color and 100% height */
.sidenav {
	padding-top: 20px;
	background-color: #f1f1f1;
	height: 100%;
}

/* Set black background color, white text and some padding */
footer {
	background-color: #555;
	color: white;
	padding: 15px;
}

/* On small screens, set height to 'auto' for sidenav and grid */
@media screen and (max-width: 767px) {
	.sidenav {
		height: auto;
		padding: 15px;
	}
	.row.content {
		height: auto;
	}
}
</style>
</head>
<body>
	<nav class="navbar navbar-inverse">
<br><br>
		<div class="container-fluid">
		<div class="col-45">
<label><img src=<c:url value="/images/facebook.png" /> class="img" width="40%" height="59px"></label><br>
<label><img src=<c:url value="/images/TWITTER.png" />  width="40%" height="59px"></label>
</div>
			
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<img src=<c:url value="/resources/images/logo1.png" /> alt="logo1" class="col"
								 width="150" height="50"/>
								 </div>
			<div class="collapse navbar-collapse" id="myNavbar"><h4>
				<ul class="nav navbar-nav">
                                     <li class="active"><a href="Home.jsp">Home</a></li>

					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="Category.jsp">Category <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Mobiles & Tablets</a></li>
							<li><a href="#">Laptops & Desktops</a></li>
							<li><a href="#">Mens & Womans Wear </a></li>
							<li><a href="#">Bags & Handbags
									<li><a href="#">Books and More </a></li>
						</ul></li>
					<li><a href="ContactUs.jsp">ContactUs</a></li>
					<li><a href="AboutUs.jsp">AboutUs</a></li>
				

				</ul>
				<ul class="nav navbar-nav navbar-right"> <ul class="nav navbar-nav navbar-center">
        <li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li>
</ul>
					<ul class="nav navbar-nav navbar-right">
                                        <li><a href="Cart.jsp"><span
							class="glyphicon glyphicon-shopping-cart"></span> Your Cart</a></li>
					<li><a href="#"><span class="glyphicon glyphicon-bell"></span>
							Notifications</a></li>
					<li><a href="Login.jsp"><span class="glyphicon glyphicon-log-in"></span>
							Login</a></li>
					<li><a href="SignUp.jsp"><span class="glyphicon glyphicon-share">SignUp</span></li>
				</ul>
			</div>

</h4>		</div>
<br><br>
	</nav>
</body>
</html>