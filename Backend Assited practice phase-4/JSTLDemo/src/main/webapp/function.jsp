<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="str" value="Hello World"></c:set>
<c:set var="str1" value="hello world"></c:set>

Lower case:${fn:toLowerCase(str) }<br>
UPPER CASE:${fn:toUpperCase(str) }<br>


<c:set var="greet" value="Hi welcome to our company"></c:set>
<c:set var="greet1" value="${fn:split(greet,' ') }"></c:set>

<c:forEach items="${greet1}" var="x">
    <c:out value="${fn:toUpperCase(x) }"></c:out><br>

</c:forEach>

</body>
</html>