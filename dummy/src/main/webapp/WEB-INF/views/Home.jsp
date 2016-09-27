<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<div class="navbar-topright">
		<i class="fa fa-facebook-square" style="font-size:36px;color:blue"></i>
<i class="fa fa-twitter-square" style="font-size:36px;color:blue"></i>
		</div>
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<img src=<c:url value="/images/logo1.png" /> alt="logo1" class="col"
								 width="150" height="50"/>
								 </div>
			<div class="collapse navbar-collapse" id="myNavbar"><h4>
				<ul class="nav navbar-nav">
                                     <li class="active"><a href="Home">Home</a></li>

					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Category <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Mobiles & Tablets</a></li>
							<li><a href="#">Laptops & Desktops</a></li>
							<li><a href="#">Mens & Womans Wear </a></li>
							<li><a href="#">Bags & Handbags
									<li><a href="#">Books and More </a></li>
						</ul></li>
					<li><a href="ContactUs">ContactUs</a></li>
					<li><a href="AboutUs">AboutUs</a></li>
				

				</ul>
				<ul class="nav navbar-nav navbar-right"> <ul class="nav navbar-nav navbar-center">
        <li><a href="#"><span class="glyphicon glyphicon-search"></span></a></li>
</ul>
					<ul class="nav navbar-nav navbar-right">
                                        <li><a href="#"><span
							class="glyphicon glyphicon-shopping-cart"></span> Your Cart</a></li>
					<li><a href="#"><span class="glyphicon glyphicon-bell"></span>
							Notifications</a></li>
					<li><a href="Login"><span class="glyphicon glyphicon-log-in"></span>
							Login</a></li>
					<li><a href="SignUp"><span class="glyphicon glyphicon-share">Sign
								Up</span></li>
				</ul>
			</div>

</h4>		</div>
<br><br>
	</nav>

	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-2 sidenav">
				<p>
					<a href="#">Track order</a>
				</p>
				<p>
					<a href="#">24x7 Customer Care</a>
				</p>
				<p>
					<a href="#">Offer Zone</a>
				</p>
			</div>
			<div class="col-sm-8 text-left">
				<body style="""lavender">
					<center>
						<h1>EasyShop</h1>
					</center>
					<hr>
					<div id="myCarousel" class="carousel slide" data-ride="carousel">
						<!-- Indicators -->
						<ol class="carousel-indicators">
							<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
							<li data-target="#myCarousel" data-slide-to="1"></li>
							<li data-target="#myCarousel" data-slide-to="2"></li>

						</ol>

						<!-- Wrapper for slides -->
						<div class="carousel-inner" role="listbox">
							<div class="item active"><img src=<c:url value="/images/hello.jpg" /> alt="hello"
								 width="900" height="300"/>
								<div class="carousel-caption"></div>
							</div>

							
<div class="item"><img src=<c:url value="/images/dress.jpg" /> alt="dress"
								width="900" height="300"/>
								<div class="carousel-caption"></div>
							</div>
							<div class="item">
								<img src=<c:url value="/images/phn.jpg" /> alt="phn"
									width="900" height="300"/>
							
								<div class="carousel-caption"></div>
							</div>
							
<div class="item">
								<img src=<c:url value="/images/laps.jpg" /> alt="laps"
									width="900" height="300"/>
							
								<div class="carousel-caption"></div>
							</div>
							
							<div class="item">
								<img src=<c:url value="/images/backpack.jpg" /> alt="backpack"
									width="900" height="300"/>
							
								<div class="carousel-caption"></div>
							</div>

						</div>


						<!-- Left and right controls -->
						<a class="left carousel-control" href="#myCarousel" role="button"
							data-slide="prev"> <span
							class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
							<span class="sr-only">Previous</span>
						</a> <a class="right carousel-control" href="#myCarousel"
							role="button" data-slide="next"> <span
							class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
							<span class="sr-only">Next</span>
						</a>


						<center>
							<h4></h4>
						</center>
					</div>


					<marquee>
						<h4>Flat 50% offer on Mobiles</h4>
					</marquee>
			</div>
			<div class="col-sm-2 sidenav">
				<div class="well">
					<p><img src=<c:url value="/images/mobiles.jpg" /> alt="mobiles"
								 width="90" height="130"/></p>
				</div>
				<div class="well">
					<p><img src=<c:url value="/images/cart.png" /> alt="cart"
								 width="90" height="180"/></p>
				</div>
			</div>
		</div>
	</div>

	<footer class="container-fluid text-center">
		<p>
		<h4>Policies:Return policy|Terms of use|Security|Infringement &nbsp&nbsp&nbsp </h4>
</h4> <p> <span class=" glyphicon glyphicon-copyright-mark">2016-2020 EasyShop.com All rights reserved</span></p> </h4>
	</footer>
	</style>

</body>
</html>