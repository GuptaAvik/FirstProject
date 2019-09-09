<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update page</title>
</head>
<body>
<div align="center">
<form action="Updateservlet" method="post">
<table>
<tr>
<td>User Name : </td>
<td><input type="text" name="uname" value="<%! String msg=""; %>
<% 
msg=(String)session.getAttribute("name");
out.println(msg);
%>" readonly >
</td>
</tr>
<tr>
<td>Password : </td>
<td><input type="password" name="pass" required> </td>
</tr>
<tr>
<td>Email : </td>
<td><input type="email" name="em" > </td>
</tr>
<tr>
<td>Phone Number : </td>
<td><input type="tel" name="number" > </td>
</tr>
<tr>
<td><button id="button" type="submit">Submit </button> </td>
<td><button type="reset">Reset </button> </td>
</tr>
</table>
</form>
</div>
</body>
</html>