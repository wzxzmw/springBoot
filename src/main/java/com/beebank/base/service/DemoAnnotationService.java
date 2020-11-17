package com.beebank.base.service;

import org.springframework.stereotype.Service;

import com.beebank.base.anno.Action;

@Service
public class DemoAnnotationService {
	
	@Action(name ="注解拦截的add操作")
	public void add(){
		System.out.println("demoAnnotationService 执行了");
	}
}
