package com.vaibhav.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.model.EmployeeDetail;
import com.vaibhav.service.EmployeeDetailService;

@RestController
@RequestMapping("/api")
public class EmployeeDetailRestController {

//	private EmployeeDetailDao employeeDetailDao;
	private EmployeeDetailService employeeDetailService;
//	public EmployeeDetailRestController(EmployeeDetailDao employeeDetailDao)
//	{
//		this.employeeDetailDao = employeeDetailDao;
//	}

	/**
	 * @auther - Vaibhav Garg
	 * @date - Apr 2, 2023
	 * @returntype - List<EmployeeDetail>
	 */
	public EmployeeDetailRestController(EmployeeDetailService employeeDetailService)
	{
		this.employeeDetailService = employeeDetailService;
	}
	
	/**
	 * @auther - Vaibhav Garg
	 * @date - Apr 2, 2023
	 * @returntype - List<EmployeeDetail>
	 */
	@GetMapping("/employeesdetails")
	public List<EmployeeDetail> findAll()
	{
		return employeeDetailService.findAll();
	}
}
