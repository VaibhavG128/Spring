package com.vaibhav.spring_boot_new;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vaibhav.service.Coach;

@RestController
public class DemoController {
	
	//Three types of autowiring
	//Constructor
	private Coach coach;
//	@Autowired
//	public DemoController(@Qualifier("cricketCoach") Coach coach)
//	{
//		this.coach = coach;
//	}
	
	//setter
	@Autowired
	public void setCoach(@Qualifier("demo7") Coach coach)
	{
		this.coach = coach;
	}
	
		//field
	
	@GetMapping(value="/")
	public String getMapping()
	{
		return coach.getCoachDetails();
	}

}
