<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Congrats you have been redirected</title>
</head>
<body>
<h2>Congrats you have been redirected</h2>
<ul> 
<li>First Name:<%=session.getAttribute("user")%></li>
<li>First Name:<%=request.getParameter("first_name")%></li>
<li>Password:<%=request.getParameter("password")%></li>
</ul>
</body>
</html>