package com.addServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//every servlet class needs to extend httpservlet 
public class AddServlet extends HttpServlet{
	//every servlet method needs to be named service
	//doPost to make sure it only works with a post request
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		HttpSession session = req.getSession();
		session.setAttribute("k", k);
		
		res.sendRedirect("sq");
	}
	

}
