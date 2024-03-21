package com.javaLinkedList;

public class Employee {
	
	private int employee_ID;
	private String employee_Name;
	private double employee_Salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employee_ID, String employee_Name, double employee_Salary) {
		this.employee_ID = employee_ID;
		this.employee_Name = employee_Name;
		this.employee_Salary = employee_Salary;
	}

	public int getEmployee_ID() {
		return employee_ID;
	}

	public void setEmployee_ID(int employee_ID) {
		this.employee_ID = employee_ID;
	}

	public String getEmployee_Name() {
		return employee_Name;
	}

	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}

	public double getEmployee_Salary() {
		return employee_Salary;
	}

	public void setEmployee_Salary(double employee_Salary) {
		this.employee_Salary = employee_Salary;
	}

	
	public String getDetails() {
		return "Employee [employee_ID=" + employee_ID + ", employee_Name=" + employee_Name + ", employee_Salary="
				+ employee_Salary + "]";
	}
	
	
}
