package com.beebank.base.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
@EnableScheduling
@Service
public class ScheduledTaskSevice {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate=5000)
	public void reportCurrentTime(){
		System.out.println("每隔5秒执行一次"+sdf.format(new Date()));
	}
	//@Scheduled(cron="")
	public void fixTimeExecution(){
		System.out.println("在指定的时间"+sdf.format(new Date()));
	}
}
