<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="java.util.logging.Level,java.util.logging.Logger, java.util.logging.SimpleFormatter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <jsp:include page="userprofile.jsp"/><br><br><br>
 --%>
<% String name=(String)session.getAttribute("username1");
session.invalidate(); 
final Logger LOGGER=Logger.getLogger("example");
LOGGER.log(Level.INFO,name+" Logged out");


%>

<center>logout successful</center>
</body>
</html>