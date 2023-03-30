package com.yedam.oop;

import java.util.Scanner;

public class Application05 {
	public static void main(String[] args) {
		// 클래스 + 배열 => Student[] ary = new Student[10] -> 10개 공간에 학생 객체를 저장
		//int + 배열 => int[] ary = new int[10] -> 10 공간에 정수
		
		//1. 학생 수 | 2. 학생들 정보 입력 | 3. 학생들의 총점, 평균 | 4. 종료     
		//student class 객체로 ('김씨' , ...) (...) (...)
		Scanner sc = new Scanner(System.in);
		boolean run = true ; 
		Student[] stdAry = null;
		int stdCount = 0;
		while(run) {
			System.out.println("1. 학생 수 | 2. 학생들 정보 입력 | 3. 학생들의 총점, 평균 | 4. 종료  ");
			System.out.println("메뉴입력>");
			String selectNo = sc.nextLine();
			
			if(selectNo.equals("1")) {
				System.out.println("학생 수를 입력 하세요.");
				stdCount = Integer.parseInt(sc.nextLine());
				
			}else if(selectNo.equals("2")) {
				//입력 받은 학생 수 만큼의 배열 생성
				stdAry = new Student[stdCount];
				for(int i = 0 ; i < stdAry.length ; i++) {
					stdAry[i] = new Student();
					//객체를 생성하고 객체에 정보를 저장한 다음 ->  배열에 보관
					System.out.println("학생이름>");
					String name = sc.nextLine();
					stdAry[i].name = name;
					System.out.println("학번>");
					String id = sc.nextLine();
					stdAry[i].id = id;
					System.out.println("국어 성적>");
					int kor = Integer.parseInt(sc.nextLine());
					stdAry[i].kor = kor;
					System.out.println("영어 성적>");
					int eng = Integer.parseInt(sc.nextLine());
					stdAry[i].eng = eng;
					System.out.println("수학 성적>");
					int math = Integer.parseInt(sc.nextLine());
					stdAry[i].math = math;
				}
			}else if(selectNo.equals("3")) {
				int sum = 0;
				for(int i = 0 ; i < stdAry.length ; i++) {
					System.out.println("총점 : "+ stdAry[i].sum());
					System.out.println("평균 : "+ stdAry[i].avg());
				}
			}else if(selectNo.equals("4")) {
				System.out.println("종료하겠습니다");
				run = false;
			}
		}
	}
}
