package com.deloitte.estore.application;

import java.io.IOException;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.estore.model.Person;

import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImpl;

@WebServlet("/login")
public class LoginController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String uname=req.getParameter("tname");
		String upwd=req.getParameter("pwd");
		ProductService ps=new ProductServiceImpl();
		
		
		try {
			Person p = ps.getPersonById(uname);
		 
		
		String pwd=p.getPassword();
		System.out.println("username"+uname);
		
		if(pwd.equals(upwd))
		{	
			System.out.println("pwd"+pwd);
			HttpSession ssn=req.getSession();
			
			ssn.setAttribute("user",uname);
			res.sendRedirect("welcome.jsp");
		}
		else
		{
		res.sendRedirect("login.jsp");
		}
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
}
