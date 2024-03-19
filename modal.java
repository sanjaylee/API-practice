package com.example.test.Modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="lee")
public class modal {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="l_name")
	private String name;
	
	@Column(name="l_sal")
	private int salary;
	
	@Column(name="l_city")
	private String city;
	
	
	

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}

	

	@Override
	public String toString() {
		return "modal [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}

	
	
	

}
