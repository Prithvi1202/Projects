<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
  <%@ page import= "com.prithvi.bookservice.BookService" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id ="obj" class="com.prithvi.bookservice.BookService" />

<%
		obj.setId(Integer.parseInt(request.getParameter("id")));

		obj.setTitle(request.getParameter("title"));
	
		obj.setAuthor(request.getParameter("author"));
		
		int num = obj.insert();
		if(num > 0)
			out.print(num + "rows inserted! :) ");
		else
			out.print("Insertion failed! :(");
				
%>
</body>
</html>

