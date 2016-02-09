<%@ page import= "java.util.Date, java.sql.*" %>

<style>
	
</style>
<body>
Hello

<%!
		Date date = new Date();
%>
<%
	String name = "java";
	out.println(name);
	out.println(date);
%>

<h2> The date is : <%= date %></h2>
</body>
</html>