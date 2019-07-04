<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
<body>
<html:form action="/Login">
Enter userName:
<html:text name="LoginForm" property="user"/>
Enter password:
<html:password name="LoginForm" property="password"/>
<html:submit value="Login"/>
</html:form>
</body>
</html>