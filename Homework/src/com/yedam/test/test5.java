package com.yedam.test;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 0;
		int[] dice = null;
		boolean run = true ;
		
		while(run) {
			System.out.println("1. 주사위 크기 2. 주사위 굴리기 3. 결과보기  4. 가장 많이 나온 수 5. 종료");
			System.out.println("메뉴 >");
			
			String selectNo = sc.nextLine();
			
			switch(selectNo) {
			case "1":
				System.out.println("주사위 크기 >");
				size = Integer.parseInt(sc.nextLine());
				if(size < 5|| size >10) {
					System.out.println("5~10 사이의 수를 입력하세요");
					size =0;
				}
				break;
			case "2":
				//주사위 크기 설정
				dice = new int[size];
				
				int count = 0;
				//5 가 언제 나올지 모르기 때문에 , while 나올때까지 반복문을 사용하기 위함
				while(true) {
					int random = (int)(Math.random()*size)+1;
					System.out.println(random);
					//각 주사위 숫자 -> 배열 저장
					dice[random -1] ++;
					count++;
					if(random == 5) {
						break;
					}
				}
				System.out.println("5가 나올 때 까지 주사위를 " +count+ "번 굴렸습니다.");
				break;
			case "3":
				for(int i = 0 ; i < dice.length ; i++) {
					System.out.println((i+1)+ "은" + dice[i] + "번 나왔습니다.");
				}
				break;
			case "4":
				int max = dice[0];
				int index = 0;
				for(int i = 0 ; i < dice.length ; i++) {
					if(max < dice[i]) {
						max = dice[i];
						index = i;
					}
				}
				System.out.println("가장 많이 나온 수는" + (index+1)+ "입니다.");
				break;
			case "5":
				System.out.println("종료");
				break;
			}
		}
		
	}

}
