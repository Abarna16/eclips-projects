package com.zoho;

import java.io.IOException;
import javax.servlet.http.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
@WebServlet("/WelcomePage")
public class WelcomePage extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter ob=response.getWriter();
		ob.println("Login Successfull");
		
}
}
