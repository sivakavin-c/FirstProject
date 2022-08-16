<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"  %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<c:set var="books">  

<books>

<book>
<name> The wild life</name>
<author> thiru</author>
</book>

<book>
<name> The lion</name>
<author> charles</author>
</book>
</books>

</c:set>


<x:parse var="data" xml="${books }"></x:parse>

Author of 1st book:<x:out select="$data/books/book[1]/author "/>
Name of 2nd book:<x:out select="$data/books/book[2]/name "/>
</body>
</html>