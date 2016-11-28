

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<body style="background-color: EDF2EB ">

<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- <marquee width="140%"> -->
<%@include file="/WEB-INF/views/common-header.jsp"%>
<c:set var="username" scope="session" value="${username}"/>
 <h3>Hello..${username}</h3>
  <c:forEach items="${productList}" var="product">

<div class="img col-lg-2 col-lg-offset-1 col-sm-2 col-sm-offset-1" style="margin-top: 20px">
  <a href="<spring:url value="cart/${product.product_Id }"/>">
    <img src="<c:url value="/images/${product.product_Id}.jpg"/>" alt="${product.product_Id}" width="120" height="100">
  </a>
  <div class="desc">
  <ul style="list-style-type:none">
  <li class="span2"><h5 style="color: blue" >${product.product_Name}</h5>
  <h6>Price:${product.product_Price}</h6></li></ul>
  </div>
</div>
<!-- 
</article> -->

</c:forEach> 

<!-- </marquee> -->