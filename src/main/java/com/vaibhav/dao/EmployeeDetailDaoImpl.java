package com.vaibhav.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vaibhav.model.EmployeeDetail;

@Repository
public class EmployeeDetailDaoImpl implements EmployeeDetailDao{
	
	//define field for entitymanager 
	private EntityManager entityManager;
	
	//set up constructor injection
	@Autowired
	public EmployeeDetailDaoImpl(EntityManager entityManager)
	{
			this.entityManager = entityManager;
	}
	
	public List<EmployeeDetail> findAllDetails()
	{
		TypedQuery<EmployeeDetail> typedQuery = entityManager.createQuery("from EmployeeDetail", EmployeeDetail.class);
		return typedQuery.getResultList();
	}

}
