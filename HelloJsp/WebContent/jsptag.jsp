<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:out value="${'cout example' }"/>
<c:import url="index.html" var="data"/>
<c:out value="${data }"/>

<c:set var="data1" scope="session" value="${'hi' }"/>
<c:out value="${data1 }"/>

<c:remove var="data1"/>
<c:out value="${data1}"/>

 <c:catch var="data3">
<% int x = 5/0; %>
</c:catch>

<c:if test="${data3!= null} ">
<p>exception occured</p> 
</c:if>

 <%-- <c:catch var ="catchException">
         <% int x = 5/0;%>
      </c:catch>

      <c:if test = "${catchException != null}">
         <p>The exception is</p>
      </c:if> --%>

</body>
</html>