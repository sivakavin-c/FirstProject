<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="num" value="20"></c:set>
Number is:<c:out value="${num }"></c:out><br>
<c:set var="num" value="700"></c:set>
<c:choose >
<c:when test="${num>500 }">
<c:out value="Num is greater than 500"></c:out><br>
</c:when>
<c:otherwise>
<c:out value="Num is lesser than 500"></c:out><br>
</c:otherwise>
</c:choose>

<c:catch var="ex">
<% int a=10/0;%>
</c:catch>
Exception is :<c:out value="${ex}"></c:out><br>

<c:forTokens items="1,2,3,4,5,6,7,8,9,10" delims="," var="x">
<c:out value="${x }"></c:out>

</c:forTokens>
</body>
</html>