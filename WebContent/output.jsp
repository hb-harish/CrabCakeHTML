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
<% UserCheck.User u = (UserCheck.User) session.getAttribute("user");%>
<ul> 

<li>First Name:<%=u.getName()%></li>
<li>Password:<%=request.getParameter("password")%></li>
</ul>
</body>
</html>