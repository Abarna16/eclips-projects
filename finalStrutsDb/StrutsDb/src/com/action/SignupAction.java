package com.action;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.form.SignupForm;
import com.db.SignupDb;
import javax.servlet.*;
import javax.servlet.http.*;
public class SignupAction extends Action {

	public ActionForward execute(ActionMapping mapping,ActionForm form,HttpServletRequest request,HttpServletResponse response) throws Exception
	
	{
		SignupForm signup=(SignupForm)form;
		String userName=signup.getUserName();
		String password=signup.getPassword();
		SignupDb db=new SignupDb();
		db.insertData(userName,password);
		
		
		return mapping.findForward("success");
	}
}
