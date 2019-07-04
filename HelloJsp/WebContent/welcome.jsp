<html>  
<body>  
<%-- <%@ page errorPage="error.jsp" %> --%>
<% String name=request.getParameter("name"); 
out.print("welcome "+name+"<br>");  
application.setAttribute("ff","dd");
//session.setAttribute("name",name);
pageContext.setAttribute("name",name,PageContext.SESSION_SCOPE);
pageContext.setAttribute("name","abar",PageContext.APPLICATION_SCOPE);
pageContext.setAttribute("lang","JSON",PageContext.REQUEST_SCOPE);
//response.sendRedirect("index.jsp"); 
int a=Integer.parseInt(request.getParameter("name"));
int b=Integer.parseInt(request.getParameter("password"));
int c=a/b;
out.print(c);
int x=odd(a);
if(x==0)
out.print("<br>odd");
else
	out.print("<br>even");
%>
 <%! 
 int odd(int a)
 {
 if(a%2==0)
	 return 1;
 else
	 return 0;
 }
 %>
<%="<br>Driver name(config) : "+config.getInitParameter("driver") +
"<br>context parameter : "+application.getInitParameter("company")+
"<br>attribute name :"+application.getAttribute("ff")+"<br>" +"request attribute :"+pageContext.getAttribute("lang",PageContext.REQUEST_SCOPE)
 %> <!--  -->  
<% this.log("message"); %>
<a href="index.jsp">Click me</a> 
  
 
</body>  
</html>  