package com.yedam.homework0331;

public class Employee {
	//필드 
	String empName;
	int salary;
	
	//생성자
	public Employee(String empName , int salary){
		this.empName = empName;
		this.salary = salary;
	}
	//메서드
	public void getInfotmation() {
		System.out.println("사원이름 : " + this.empName + " 연봉 : " + this.salary);
	}
	
	public void print() {
		System.out.println("수퍼클래스");
	}
	
	public String getEmpName() {
		return empName;
	}

	public int getSalary() {
		return salary;
	}

	
}
