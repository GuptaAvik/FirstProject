<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String msg=""; %>
<% 
msg=(String)session.getAttribute("name");
out.println("Welcome "+msg);

%>
<button onclick="location.href='update.jsp';">Update Details</button>
<button onclick="location.href='delete.jsp';">Delete Account</button>
</body>
</html>