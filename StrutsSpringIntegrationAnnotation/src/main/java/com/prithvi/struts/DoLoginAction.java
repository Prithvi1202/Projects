package com.prithvi.struts;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;


@Action("/dologin")
@ResultPath("/WEB-INF/views")
@Results({
	@Result(name="success", location="LoginSuccess.jsp"),
	@Result(name ="error", location="LoginError.jsp")
})
public class DoLoginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private UserDAO userDAO;
	private User user;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String execute(){
		if(userDAO.checkLogin(user)){
			return SUCCESS;
		}
		return ERROR;
	}
	
}
