<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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

<h2><center>Edit Supplier</center></h2>

<form:form action="../editSupplier" method="post" >
	
		
		<div class="container">
    <label><b>Supplier Id</b></label>
    <input type="text" placeholder="Enter Supplier Id" name="id"  value="${supplier.id}" required>
 <label><b>Supplier Name</b></label>
    <input type="text" placeholder="Enter Supplier Name" name="name"  value="${supplier.name}" required>

			 <label><b>Supplier PhoneNo</b></label>
    <input type="text" placeholder="Enter Supplier mobileno" name="contact"  value="${supplier.contact}" required>
<label><b>Supplier EmailId</b></label>
    <input type="text" placeholder="Enter Supplier emailid" name="email"  value="${supplier.email}" required>
<label><b>Supplier Address</b></label>
    <input type="text" placeholder="Enter Supplier address" name="address"  value="${supplier.address}" required>
		<input class="btn btn-success" type="submit" name="submit" value="Edit">
				<input class="btn btn-danger" type="reset" value="Reset">
			
			
	

	</form:form>
	
</body></html>
	

			
		