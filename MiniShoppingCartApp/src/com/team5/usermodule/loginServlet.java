package com.team5.usermodule;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

 
public class loginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
     String userId = request.getParameter("uname");   
     String password = request.getParameter("pword");
     LoginService loginService = new LoginService();
     boolean result = loginService.authenticateUser(userId, password);
     User user = loginService.getUserByUserId(userId);
     if(result == true){
         request.getSession().setAttribute("user", user);  
         
         response.sendRedirect("index.jsp");
     }
     else{
         response.sendRedirect("login.jsp");
     }
}
}