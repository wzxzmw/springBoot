package com.beebank.base.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	@Value("其他类的属性")
	private String another;
	private String name;
	public String getAnother() {
		return another;
	}
	public void setAnother(String another) {
		this.another = another;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
