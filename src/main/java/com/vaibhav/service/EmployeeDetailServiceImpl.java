package com.vaibhav.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhav.dao.EmployeeDetailDao;
import com.vaibhav.model.EmployeeDetail;
@Service
public class EmployeeDetailServiceImpl implements EmployeeDetailService {

	private EmployeeDetailDao employeeDetailDao;
	
	@Autowired
	public EmployeeDetailServiceImpl(EmployeeDetailDao employeeDetailDao) {
		this.employeeDetailDao = employeeDetailDao;
	}
	@Override
	public List<EmployeeDetail> findAll() {
		return employeeDetailDao.findAllDetails();
	}

}
