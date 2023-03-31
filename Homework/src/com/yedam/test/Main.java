package com.yedam.test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// [문제1]
		int a = 10;
		double b = 2.0;
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a % b = " + (a % b));

		// [문제2]
		int num1 = 10;
		int num2 = 20;
		boolean result;

		result = ((num1 > 10) && (num2 > 10));
		System.out.println(result); // false
		result = ((num1 > 10) || (num2 > 10));
		System.out.println(result); // true
		System.out.println(!result);// false

		// [문제3]
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680;
		System.out.println("money = " + money);
		for (int i = 0; i < coinUnit.length; i++) {
			int count = money / coinUnit[i];
			System.out.printf(coinUnit[i] + "원 : " + count + " 개  ");
			money %= coinUnit[i];
		}
		System.out.println();
		// [문제4]
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}

		// [문제5]
		Scanner sc = new Scanner(System.in);
		int[] dice = null;
		boolean run = true;
		int number = 0;
		int j = 0;
		int l = 0;
		int[] maxCount = null;
		while (run) {
			System.out.println("===1. 주사위 크기 2. 주사위 굴리기 3. 결과 보기 4. 가장 많이 나온 수 5. 종료 ===");
			System.out.println("메뉴>");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.println("주사위 크기>");
				number = Integer.parseInt(sc.nextLine());
				maxCount = new int[number];
			} else if (selectNo == 2) {
				String str = "";
				while(true) {
					int r =(int)(Math.random()*number)+1;
					str +=r;
					if(r==5) {
						break;
					}
				}
				dice = new int[str.length()];
				char[] cary = str.toCharArray();
				for(int i = 0 ; i < dice.length ; i ++) {
					dice[i]=cary[i]-48;
				}
				System.out.println(Arrays.toString(dice));
				System.out.println("5가 나오기 까지 "+dice.length+" 번 굴렸습니다.");
			} else if (selectNo == 3) {
				for(int i = 1 ; i<= dice.length ; i++) {
					int checkdice = 0;
					for(int k = 0 ; k<dice.length ; k++) {
						if(i == dice[k]) {
							checkdice++;
						}
					}
					System.out.println(i + "은" + checkdice + " 번 나왔습니다.");
					maxCount[i-1] = checkdice;
				}
			} else if (selectNo == 4) {
				int max = 0;
				for(int m = 0 ; m<maxCount.length ; m ++) {
					if(maxCount[m] > max ) {
						max = maxCount[m];
					}
				}
				for(int m = 0 ; m<maxCount.length ; m ++) {
					if(max == maxCount[m]) {
						System.out.println("가장 많이 나온 수는 "+ (m+1) + "입니다");
						break;
					}
				}
			} else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}

	}
}
