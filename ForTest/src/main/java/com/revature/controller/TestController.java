package com.revature.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;
import org.apache.log4j.Logger;

public class TestController extends DefaultServlet{
	private Logger log = Logger.getLogger(TestController.class);
	private void process(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		PrintWriter pw = resp.getWriter();
		log.trace(req.getRequestURI());
		pw.write("This is a test.");
	}

}
