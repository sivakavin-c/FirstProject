<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<sql:setDataSource var="conn" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/ecommerce1" user="root" password="sivakavin@11"/>

<sql:query var="detail" dataSource="${conn }">

select * from eproduct;
</sql:query>

<table  border=1 cellspacing=0 cellpadding=10>
	<tr>
		 
			<th>ID</th><th>Name</th><th>Price</th><th>Date</th>
		
	</tr>
	
	<c:forEach items="${detail.rows }" var="p">
	<tr>
	<td><c:out value="${p.id }"></c:out></td>
	<td><c:out value="${p.name }"></c:out></td>
	<td><c:out value="${p.price }"></c:out></td>
	<td><c:out value="${p.date_added }"></c:out></td>

	</tr>
	</c:forEach>
</table>


</body>
</html>