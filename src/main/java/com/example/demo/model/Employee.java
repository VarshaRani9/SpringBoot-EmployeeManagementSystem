package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {

  	@Id
  	@GeneratedValue(strategy = GenerationType.AUTO)
  	private long id;

  	@Column(name = "name")
  	private String name;

  	@Column(name = "department")
  	private String department;
  
  	@Column(name = "email")
  	private String email;

  	public Employee() {

  	}

  	public Employee(String name, String department, String email) {
  		this.name = name;
  		this.department = department;
  		this.email = email;
  	}

  	public long getId() {
  		return id;
  	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", name=" + name + ", dept=" + department + ", email=" + email + "]";
	}

}
