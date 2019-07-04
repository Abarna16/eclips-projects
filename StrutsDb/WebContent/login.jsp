<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

</style>
<body>
<h2>Login Form</h2>
<html:html>
<html:form action="/login1" method="get">
Enter user name:<br>
<html:text property="userName"/><br>
<html:errors property="userName"/>
Enter password:<br>
<html:text property="password"/><br>
<html:errors property="password"/>
<html:submit>submit</html:submit>
</html:form>
</html:html>
</body>
</html>