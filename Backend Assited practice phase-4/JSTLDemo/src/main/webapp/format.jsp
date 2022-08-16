<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="num" value="12.3453"></c:set>
Previous number:<c:out value="${num }"></c:out><br>
Formatted number:<fmt:formatNumber maxFractionDigits="2" value="${num }"></fmt:formatNumber><br>

<c:set var="today" value="<%= new Date() %>"></c:set>
Short date:<fmt:formatDate value="${today }" timeStyle="short" dateStyle="short" type="both"/><br>
Medium date:<fmt:formatDate value="${today }" dateStyle="medium" timeStyle="medium" type="both"/><br>
Long date:<fmt:formatDate value="${today }" dateStyle="long" timeStyle="long" type="both"/><br>

</body>
</html>