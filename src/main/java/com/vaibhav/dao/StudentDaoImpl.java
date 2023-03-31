package com.vaibhav.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vaibhav.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	private EntityManager entityManager;
	
	@Autowired
	public StudentDaoImpl(EntityManager entityManager)
	{
		this.entityManager = entityManager; 
	}
	@Override
	@Transactional
	public void save(Student student) {
		System.out.println(student.getName());
		entityManager.persist(student);
	}
	@Override
	public Student findBuId(int id) {
		return entityManager.find(Student.class, id);
	}
	@Override
	public List<Student> findAllDetails() {
		// TODO Auto-generated method stub
		TypedQuery<Student> typedQuery = entityManager.createQuery("from Student order by classes desc", Student.class);
		return typedQuery.getResultList();
	}
	@Override
	public List<Student> findAllClasses(String classes) {
		TypedQuery<Student> typedQuery = entityManager.createQuery("from Student where classes =: theData", Student.class);
		//setQury param
		typedQuery.setParameter("theData", classes);
		
		
		return typedQuery.getResultList();
	}
	@Override
	@Transactional
	public void updateStudent(int id) {
		Student st = findBuId(id);
		System.err.println("Before Update ==> "+findBuId(id));
		st.setName("kalu");
		entityManager.merge(st);
		System.err.println("after "+findBuId(id));
		// TODO Auto-generated method stub
		
	}
	
	@Override
	@Transactional
	public void deleteSingleUser(int id) {
		Student st = findBuId(id);
		System.err.println("Before Update ==> "+findAllDetails());
		entityManager.remove(st);
		System.err.println("after "+ findAllDetails());
		
	}
	@Override
	@Transactional
	public void deletebyClasses() {
		System.err.println("Before Update ==> "+findAllDetails());
		entityManager.createQuery("delete from Student where name = 'vaibhav'").executeUpdate();
		System.err.println("after "+ findAllDetails());
		
	}
	
	


}
