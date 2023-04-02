package com.yedam.homework0331;

public class EmpDept extends Employee {
	//필드
	private String departmentName;
	
	//생성자
	public EmpDept(String empName ,int salary, String departmentName) {
		super(empName,salary);
		this.departmentName = departmentName;
	}

	
	//메서드
	public String getDepartmentName() {
		return departmentName;
	}


	@Override
	public void getInfotmation() {
		System.out.println("사원이름:" + this.empName + " 연봉:" + this.salary + " 부서:" + this.departmentName);
	}


	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
}
