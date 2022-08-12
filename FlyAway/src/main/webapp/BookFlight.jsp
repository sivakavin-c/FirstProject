<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway</title>
</head>
<body >
<br>
<a href=HomePage.jsp style="color:black;text-decoration:none ;font-size:35px;font-weight:bold;">FlyAway</a>
<br><br>

<%
	@SuppressWarnings("unchecked")
	HashMap<String,String> user=(HashMap<String,String>)session.getAttribute("user");
	if(user==null){
		response.sendRedirect("UserPage.jsp");
	}
%>
<center>
<div style="align-items: center;border:3px solid black;width:25%;border-radius:20px;padding:20px" align="center">
<form action="#" method="post" style="margin: auto; width: 220px;">

  <h1>Payment form</h1>

  <section>
    <label for="cc-number">Card number</label>
    <input id="cc-number" name="cc-number" autocomplete="cc-number" inputmode="numeric" pattern="[\d ]{10,30}" required>
  </section>
<br>
  <section>
    <label for="cc-name">Name on card</label>
    <input id="cc-name" name="cc-name" autocomplete="cc-name" pattern="[\p{L} \-\.]+" required>
  </section>
<br>
  <section id="cc-exp-csc">
    <div>
      <label for="cc-exp">Expiry date</label>
      <input id="cc-exp" name="cc-exp" autocomplete="cc-exp" placeholder="MM/YY" maxlength="5" required>
    </div>
    <br>
    <div>
      <label for="cc-csc">Security code</label>
      <input id="cc-csc" name="cc-csc" autocomplete="cc-csc" inputmode="numeric" maxlength="3" required>
      <div class="explanation">Back of card, last 3 digits</div>
    </div>
  </section>
<br>
 <button><a href="success.jsp" style="text-decoration: none">Complete payment</a></button>

</form>
</div>
</center>
</body>
</html>