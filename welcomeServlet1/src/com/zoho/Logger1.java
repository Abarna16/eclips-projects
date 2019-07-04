package com.zoho;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 @WebServlet("/Logger")
public class Logger1 extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
	String method=req.getMethod();
	PrintWriter object=res.getWriter();	 
	object.write("hi");
		/*
		 * boolean append = true; FileHandler handler = new
		 * FileHandler("D://default.log", append); SimpleFormatter formatter = new
		 * SimpleFormatter(); handler.setFormatter(formatter);
		 * 
		 * Logger logger = Logger.getLogger("logger"); logger.addHandler(handler);
		 * 
		 * 
		 * 
		 * logger.info("httpmethod : "+method+"  user-agent :"
		 * +req.getHeader("user-agent")+"  page :"
		 * +req.getHeader("referer")+" Time of request"+java.time.LocalTime.now());
		 * 
		 * 
		 */
}
}
