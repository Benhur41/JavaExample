package com.yedam.homework;

import java.util.Scanner;

public class StringGame {
	
	String[] list ;
	String answer;
	StringBuffer sb;
	int correctCount ;
	public StringGame(){
		this.list = new String[4];
		list[0]="orange";
		list[1]="game";
		list[2]="phone";
		list[3]="smart";
		int r = (int)(Math.random()*4);
		this.answer = list[r];
		this.sb = new StringBuffer();
		this.correctCount = 0;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void setCharData() {
		//문자 단위로 입력을 받으며 정답에 포함된 문자인지 확인
		 
		int correct = this.answer.length();
		
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		for(int i = 0 ; i < sb.length() ; i++) {
			System.out.printf("%c ",sb.charAt(i));
		}
		System.out.println();
		if(correctCount == correct) {
			System.out.println("문자열을 구성하는 문자를 다 입력하셨습니다.");
		}else {
			System.out.println("입력값 >");
			String input = sc.nextLine();
			if(answer.indexOf(input) != -1 ) {
				System.out.println("문자열을 구성하는 문자입니다.");
				correctCount++;
				sb.append(input);
			}else {
				System.out.println("문자열을 구성하는 문자가 아닙니다.");
			}
		}
}
	
	public void setStrData() {
		//단어 단위로 입력을 받으며 정답인지 확인
		String ox = "";
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		for(int i = 0 ; i < sb.length() ; i++) {
			System.out.printf("%c ",sb.charAt(i));
		}
		System.out.println();
		System.out.println("입력 값.>");
		String word = sc.nextLine();
		if(answer.length() != word.length()) {
			System.out.println("입력된 문자열의 길이가 다릅니다.");
		}else {
			if(answer.equals(word)) {
				System.out.println("정답입니다~");
			}else {
				for(int i = 0 ; i < answer.length();i++) {
					if(word.charAt(i) == answer.charAt(i)) {
						ox += "O ";
					}else if(word.charAt(i) != answer.charAt(i)) {
						ox += "X ";
					}
				}
				System.out.println(ox);
			}
	}
}
	
	public void showCharData() {
		//게임이 진행 되는 동안 입력된 문자를 입력 순으로 출력
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		for(int i = 0 ; i < sb.length() ; i++) {
			System.out.printf("%c ",sb.charAt(i));
		}
		System.out.println();
	}
	
	public void init() {
		//새 게임
		//기존에 선택한 단어 대신 랜덤으로 새 단어를 선택하며 입력 내역을 초기화
		int r = (int)(Math.random()*4);
		this.answer = list[r];
		this.sb = new StringBuffer();
		this.correctCount =0;
	}
}
