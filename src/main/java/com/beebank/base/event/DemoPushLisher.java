package com.beebank.base.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPushLisher {
	 @Autowired
	 ApplicationContext applicationContext;
	 public void push(String msg){
		 applicationContext.publishEvent(new DemoEvent(this, msg));
	 }
}
