/*
 * package com.zoho; import javax.servlet.*;
 * 
 * public class RequestLitener implements ServletRequestListener { public void
 * requestInitialized(ServletRequestEvent req) {
 * System.out.println("Request initiated"); } public void
 * requestDestroyed(ServletRequestEvent req) {
 * System.out.println("Request Destroyed"); }
 * 
 * 
 * }
 */

package com.zoho;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.Level; 
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;



public class RequestListener implements ServletRequestListener  {

	public void requestInitialized(ServletRequestEvent event) {
		HttpServletRequest req=(HttpServletRequest) event.getServletRequest();
		System.out.println("request is initiated"+req.getMethod());
		boolean append = true;
	    FileHandler handler = null;
		try {
			handler = new FileHandler("D://loger1.log", append);
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    SimpleFormatter formatter = new SimpleFormatter();  
	    handler.setFormatter(formatter);
	    
	    Logger logger = Logger.getLogger("logger");
	    logger.addHandler(handler);
	     
	  
	logger.info("Info message :"+"httpmethod : "+req.getMethod()+"  user-agent :" +req.getHeader("user-agent")+"  page :" +req.getHeader("referer")+" Time of request"+java.time.LocalTime.now());
	logger.severe("severe message :<br>"+"httpmethod : "+req.getMethod()+"  user-agent :" +req.getHeader("user-agent")+"  page :" +req.getHeader("referer")+" Time of request"+java.time.LocalTime.now());
	logger.warning("warning message");
	 
	  
	 
	  logger.config("config message :<br>"+"httpmethod : "+req.getMethod()+"  user-agent :" +req.getHeader("user-agent")+"  page :" +req.getHeader("referer")+" Time of request"+java.time.LocalTime.now());
	 
	  logger.fine("fine message<br>"+"httpmethod : "+req.getMethod()+"  user-agent :" +req.getHeader("user-agent")+"  page :" +req.getHeader("referer")+" Time of request"+java.time.LocalTime.now());
	 
	  logger.finer("finer message :<br>"+"httpmethod : "+req.getMethod()+"  user-agent :" +req.getHeader("user-agent")+"  page :" +req.getHeader("referer")+" Time of request"+java.time.LocalTime.now());
	 
	  logger.finest("finest message :<br>"+"httpmethod : "+req.getMethod()+"  user-agent :" +req.getHeader("user-agent")+"  page :" +req.getHeader("referer")+" Time of request"+java.time.LocalTime.now());
	         
		

	}

	
	public void requestDestroyed(ServletRequestEvent event) {
		System.out.println("request is destroyed");
	}

	
}