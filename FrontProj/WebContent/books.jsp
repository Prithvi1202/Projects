<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import= "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%!
	Connection con;
	Statement st;
	
	public void jspInit(){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		st = con.createStatement();
	}catch(Exception e){
		e.printStackTrace();
	}
}
%>
</head>
<body>
<table border="1">
<%

try{
	ResultSet rs = st.executeQuery("select * from studentinfo");
	while(rs.next()){
 	%>
		
		<tr>
		<td><%= rs.getString(1) %></td>
		<td><%= rs.getInt(2) %></td>
		<td><%= rs.getString(3)%></td>
		</tr>
		<%
 		
	}
	}
	catch(Exception e){
	e.printStackTrace();
	}
	%>
</table>
</body>
</html>