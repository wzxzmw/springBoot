package com.beebank.base.service;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware {
	private String beanName;
	private ResourceLoader resourceLoader;
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
	public void outputResult(){
		System.out.println("Bean的名称" + beanName);
		Resource resource = resourceLoader.getResource("classpath:com/beebank/base/service/test.txt");
		try {
			System.out.println("resource 加载的文件内容"+ IOUtils.toString(resource.getInputStream()));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
