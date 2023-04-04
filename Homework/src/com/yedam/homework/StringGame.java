package com.yedam.homework;

import java.util.Scanner;

public class StringGame {
	
	String[] list ;
	String answer;
	String save;
	
	public StringGame(){
		this.list = new String[4];
		list[0]="Orange";
		list[1]="Game";
		list[2]="Phone";
		list[3]="Smart";
		int r = (int)(Math.random()*3);
		this.answer = list[r];
		this.save = "";
	}
	Scanner sc = new Scanner(System.in);
	public void setCharData() {
		//문자 단위로 입력을 받으며 정답에 포함된 문자인지 확인
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		System.out.println(save);
		System.out.println("입력값 >");
		String input = sc.nextLine();
		if(answer.indexOf(input) != -1 ) {
			System.out.println("문자열을 구성하는 문자입니다.");
			this.save += input + " ";
			for()
		}else {
			System.out.println("문자열을 구성하는 문자가 아닙니다.");
		}
	}
	
	public void setStrData() {
		//단어 단위로 입력을 받으며 정답인지 확인
	}
	
	public void showCharData() {
		//게임이 진행 되는 동안 입력된 문자를 입력 순으로 출력
	}
	
	public void init() {
		//새 게임
		//기존에 선택한 단어 대신 랜덤으로 새 단어를 선택하며 입력 내역을 초기화
	}
}
