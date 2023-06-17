<%@ page language="java" 
         contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"
         import="test.LoginDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String fName=new LoginDAO().login(request);
if(fName==null)
{
	out.println("Invalid userName or password..<br>");
%>
<jsp:include page="login.html"/>
<%
}
else
{
%>
	<jsp:forward page="Welcome.jsp">
	<jsp:param value="<%=fName %>" name="fName"/>
	</jsp:forward>
	<%
}
%>
</body>
</html>