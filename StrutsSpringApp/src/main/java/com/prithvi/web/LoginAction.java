package com.prithvi.web;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
