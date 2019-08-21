package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;
import org.apache.log4j.Logger;

public class TestController extends DefaultServlet{
	private Logger log = Logger.getLogger(TestController.class);
	private void process(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		
		log.trace(req.getRequestURI());
		//log.trace(req.getRequestURL());
		//log.trace(req.getContextPath());
		String uriSansContext = req.getRequestURI().substring(req.getContextPath().length());
		//log.trace(uriSansContext);
		//log.trace(uriSansContext.startsWith("/static"));
		if(uriSansContext.startsWith("/static")) {
			log.trace("This is static content!");
			super.doGet(req, resp);
		}
		//haha
	}

}
