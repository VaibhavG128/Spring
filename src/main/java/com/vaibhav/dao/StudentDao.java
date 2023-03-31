package com.vaibhav.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vaibhav.model.Student;

public interface StudentDao {
	
	/**
	 * @auther - Vaibhav Garg
	 * @date - Mar 29, 2023
	 * @returntype - void
	 */
	void save(Student student);
	
	/**
	 * @auther - Vaibhav Garg
	 * @date - Mar 29, 2023
	 * @returntype - Student
	 */
	Student findBuId(int id);
	
	/**
	 * @auther - Vaibhav Garg
	 * @date - Mar 29, 2023
	 * @returntype - List<Student>
	 */
	List<Student> findAllDetails();

	/**
	 * 
	 * @auther - Vaibhav Garg
	 * @date - Mar 29, 2023
	 * @returntype - List<Student>
	 */
	List<Student> findAllClasses(String classes);
	
	/**
	 * 
	 * @auther - Vaibhav Garg
	 * @date - Mar 29, 2023
	 * @returntype - void
	 */
	void updateStudent(int id);
	
	/**
	 * @auther - Vaibhav Garg
	 * @date - Mar 29, 2023
	 * @returntype - void
	 */
	void deleteSingleUser(int id);
	
	/**
	 * @auther - Vaibhav Garg
	 * @date - Mar 29, 2023
	 * @returntype - void
	 */
	void deletebyClasses();
}
