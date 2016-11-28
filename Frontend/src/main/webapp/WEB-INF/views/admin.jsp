
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body style="background-color:bg.jpg">
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
	background-color:#4682B4;
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
			
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
								 </div>
			<div class="collapse navbar-collapse" id="myNavbar"><h4>
				<ul class="nav navbar-nav">
                                     <li class="active"><a href="home">Home</a></li>

					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Product <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="viewProducts">view</a></li>
							<li><a href="addproduct">Add</a></li>
							</ul></li>
							<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Category <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="viewCategories">view </a></li>
							<li><a href="addcategory">Add</a></li>
							</ul></li>
							<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Supplier<span class="caret"></span></a>
						<ul class="dropdown-menu">
									<li><a href="viewsuppliers">view</a></li>
									<li><a href="addsupplier">Add</a></li>
						</ul></li>
<c:if test="${not empty isAddCategoryClicked}">
</c:if>
<c:if test="${not empty isViewCategoriesClicked}">
</c:if>
				</ul>
				
				<ul class="nav navbar-nav navbar-right">
					<c:if test="${a eq 1}">
						<li>  <a style = "color:white"  >Welcome ${Adminname }</a></li>
						<li style="display: inline-block"><a href="logout"><span
								class="glyphicon glyphicon-log-in"></span> Logout</a></li>	
					</c:if>
					</ul>
					</h4>

			</div>

<br><br>
	</nav>
</body>
</html>
