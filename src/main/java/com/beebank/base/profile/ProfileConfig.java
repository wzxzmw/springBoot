package com.beebank.base.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.beebank.base.bean.DemoBean;

@Configuration
public class ProfileConfig {
	@Bean
	@Profile("dev")
	public DemoBean devDemoBean(){
		return new DemoBean("from development profile");
	}
	@Bean
	@Profile("prod")
	public DemoBean prodDemoBean(){
		return new DemoBean("from production profile");
	}
}
