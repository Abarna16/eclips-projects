package com.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class LoginForm extends ActionForm {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String userName;
String password;
public void setUserName(String userName)
{
	this.userName=userName;
}
public void setPassword(String password)
{
	this.password=password;
}
public String getUserName()
{
	return this.userName;
}
public String getPassword()
{
	return this.password;
}
public void reset(ActionMapping mapping,HttpServletRequest request)
{
	this.userName=null;
	this.password=null;
}
}
