package com.vaibhav.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vaibhav.model.EmployeeDetail;

@Repository
public interface EmployeeDetailDao {

	/**
	 * @auther - Vaibhav Garg
	 * @date - Apr 2, 2023
	 * @returntype - List<EmployeeDetail>
	 */
	List<EmployeeDetail> findAllDetails();

}
