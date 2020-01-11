package com.deloitte.estore.application;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logout")
public class LogoutController extends HttpServlet{
		
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		HttpSession ssn=req.getSession();
		ssn.invalidate();
		res.sendRedirect("login.jsp");
	}
}
