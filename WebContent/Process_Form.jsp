<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>You entered</title>
</head>
<body>

<center>
<h1>Using GET Method to Read Form Data</h1>

<ul> 
<li>First Name:<%=request.getParameter("first_name")%></li>
<li>Password:<%=request.getParameter("password")%></li>
</ul>
</center>
</body>
</html>