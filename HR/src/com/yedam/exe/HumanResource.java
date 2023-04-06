package com.yedam.exe;

import java.util.Scanner;

import com.yedam.employees.EmpImpl;

public class HumanResource {
	Scanner sc = new Scanner(System.in);
	EmpImpl ei = new EmpImpl();
	
	public HumanResource() {
		run();
	}
	
	private void run(){
		//메뉴 - 기능
		//1) 로그인
		//2) 회원가입
		//3) 등급관리
		
		while(true) {
		System.out.println("1. 전체조회  | 2. 단건조회  | 3. 사원등록  | 4. 정보수정  | 5. 정보삭제  |   99.종료 ");
		System.out.println("메뉴>");
		int menu = Integer.parseInt(sc.nextLine());
		if(menu ==1 ) {
			ei.getEmployeesList();
		}else if(menu ==2 ) {
			ei.getEmployee();
		}else if(menu ==3) {
			ei.empAdd();	
		}else if(menu ==4){
			ei.empUpdate();
		}else if(menu ==5){
			ei.empDelete();
		}else if(menu == 99) {
			System.out.println("end of prog");
			break;
		}
		}
	}

}