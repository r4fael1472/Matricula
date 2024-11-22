<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>





<html>
<head>
  <meta charset="UTF-8">
  <title>Login</title>
</head>
<body>

<%
  String erro = (String) request.getAttribute("Erro");
  if (erro != null) {
%>
<%= erro %>
<%
  }
%>




<h1>Login</h1>

<form action="Login"  method="POST">

  <input type="text" name="login"><br/>
  <input type="text" name="senha"><br/>
  <input type="submit" name="Enviar">

</form>




</body>
</html>
