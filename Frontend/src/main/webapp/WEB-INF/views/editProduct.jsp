<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/views/common-header.jsp" %>

<style>
form {
    border: 3px solid #f1f1f1;
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

<h2><center>Edit Product</center></h2>

<form:form action="../edit" method="post" >
	
		
		<div class="container">
    <label><b>Product Id</b></label>
    <input type="text" placeholder="Enter Product Id" name="product_Id""  value="${Product.product_Id}" required>
 <label><b>Product Name</b></label>
    <input type="text" placeholder="Enter Product Name" name="product_Name"  value="${Product.product_Name}" required>

			 <label><b>Product Description</b></label>
    <input type="text" placeholder="Enter Product Description" name="description"  value="${Product.description}" required>
<label><b>Product Category</b></label>
    <input type="text" placeholder="Enter Product Category" name="category"  value="${Product.category}" required>
<label><b>Product Supplier</b></label>
    <input type="text" placeholder="Enter Product Supplier" name="supplier_Name"  value="${Product.supplier_Name}" required>
<label><b>Product Price</b></label>
    <input type="text" placeholder="Enter Product Price" name="product_Price"  value="${Product.product_Price}" required>
<label><b>Product Stock</b></label>
    <input type="text" placeholder="Enter Product Stock" name="product_Stock"  value="${Product.product_Stock}" required>

		<input class="btn btn-success" type="submit" name="submit" value="Edit">
				<input class="btn btn-danger" type="reset" value="Reset">

</form:form>
</body></html>