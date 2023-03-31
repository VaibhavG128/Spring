package com.vaibhav.service;

import org.springframework.stereotype.Component;


public class CricketCoach implements Coach {
	
	public CricketCoach()
	{
		System.out.println("initialise CricketCoach"+getClass().getName());
	}

	public String getCoachDetails() {
		return "it is a Cricket Coach";
	}

}
