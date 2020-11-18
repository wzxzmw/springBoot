package com.beebank.base.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

	@Override
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("我 bean-demoListenter 接受到了 bean-demoPushlisher发布的消失"+ msg);
	}

}
