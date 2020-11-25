package com.beebank.base;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@ControllerAdvice
public class WebMvcAdapter extends WebMvcConfigurerAdapter{

}
