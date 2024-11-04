package com.samuel.abb.server.services.login;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogIn {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    private String  userName;
    private String  passWord;
    private String  inValidUser;
    
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		 logger.info("user name set to " + userName);
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
		 logger.info("passWoed name set to " + passWord);
	}

	public String getInValidUser() {
		return inValidUser;
	}

	public void setInValidUser(String inValidUser) {
		this.inValidUser = inValidUser;
	}

	

}