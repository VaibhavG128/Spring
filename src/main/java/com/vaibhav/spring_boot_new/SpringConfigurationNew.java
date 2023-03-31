package com.vaibhav.spring_boot_new;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import com.vaibhav.dao.StudentDao;
import com.vaibhav.model.Student;

@SpringBootApplication(scanBasePackages = {"com.vaibhav"})
@EntityScan(basePackages = {"com.vaibhav.model"})
public class SpringConfigurationNew {
	public static void main(String args[])
	{
		SpringApplication.run(SpringConfigurationNew.class,args );
	}
	/**
	 * @auther - Vaibhav Garg
	 * @date - Mar 26, 2023
	 * @returntype - CommandLineRunner
	 */
	/*
	 * @Bean public CommandLineRunner commandLineRunner(StudentDao studentDao) {
	 * return runner->{ createStudent(studentDao); }; }
	 */
	/**
	 * @auther - Vaibhav Garg
	 * @date - Mar 26, 2023
	 * @returntype - void
	 */
//	private void createStudent(StudentDao stdao)
//	{
//		Student stud = new Student("Vaibhav", "FIFTH");
//		stdao.save(stud);
////		System.err.println(stdao.findBuId(1));
////		System.err.println(stdao.findBuId(2));
////		System.err.println(stdao.findBuId(3));
////		System.err.println("list + "+stdao.findAllDetails());
////		System.err.println("sp "+stdao.findAllClasses("b"));
////		stdao.updateStudent(2);
////		stdao.deleteSingleUser(1);
////		stdao.deletebyClasses();
//
//	}

}
