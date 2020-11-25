package com.beebank.base;

import org.apache.commons.io.FileUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
public class MyMvcConfig {
	public InternalResourceViewResolver viewResovler(){
		InternalResourceViewResolver vierResovler = new InternalResourceViewResolver();
		vierResovler.setPrefix("/WEB-INF/classes/views");
		vierResovler.setSuffix(".jsp");
		vierResovler.setViewClass(JstlView.class);
		return vierResovler;
	}
}
