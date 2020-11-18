package com.beebank.base;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beebank.base.service.DemoAnnotationService;
import com.beebank.base.service.DemoMethodService;
import com.beebank.base.service.DemoPrototypeService;
import com.beebank.base.service.DemoSingletoService;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext aop = new AnnotationConfigApplicationContext(AopConfig.class);
		DemoAnnotationService demo = aop.getBean(DemoAnnotationService.class);
		DemoMethodService demoMethod = aop.getBean(DemoMethodService.class);
		demo.add();
		demoMethod.add();
		
		AnnotationConfigApplicationContext scope = new AnnotationConfigApplicationContext(ScopeConfig.class);
		DemoSingletoService de1 = scope.getBean(DemoSingletoService.class);
		DemoPrototypeService ds1 = scope.getBean(DemoPrototypeService.class);
		DemoSingletoService de2 = scope.getBean(DemoSingletoService.class);
		DemoPrototypeService ds2 = scope.getBean(DemoPrototypeService.class);
		System.out.println(de1.equals(de2));
		System.out.println(ds1.equals(ds2));
		ElConfig elConfig=aop.getBean(ElConfig.class);
		elConfig.outputResource();
	}
}
