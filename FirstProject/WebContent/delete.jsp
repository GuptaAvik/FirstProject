<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Page</title>
</head>
<body>
<div align="center">
<h3>Enter Password for deleting Account</h3>
<form action="deleteservlet" method ="post">
<table>
<tr>
<td>User Name : </td>
<td><input type="text" name="uname" required value="<%! String msg=""; %>
<% 
msg=(String)session.getAttribute("name");
out.println(msg);
%>" readonly></td>
</tr>
<tr>
<td>Password : </td>
<td><input type="password" name="pass" required> </td>
</tr>
</table>

<button id="button" type="submit">Submit </button> 


</form>
</div>
</body>
</html>