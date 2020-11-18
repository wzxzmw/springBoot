package com.beebank.base.event;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent {
	
	private String msg;
	
	public DemoEvent(Object source,String msg) {
		super(source);
		this.msg = msg;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
