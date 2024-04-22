package com.cerner.config;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import io.swagger.jaxrs.config.BeanConfig;

public class SwaggerConfig extends HttpServlet{
	
	
	
	public  void init(ServletConfig config) throws ServletException{
	super.init(config);
	
	BeanConfig beanconfig = new BeanConfig();
	beanconfig.setBasePath("/PatientManagement/api");
	beanconfig.setHost("localhost:8080");
	beanconfig.setTitle("Swagger Docs");
	beanconfig.setResourcePackage("com.cerner");
	beanconfig.setPrettyPrint(true);
	beanconfig.setScan(true);
	beanconfig.setSchemes(new String[] {"http","https"});
	beanconfig.setVersion("1.0");
}

}
