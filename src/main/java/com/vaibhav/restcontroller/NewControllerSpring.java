package com.vaibhav.restcontroller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.exception.CustomExceptionHandler;
import com.vaibhav.exception.StudentNotFoundException;
import com.vaibhav.util.StudentUtil;

@RestController
@RequestMapping("/test")
public class NewControllerSpring {
	List<StudentUtil> studentList = new ArrayList<StudentUtil>();
	@PostConstruct
	public void loadData()
	{
		StudentUtil s1 = new StudentUtil("ram", "gupta");
		StudentUtil s2 = new StudentUtil("shyam", "gupta");
		StudentUtil s3 = new StudentUtil("kalu", "gupta");
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
	}
	
	@GetMapping("/hello")
	public String helloWorldMethod()
	{
		return "Hello World";
	}
	
	@GetMapping("/getStudent")
	public List<StudentUtil> getStudent()
	{
		
		return studentList;
	}
	
//	@GetMapping("/students/{studentId}")
//	public StudentUtil getStudent(@PathVariable int studentId)
//	{
//		return studentList.get(studentId);
//	}
	
	@GetMapping("/students/{studentId}")
	public StudentUtil getStudent(@PathVariable int studentId)
	{
		if((studentId >= studentList.size())||(studentId<0))
		{
			throw new StudentNotFoundException("student id not found - " + studentId);
		}
		
		return studentList.get(studentId);
	}
	
	//add handler custom exception
	@ExceptionHandler
	public ResponseEntity<CustomExceptionHandler> handleException(StudentNotFoundException ex)
	{
		CustomExceptionHandler cus = new CustomExceptionHandler();
		cus.setStatus(HttpStatus.NOT_FOUND.value());
		cus.setMessage(ex.getMessage());
		cus.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(cus,HttpStatus.NOT_FOUND);
	}
	
	// add handler to generic exception which accept all types of error
//	
//	@ExceptionHandler
//	public ResponseEntity<CustomExceptionHandler> handlerException(Exception exc)
//	{
//		CustomExceptionHandler cus = new CustomExceptionHandler();
//		cus.setStatus(HttpStatus.NOT_FOUND.value());
//		cus.setMessage(exc.getMessage());
//		cus.setTimeStamp(System.currentTimeMillis());
//		return new ResponseEntity<>(cus,HttpStatus.NOT_FOUND);
//	}
	}
