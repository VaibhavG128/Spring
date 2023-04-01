package com.vaibhav.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")
public class EmployeeDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "email")
	private String email;

	//getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EmployeeDetail()
	{
		
	}
	
	public EmployeeDetail(int id, String name, String lastname, String email) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmployeeDetail [id=" + id + ", name=" + name + ", lastname=" + lastname + ", email=" + email + "]";
	}
	
	
	
}
