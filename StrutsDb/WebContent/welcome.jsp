<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%-- <logic:equal name="username" value="abar">
equal 
</logic:equal>
<logic:notEqual name="username" value="abar1">
not equal
</logic:notEqual> --%>
<c:choose>
        <c:when test="${not empty sessionScope.username}">
           <center>Login successfull!!!</center>
           
        </c:when>
        <c:otherwise>
            <h1>incorrect</h1>
        </c:otherwise>
</c:choose>

</body>
</html>