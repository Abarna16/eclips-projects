<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="org.json.simple.*,java.util.Iterator,java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="userprofile.jsp"/><br><br><br>

<% JSONArray result=(JSONArray)request.getAttribute("obj");
if(!result.isEmpty())
{
	out.print("<center><b>Details!!!</b></center><br>");
JSONObject jo=(JSONObject)result.get(0);
out.println("Employee id is   : "+jo.get("empId")+"<br>");
out.println("Employee Name    : "+jo.get("empName")+"<br>");
out.println("Date of birth    : "+jo.get("dob")+"<br>");
out.println("Email Id         : "+jo.get("email")+"<br>");
out.println("Total salary is  : "+jo.get("net")+"<br>");

}
else
	out.print("your Id or Dob is incorrect...");
/* //Iterator<Map.Entry> it1=jo.entrySet().iterator();
while(it1.hasNext())
{
	Map.Entry pair=it1.next();
	out.println(pair.getKey()+" : "+pair.getValue());
	out.println("<br>");
}  */
%>
<%-- <%=result %> --%>
</body>
</html>