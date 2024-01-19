package com.rahul.SpringJDBCAPI.dao;

public class Employee {
	private Integer id;
	private String city;
	private String name;
	private Double salary;
	
	public Employee() {
		System.out.println("Employee obj");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", city=" + city + ", name=" + name + ", salary=" + salary + ", getId()="
				+ getId() + ", getCity()=" + getCity() + ", getName()=" + getName() + ", getSalary()=" + getSalary()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
