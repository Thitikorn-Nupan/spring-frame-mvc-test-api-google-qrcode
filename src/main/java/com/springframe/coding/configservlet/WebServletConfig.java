package com.springframe.coding.configservlet;

import com.springframe.coding.configmvc.ConfigurationWeb;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/*
    this class equivalent web,servlet.xml file
*/
public class WebServletConfig implements WebApplicationInitializer {
    /*
    This is the typical configuration for a Spring MVC-based application with declaration for Spring’s DispatcherServlet along  with the Spring
    configuration ConfigurationWeb class Finally, it specifies the URL mapping for Spring’s DispatcherServlet to handle all requests.
    */
    private AnnotationConfigWebApplicationContext context;
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        context = new AnnotationConfigWebApplicationContext();
        context.register(ConfigurationWeb.class);
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("SpringMvc" , new DispatcherServlet(context));
        /* both is Interface */
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
}
