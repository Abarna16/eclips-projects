package oo;
import java.io.IOException;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
//import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.Calendar;  
import javax.servlet.jsp.JspException;  
import javax.servlet.jsp.JspWriter;  
import javax.servlet.jsp.tagext.TagSupport;  
public class Handler extends TagSupport{  
  private String show;
  public void setShow(String show)
  {
	  this.show=show;
  }
public int doStartTag() throws JspException {  
    JspWriter out=pageContext.getOut();
    try{ 
    	if(show=="true")
    	{
    		return EVAL_BODY_INCLUDE;
    		
    	}
    	
    }
    catch(Exception e){System.out.println(e);}  
   
    return SKIP_BODY;
}
}

