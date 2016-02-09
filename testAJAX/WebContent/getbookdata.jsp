
<jsp:useBean id="obj" class= "com.prithvi.bookservice1.BookService" /> 
 <%
 String bookId = request.getParameter("mybookid");
 String bookDetails = obj.getBookData(bookId);
 out.println(bookDetails);
 %>
