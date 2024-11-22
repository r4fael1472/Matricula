<%@ page import="model.ClassAluno" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<%String nome = session.getAttribute("nome").toString();%>

<%if (nome == null) { %>

<% response.sendRedirect("erro.jsp"); %>
<% }else { %>
<%= "Olá " + nome %>
<% }%>


<h1>Página de cadastro</h1>
</body>
</html>
