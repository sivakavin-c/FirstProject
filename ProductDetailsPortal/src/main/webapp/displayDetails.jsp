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
String a=request.getParameter("pname");
String b=request.getParameter("pweight");
String c=request.getParameter("pcost");
String d=request.getParameter("pquality");

out.println("Product name is:"+"<b>"+a+"</b>"+"<br><br>");

out.println("Product weight is:"+"<b>"+b+"</b>"+"<br><br>");

out.println("Product cost is:"+"<b>"+c+"</b>"+"<br><br>");

out.println("Product quality is:"+"<b>"+d+"</b>"+"<br><br>");
%>
</body>
</html>