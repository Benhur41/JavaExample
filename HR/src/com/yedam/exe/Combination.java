package com.yedam.exe;

import java.util.Scanner;

public class Combination {
	Scanner sc = new Scanner(System.in);
	
	public Combination () {
		run();
	}
	
	public void run() {
		while(true) {
			System.out.println("1. 사원관리  |  2.부서관리  |  99.종료  ");
			int menu = Integer.parseInt(sc.nextLine());
			if(menu == 1) {
				new HumanResource();
			}else if(menu == 2) {
				new DeptInfo();
			}else if(menu == 99) {
				System.out.println("end of prog");
				break;
			}
		}
	}
}
