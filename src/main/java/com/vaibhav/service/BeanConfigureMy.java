package com.vaibhav.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigureMy {
	
	
	//cricketCoach is the default id
	//demo7 ia actual id bean id
	
	@Bean("demo7")
	public Coach cricketCoach()
	{
		return new CricketCoach();
	}

}
