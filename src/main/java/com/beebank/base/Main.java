package com.beebank.base;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext aop = new AnnotationConfigApplicationContext(AopConfig.class);
//		DemoAnnotationService demo = aop.getBean(DemoAnnotationService.class);
//		DemoMethodService demoMethod = aop.getBean(DemoMethodService.class);
//		demo.add();
//		demoMethod.add();
		
//		
//		AnnotationConfigApplicationContext scope = new AnnotationConfigApplicationContext(MyMvcConfig.class);
//		DemoSingletoService de1 = scope.getBean(DemoSingletoService.class);
//		DemoPrototypeService ds1 = scope.getBean(DemoPrototypeService.class);
//		DemoSingletoService de2 = scope.getBean(DemoSingletoService.class);
//		DemoPrototypeService ds2 = scope.getBean(DemoPrototypeService.class);
//		System.out.println(de1.equals(de2));
//		System.out.println(ds1.equals(ds2));
//		ElConfig elConfig=aop.getBean(ElConfig.class);
//		elConfig.outputResource();
//		AnnotationConfigApplicationContext acp = new AnnotationConfigApplicationContext();
//		acp.getEnvironment().setActiveProfiles("dev");
//		acp.register(ProfileConfig.class);
//		acp.refresh();
//		DemoBean demoBean = acp.getBean(DemoBean.class);
//		System.out.println(demoBean.getContent());
//		DemoPushLisher push = aop.getBean(DemoPushLisher.class);
//		push.push("我发布消息了哈，等你接受额");
//		AwareService awareService = aop.getBean(AwareService.class);
//		awareService.outputResult();
//		AsyncTaskService task = aop.getBean(AsyncTaskService.class);
//		for(int i=0;i<20;i++){
//			task.executeAsyncTask(i);
//			task.executeAsynTaskPlus(i);
//		}
		//ScheduledTaskSevice scheduledTaskSevice = acp.getBean(ScheduledTaskSevice.class);
		//acp.close();
		
	}
}
