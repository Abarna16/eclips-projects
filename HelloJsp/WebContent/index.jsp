<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>second Jsp File</title>
</head>
<body>
<%@ include file="index.html" %>
<%= new java.util.Date() %>
<%="hii "+pageContext.getAttribute("name",PageContext.SESSION_SCOPE)+"<br>"+" context variable :"+pageContext.getAttribute("name",PageContext.APPLICATION_SCOPE)+"<br>" %>
</body>
</html>