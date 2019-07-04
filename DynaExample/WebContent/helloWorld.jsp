<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
DynaForm value is: 
<bean:write name="dynaForm" property="message"/>
</body>
</html>