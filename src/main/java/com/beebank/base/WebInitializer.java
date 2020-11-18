package com.beebank.base;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
public class WebInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		ac.register(MyMvcConfig.class);
		ac.setServletContext(servletContext);
		Dynamic serlvet = servletContext.addServlet("dispatcher", new DispatcherServlet(ac));
		serlvet.addMapping("/");
		serlvet.setLoadOnStartup(1);
	}

}
