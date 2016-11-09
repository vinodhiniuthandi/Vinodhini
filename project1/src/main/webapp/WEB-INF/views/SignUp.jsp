<%@ include file="Common-Header.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>
<script type="text/javascript" src="validate.js"></script>
</head>
<style>
body
{
	margin:0px;
	padding:0px;
        background-image:url(images/BG3.jpg);
	background-repeat:no-repeat;
	background-size:100% 1000px;

}
</style>
<body>
<form action="#" name="Registration" onsubmit="return(validate());">
<table cellpadding="2" width="60%" height="60%" align="center"
cellspacing="2">

<tr>
<td colspan=2>
<center><font size=8><b> Registration Form</b></font></center>
</td>
</tr>
<h3>
<tr>
<td>Name</td>
<td><input type=text name=textnames id="textname" size="60"></td>
</tr>

<tr>
<td>Sex</td>
<td><input type="radio" name="sex" value="male" size="20">Male
<input type="radio" name="sex" value="Female" size="20">Female</td>
</tr>

<tr>
<td>City</td>
<td><select name="State">
<option value="-1" selected>select..</option>
<option value="New Delhi">NEW DELHI</option>
<option value="Mumbai">MUMBAI</option>
<option value="Goa">GOA</option>
<option value="Tamilnadu">TAMILNADU</option>
<option value="Hyderabad">HYDERABAD</option>
<option value="Bangalore">BANGALORE</option>
<option value="Kerala">KERALA</option>

</select></td>
</tr>

<tr>
<td>State</td>
<td><select Name="City">
<option value="-1" selected>select..</option>
<option value="New Delhi">NEW DELHI</option>
<option value="Mumbai">MUMBAI</option>
<option value="Goa">GOA</option>
<option value="Bihar">BIHAR</option>
</select></td>
</tr>
<tr>
<td>PinCode</td>
<td><input type="text" name="pincode" id="pincode" size="60"></td>

</tr>
<tr>
<td>EmailId</td>
<td><input type="text" name="emailid" id="emailid" size="60"></td>
</tr>

<tr>
<td>DOB</td>
<td><input type="text" name="dob" id="dob" size="60"></td>
</tr>

<tr>
<td>MobileNo</td>
<td><input type="text" name="mobileno" id="mobileno" size="60"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Submit Form" /></td>
<td><input type="reset"></td>
</tr></h3>
</table>
</form>
</body>
</html>
<%@ include file="Common-Footer.jsp" %>