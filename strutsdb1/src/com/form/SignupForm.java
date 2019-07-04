package com.form;
import org.apache.struts.action.ActionForm;
public class SignupForm extends ActionForm {
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
}
