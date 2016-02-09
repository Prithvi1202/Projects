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
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			st = con.createStatement();
		}
		catch(Exception ex){
			
		}
	}
%>
</head>
<body>
<table>
<%
try{
	ResultSet rs = st.executeQuery("select * from books");
	while(rs.next()){
		%>
		<tr>
			<td><%= rs.getInt(1) %></td>
			<td><%= rs.getString(2) %></td>
			<td> <%= rs.getDouble(3) %></td>
			<td> <%= rs.getString(4) %></td>
		</tr>
	<%
	}
}catch(Exception ex){}
%>
</table>
</body>
</html>