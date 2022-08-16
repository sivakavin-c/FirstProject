<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.sm.demo.Student"></jsp:useBean>
<h1>Before setter</h1>
ROLL NO:<jsp:getProperty property="rollNo" name="obj"/>
NAME:<jsp:getProperty property="name" name="obj"/>

<jsp:setProperty property="rollNo" name="obj" value="1"/>
<jsp:setProperty property="name" name="obj" value="siva"/>
<h1>After setter</h1>
ROLL NO:<jsp:getProperty property="rollNo" name="obj"/>
NAME:<jsp:getProperty property="name" name="obj"/>

</body>
</html>