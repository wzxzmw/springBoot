package com.beebank.base;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.beebank.base")
@EnableAspectJAutoProxy
public class AopConfig {

}
