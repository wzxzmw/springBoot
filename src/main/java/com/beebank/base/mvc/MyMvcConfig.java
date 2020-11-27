package com.beebank.base.mvc;

<<<<<<< HEAD:src/main/java/com/beebank/base/mvc/MyMvcConfig.java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
=======
import org.apache.commons.io.FileUtils;
>>>>>>> 3a3edcd3837d787672f5ee533f2b7663b7487a8f:src/main/java/com/beebank/base/MyMvcConfig.java
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
