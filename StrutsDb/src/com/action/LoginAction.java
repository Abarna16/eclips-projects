package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.db.SignupDb;
import com.form.LoginForm;


public class LoginAction extends Action {

	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	
	{
		LoginForm login=(LoginForm)form;
		String userName=login.getUserName();
		String password=login.getPassword();
		SignupDb db=new SignupDb();
		boolean res=db.checkData(userName,password);
		if(res)
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", userName);
		return mapping.findForward("welcome");
		
		}return mapping.findForward("failure");
		
	}
}