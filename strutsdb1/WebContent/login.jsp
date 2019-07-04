<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<html:html>
<html:form action="/login" method="get">
Enter user name:<br>
<html:text property="userName"/><br>
Enter password:<br>
<html:text property="password"/><br>
<html:submit>submit</html:submit>
</html:form>
</html:html>
</body>
</html>