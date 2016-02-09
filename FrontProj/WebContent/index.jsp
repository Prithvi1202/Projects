<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<style>
		h2{
		color:blue;
}
	
</style>
</head>
<%@ page import="java.util.Date,java.sql.*" %>
<body>
Hello!
<%!

	Date date = new Date();


%>
<%
	String name = "java";
	out.println(name);
	Date date2 = new Date(); 
	out.println(date);
%>
<!-- -expression tag to add any variable in html tag, we can add before the head-->
<h2>The date is:<%= date2 %></h2>
</body>
</html>