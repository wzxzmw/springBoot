package com.beebank.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.beebank.base")
@PropertySource("test.properties")
public class ElConfig {
	@Value("I LOVE YOU")
	private String normal;
	@Value("#{systemProperties['os.name']}")
	private String osName;
	@Value("#{T (java.lang.Math).random()*100.0}")
	private double randomNumber;
	@Value("#{demoService.another}")
	private String fromAnother;
//	@Value("I LOVE YOU")
//	private Resource testFile;
	@Value("www.baidu.com")
	private Resource testUrl;
	@Value("${book.autor}")
	private String bookname;
	@Autowired
	private Environment environment;
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	public void outputResource(){
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromAnother);
			System.out.println(testUrl);
			System.out.println(bookname);
			System.out.println(environment.getProperty("book.author"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
