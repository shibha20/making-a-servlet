package com.addServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		HttpSession session = req.getSession();
		
		//can also remove attribute
		//session.removeAttribute("k");
		
		int k = (int) session.getAttribute("k");

		PrintWriter out = res.getWriter();
		out.println("Result is " + k);
	}

}
