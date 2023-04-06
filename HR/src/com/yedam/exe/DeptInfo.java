package com.yedam.exe;

import java.util.Scanner;

import com.yedam.departments.DeptImpl;

public class DeptInfo {
	
	Scanner sc = new Scanner(System.in);
	DeptImpl di = new DeptImpl();
	
	public DeptInfo() {
		run();
	}
	
	
	public void run() {
		while(true) {
			System.out.println("1. 전체 조회  |  2. 부서 정보 조회  |  3. 부서 등록  |  4. 부서 수정  |  5. 부서 삭제  |  99. 종료");
			int menu = Integer.parseInt(sc.nextLine());
			if(menu == 1) {
				di.getDeptList();
			}else if(menu == 2) {
				di.getDept();
			}else if(menu == 3) {
				di.deptAdd();
			}else if(menu == 4) {
				di.deptUpdate();
			}else if(menu == 5) {
				di.deptDelete();
			}else if(menu == 99) {
				System.out.println("end of prog");
				break;
			}
		}
	}
}
