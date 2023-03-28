package com.yedam.loop;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		//1~100 사이에서 2의 배수만 출력
//		
//		int i = 1;//초기값
//		while(i<=100){//조건식 {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//			i++;//증감식
//		}
		
		Scanner sc = new Scanner(System.in);
		
//		int menuNo = 0;
//		while (menuNo !=4) {
//			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 종료");
//			System.out.println("메뉴선택>");
//			menuNo = sc.nextInt();
//			
//			switch(menuNo) {
//			case 1:
//				System.out.println("덧셈 실행");
//				break;
//			case 2:
//				System.out.println("뺄셈 실행");
//				break;
//			case 3:
//				System.out.println("곱셈 실행");
//				break;
//			case 4:
//				System.out.println("프로그램 종료");
//				break;
//			}
//		}
		
		//오락실
//		int money;
//		int menu = 0;
//		System.out.println("======insert coin=======");
//		money = sc.nextInt();
//		//1. 게임 1회 실행 시 금액 500원 차감
//		//2. 내가 투입한 금액 만큼만 반복문을 돌린다. 금액이 게임을 할 수 없는 금액이면 ,반복문 종료 ,,, 3번 눌러서도 종료가 가능하다
//		//3.요쯤에 게임의 기회가 몇번 남았는지 표시하는 기능 ex) money = 1500원 -> 3번의 기회가 남아있습니다.
//		while(money>=500) {
//			int life = money/500;
//			System.out.println("게임 가능 횟수"+ life + "회 입니다.");
//			money -= 500;
//			System.out.println("1. 가위바위보 | 2. 앞, 뒤 맞추기 | 3. 종료");
//			System.out.println("입력>");
//			menu = sc.nextInt();
//			
//			if(menu == 1) {
//				System.out.println("가위바위보");
//			}else if(menu == 2) {
//				System.out.println("앞 뒤 맞추기");
//			}else if(menu ==3 ) {
//				System.out.println("오락실 종료");
//				break;
//			}else {
//				System.out.println("없는 메뉴입니다");
//			}
//			if(money < 500) System.out.println("남은 돈이 " + money +"원 입니다.게임은 한판 당 500원 입니다!! 돈을 넣어주세요!!");
//		}
//		
//		int month;
//		do {
//			System.out.println("올바른 월을 입력하세요[1-12]");
//			month = sc.nextInt();
//		}while(month<1||month>12);
//		
		//무한루프 - 항상조건만족 -> 반복문이 계속 실행
//		while(true) {
//			int num = (int)(Math.random()*6)+1;
//			if(num == 6) {
//				System.out.println("와일종료");
//				break;
//			}
//		}
//		
//		System.out.println("무한반복문에 break 문 안 쓸 경우 unreachble code");
//		
//		
//		//중첩 for 문 안에서의 break
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				if(i+j ==4) {
//					System.out.println("i + j =" + (i+j));
//					break;
//				}
//			}
//		}
		
		//outter
		
//		outter: for(char upper = 'A'; upper <= 'Z'; upper++) {
//					for(char lower = 'a'; lower <= 'z'; lower++) {
//						System.out.println(upper + "-" + lower);
//						if(lower == 'g') {
//						break outter;
//						}
//					}
//				}
//		
		
		//continue
		//continue 를 기준으로 반복문 재 실행
		for(int j = 0; j<=10 ; j++) {
			if(j%2 == 0) {
				continue;
			}
			System.out.println(j);
		}
		}	
}