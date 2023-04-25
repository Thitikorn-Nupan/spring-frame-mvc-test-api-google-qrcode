package com.springframe.coding.configmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/*
    this class equivalent web.xml , servlet.xml file
*/
@EnableWebMvc
/* <mvc:annotation-driven/>  tells the framework to use annotations-based approach to scan files in the specified packages. So we can use the @Controller annotation for the controller class */
@ComponentScan(value = "com.springframe.coding")
/* <context:component-scan/> Scan starts from base package and registers all controllers, repositories, service, beans, etc */
public class ConfigurationWeb extends WebMvcConfigurerAdapter {

    private InternalResourceViewResolver viewResolver;

    @Bean
    private InternalResourceViewResolver getViewResolver() {
        viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/ui/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        /* maps static resources directly with HTTP GET requests. For example images, javascript, CSS,.. resources do not have to go through controllers.  */
        registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/css/");
        registry.addResourceHandler("/image/**").addResourceLocations("/WEB-INF/image/");
    }

}
