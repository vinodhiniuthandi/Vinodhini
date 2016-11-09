<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><h1>Add a Product</h1>
<c:url var="addAction" value="/product/add"></c:url>
<form:form action="${addAction}" commandName="product" enctype="multipart/form-data" method="post">
<table>
<tr>
<td><form:label path="id">
<spring:message text="ID"/>
</form:label></td>
<c:choose><c:when test="${!empty product.id}">
<td>
<form:input path="id" value="" disabled="true" readonly="true"/>
</td></c:when><c:otherwise>
<td>
<form:input path="id" pattern=".{6,7}" required="true" title="id should contains 6 to 7 characters"/></td>
</c:otherwise>
</c:choose>
<tr>
<form:input path="id" hidden="true"/>
<td>
<form:label path="name">
<spring:message text="Name" />
</form:label>
</td>
</tr>
<tr>
<td><form:label path="Product">
<spring:message text="product"/>
</form:label>
</td><td><form:select path="product.name" items="${productList}" itemValue="name"
itemLabel="name" />
</td>
</tr>
<tr>
<td><form:label path="Supplier">
<spring:message text="supplier"/>
</form:label>
</td><td><form:select path="supplier.name" items="${supplierList}" itemValue="name"
itemLabel="name" />
</td>
</tr>
<tr>
<td><form:label path="Category">
<spring:message text="category"/>
</form:label>
</td><td><form:select path="category.name" items="${categoryList}" itemValue="name"
itemLabel="name" />
</td>
</tr>
<tr>
<td align="left"><form:label path="image">
<spring:message text="Image"/>
</form:label>
</td>
<td align="left"><form:input type="file" name="image" path="image"/>
</td>
</tr>
<tr>
<td colspan="2">
<c:if test="${empty product.name}">
<input type="submit" value="<spring:message text="Edit Product"/>"/>
</c:if>
<c:if test="${empty product.name}">
<input type="submit" value="<spring:message text="Add Product"/>"/>
</c:if>
</td>
</tr>
</table>
</form:form>
<br>

<h3>Product List</h3>
<c:if test="${!empty product List}">
<table class="tg">
<tr>
<th width="80">Product Id</th>
<th width="120">Product Name</th>
<th width="80">Price</th>
<th width="80">Product Category</th>
<th width="80">Product Supplier</th>
</tr>
</table>
</c:if>
</form>
</body>
</html>