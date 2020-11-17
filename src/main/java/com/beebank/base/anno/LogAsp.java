package com.beebank.base.anno;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LogAsp {
	@Pointcut("@annotation(com.beebank.base.anno.Action)")
	public void annotationPointCut(){
		
	}
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint){
		MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
		Method method = methodSignature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解拦截名称"+ action.name());
	}
	@Before("execution(* com.beebank.base.service.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint){
		MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
		Method method = methodSignature.getMethod();
		System.out.println("方法规则拦截名称"+ method.getName());
	}
	
}
