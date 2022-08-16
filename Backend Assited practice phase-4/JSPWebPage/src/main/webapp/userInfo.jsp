<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String user=request.getParameter("uname");
String pass=request.getParameter("pass");

session.setAttribute("session-uid", user);
if(user.equals("siva")&& pass.equals("siva@123"))
	response.sendRedirect("success.jsp");
else
	response.sendRedirect("failure.jsp");
%>
</body>
</html>