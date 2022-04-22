package com.omkar.LoveCalculator.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorWebInitializer// implements WebApplicationInitializer
{

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		
//		1) get the config file using xml way

//		XmlWebApplicationContext webContext = new XmlWebApplicationContext();
//		webContext.setConfigLocation("classpath:applicationConfig.xml");

//		1) get the config file using annotation way

		AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
		webContext.register(LoveCalculatorConfig.class);;

		
		//	    2) set  up the disptacher servelt. 
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webContext);
		
		Dynamic myCustomerDispatcherServlet = servletContext.addServlet("customerDispatcher", dispatcherServlet);
		
		myCustomerDispatcherServlet.setLoadOnStartup(1);
		myCustomerDispatcherServlet.addMapping("/home/*");
	}

}
