<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<form action="insertservlet" method ="get">
<table>
<tr>
<td>Product Id:</td>
<td> <input type="number" name="id" required></td>
</tr>
<tr>
<td>Product Name: </td>
<td><input type="text" name="name" required></td>
</tr>
<tr>
<td>Price: </td>
<td><input type="Number" name="price" required></td>
</tr>
<tr>
<td>Category ID:</td>
<td><input type="Number" name="category" required></td>

</tr>
<tr>
<td>For CategoryId</td><td><input type="button" value="Click Here"></td>
</tr>
<tr>
<td>Image: </td>
<td><input type="file" name="url" required></td>
</tr>
<tr>
<td>Quantity: </td>
<td><input type="Number" name="quantity" required></td>
</tr>
<tr>
<td></td>
<td><button type="submit"> Add </button> </td>
</tr>
</table>
</form>

</body>
</html>