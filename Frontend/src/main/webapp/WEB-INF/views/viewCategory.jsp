<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/views/common-header.jsp" %>
<head>
<body style="background-color: bg.jpg">
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>


<h1>${msg}</h1>
<h4><center>Categories</center></h4>

<div class="container">
 
<table  class= " table table-bordered  table table-hover" >
<div class="container">
    <div class="row row-centered">
	<tr class= "SUCCESS" >
	    <th align="left">S.No</th>
		<th align="left">Id</th>
		<th align="left">Name</th>
		<th align="left">Description</th>
		<th align="left">Edit</th>
		<th align="left">Delete</th>
	</tr>
	<c:forEach items="${categoryList}" var="category" varStatus="status">
		<tr >
			<td>${status.count}</td>
			<td>${category.id}</td>
			<td>${category.name}</td>
			<td>${category.description}</td>
			<td><a href="editcategory/${category.id}">edit</a></td>
			<td><a href="deletecategory/${category.id}" onclick="return confirm('Are You Sure? Do you want to delete the Category : ${category.name} ?')">delete</a></td>
		</tr>
		
	</c:forEach>

</table>
</div>
</div>
</body>