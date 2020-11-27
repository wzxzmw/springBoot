package com.beebank.base.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan("com.beebank.base.mvc")
public class MyMvcConfig {
	@Bean
	public InternalResourceViewResolver viewResovler(){
		InternalResourceViewResolver vierResovler = new InternalResourceViewResolver();
		vierResovler.setPrefix("/WEB-INF/classes/views/");
		vierResovler.setSuffix(".jsp");
		vierResovler.setViewClass(JstlView.class);
		return vierResovler;
	}
}
