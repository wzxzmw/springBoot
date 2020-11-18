package com.beebank.base.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

	@Async
	public void executeAsyncTask(int i){
		System.out.println("执行异步任务"+i);
	}
	@Async
	public void executeAsynTaskPlus(int i){
		System.out.println("执行异步任务+1"+(i+1));
	}
}
