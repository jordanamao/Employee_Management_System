package com.collabera.jump;

public class Employee {
	
	private int id;
	private String lastName;
	private String firstName;
	private Department department;
	
	
	 public Employee(){};
		 

	
	public Employee(int id, String lastName, String firstName, Department department) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.department = department;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id = " + id + ", lastName = " + lastName + ", firstName = " + firstName + ", department = "
				+ department + "]";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public Department getDepartment() {
		return department;
	}
	

	public void setDepartment(Department department) {
		this.department = department;
	
	}
	

	
}
