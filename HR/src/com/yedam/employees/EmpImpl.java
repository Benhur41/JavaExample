package com.yedam.employees;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class EmpImpl {
	//EmpDAO 에서 실행한 쿼리문을 JAVA 에서 활용 부분
	Scanner sc = new Scanner(System.in);
	// 1.전체 조회
	public void getEmployeesList() {//EmpDAO 클래스의 메소드 이름과 같은 이유는 둘이 연관되어있기때문
		//singleton 활용해서 getEmployeesList 사용
		List<EmpDTO> list = EmpDAO.getInstance().getEmployeesList();//조회한 값 List<EmpDTO>
		
		for(int i = 0 ; i< list.size(); i++) {
			System.out.println("사번 : " + list.get(i).getEmployeeId());
			System.out.println("이름 : " + list.get(i).getLastName());
			System.out.println("급여 : " + list.get(i).getSalary());
			System.out.println("입사일 : " + list.get(i).getHireDate());
		}
		
	}
	
	//2.단건 조회
	public void getEmployee() {
		System.out.println("조회할 사번>");
		int employee_id = Integer.parseInt(sc.nextLine());
		EmpDTO emp = EmpDAO.getInstance().getEmployees(employee_id);
		
		if(emp == null) {
			System.out.println("해당 사원은 존재하지 않습니다.");
		}else {
			System.out.println("사번 : " +emp.getEmployeeId());
			System.out.println("이름 : "+emp.getLastName());
			System.out.println("급여 : "+emp.getSalary());
			System.out.println("입사일 : "+emp.getHireDate());
		}
	}
	
	//3.추가
	public void empAdd() {
		EmpDTO emp = new EmpDTO();
		
		System.out.println("사번>");
		int empId = Integer.parseInt(sc.nextLine());
		System.out.println("이름>");
		String empName = sc.nextLine();
		System.out.println("이메일>");
		String empEmail = sc.nextLine();
		System.out.println("입사일>");
		//입력한 문자열 ->  java.sql.data 로 변환해준다
		Date empDate = Date.valueOf(sc.nextLine());
		System.out.println("직책>");
		String empJob = sc.nextLine();
		
		emp.setEmployeeId(empId);
		emp.setLastName(empName);
		emp.setEmail(empEmail);
		emp.setHireDate(empDate);
		emp.setJobId(empJob);
		
		int result = EmpDAO.getInstance().empAdd(emp);
		
		if(result == 1 ) {
			System.out.println("데이터 입력 성공");
		}else {
			System.out.println("데이터 입력 실패");
		}
		
	}
	
	//4. 수정
	public void empUpdate() {
		EmpDTO emp = new EmpDTO();
		System.out.println("사번 >");
		int empId = Integer.parseInt(sc.nextLine());
		System.out.println("수정 급여 >");
		double empSalary = Double.parseDouble(sc.nextLine());
		
		emp.setEmployeeId(empId);
		emp.setSalary(empSalary);
		
		int result = EmpDAO.getInstance().empUpdate(emp);
		
		if(result > 0 ) {
			System.out.println("수정 성공");
		}else if(result ==0) {
			System.out.println("수정 실패");
		}
	}
	
	//5.삭제
	public void empDelete() {
		System.out.println("삭제 사번>");
		int empId = Integer.parseInt(sc.nextLine());
		
		int result = EmpDAO.getInstance().empDelete(empId);
		
		if(result > 0) {
			System.out.println("정상 삭제");
		}else {
			System.out.println("삭제 실패");
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}
