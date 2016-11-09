<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib  uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
</head>
<body>
	<div class="container-fluid">
	

		<div class="content">
			<div class="container">
				<div class="jumbotron">
					<h1>Order Confirmed,Product will be delivered shortly.</h1>
					<form:form><input type="submit" name="_eventId_finalHome"  value="Home" class="btn btn-lg btn-info"></form:form>
				
				</div>
			</div>
		</div>
	
	</div>
</body>
</html>