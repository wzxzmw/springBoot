package com.beebank.base;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beebank.base.service.DemoAnnotationService;
import com.beebank.base.service.DemoMethodService;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext aop = new AnnotationConfigApplicationContext(AopConfig.class);
		DemoAnnotationService demo = aop.getBean(DemoAnnotationService.class);
		DemoMethodService demoMethod = aop.getBean(DemoMethodService.class);
		demo.add();
		demoMethod.add();
		aop.close();
	}
}
