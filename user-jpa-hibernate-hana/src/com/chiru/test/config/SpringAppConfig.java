package com.chiru.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan("com.chiru")
@Import(HibernateConfig.class)
public class SpringAppConfig {
	 @Bean  
	    public InternalResourceViewResolver setupViewResolver() {  
	    	InternalResourceViewResolver resolver = new InternalResourceViewResolver();  
	        resolver.setPrefix("/WEB-INF/views/");  
	        resolver.setSuffix(".jsp");  
	        resolver.setViewClass(JstlView.class);  
	        return resolver;  
	    }
}
