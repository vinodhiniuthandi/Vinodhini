<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="/WEB-INF/views/common-header.jsp" %>
<style>
form {
    border: 3px solid #f1f1f1;
    margin:0px;
	padding:0px;
        background-image:url(images/BG5.jpg);
	background-repeat:no-repeat;
	background-size:100% 1000px;
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

<h2><center>ADD SUPPLIER</center></h2>
   


  
  
<form:form action="newSupplier" method="post" class="form-horizontal">
  <div class="container">
    <label><b>Supplier Id</b></label>
    <input type="text" placeholder="Enter Supplier Id" name="id" required>
<label><b>Supplier Name</b></label>
    <input type="text" placeholder="Enter Supplier Name" name="name" required>
<label><b>Supplier Mobile</b></label>
<input type="text" placeholder="Enter Supplier Mobileno" name="contact" required>
<label><b>Supplier email</b></label>
<input type="text" placeholder="Enter Supplier Email" name="email" required>
<label><b>Supplier Address</b></label>
<input type="text" placeholder="Enter Supplier Address" name="address" required>

			
			
	  
    <button type="submit" class="btn btn-success" value="Add">Submit</button>
<button type="reset" class="btn btn-danger" value="Reset">Reset</button>
    
  </div>

		

	</form:form></div>
</body>

