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
String name=request.getParameter("uname");
String pas=request.getParameter("pass");
if(pas.equals("siva@123")){


%>
<jsp:forward page="success.jsp">
<jsp:param value="<%= name %>" name="uname"/>
</jsp:forward>
<%}else { %>
<h2>wrong username/password</h2>
<jsp:include page="index.html"></jsp:include>
<%} %>
</body>
</html>