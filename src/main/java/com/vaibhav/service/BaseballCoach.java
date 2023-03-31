package com.vaibhav.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseballCoach implements Coach {
	
	public BaseballCoach()
	{
		System.out.println("initialise BaseballCoach"+getClass().getName());
	}
	public String getCoachDetails()
	{
		return "it is a Coach";
		
	}

}
