package com.yedam.homework;

import java.util.Scanner;

public class RandomGame {
	
	static Scanner sc = new Scanner(System.in);
	
	public void randomStart() {
		int random = (int)(Math.random()*2)+1;
		if(random == 1) {
			RPGgameStart();
		}else {
			ArcadeGameStart();
		}
	}
	
	
	
	public static String scLine() {
		return sc.nextLine();
	}
	
	public static int scInt() {
		return Integer.parseInt(sc.nextLine());
	}
	
	public void RPGgameStart() {
		boolean run = true;
		RPGgame rpg = new RPGgame();
		
		while(run) {
		System.out.println("============================================================================================");
		System.out.println();
		System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
		System.out.println();
		System.out.println("============================================================================================");

		int selectNo = scInt();
		switch(selectNo) {
		case 1:
			System.out.println("choice> "+ selectNo);
			rpg.leftUpButton();
			break;
		case 2:
			System.out.println("choice> "+ selectNo);
			rpg.leftDownButton();
			break;
		case 3:
			System.out.println("choice> "+ selectNo);
			rpg.rightUpButton();
			break;
		case 4:
			System.out.println("choice> "+ selectNo);
			rpg.rightDownButton();
			break;
		case 5:
			System.out.println("choice> "+ selectNo);
			rpg.changeMode();
			break;
		case 0:
			System.out.println("choice> "+ selectNo);
			ArcadeGameStart();
			break;
		case 9:
			System.out.println("choice> "+ selectNo);
			System.out.println("EXIT");
			run = false;
			break;
		}
	}
}
	
	
	public void ArcadeGameStart() {
		boolean run = true;
		ArcadeGame arc = new ArcadeGame();
		while(run) {
		System.out.println("============================================================================================");
		System.out.println();
		System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
		System.out.println();
		System.out.println("============================================================================================");
		int selectNo = scInt();
		switch(selectNo) {
		case 1:
			System.out.println("choice> "+ selectNo);
			arc.leftUpButton();
			break;
		case 2:
			System.out.println("choice> "+ selectNo);
			arc.leftDownButton();
			break;
		case 3:
			System.out.println("choice> "+ selectNo);
			arc.rightUpButton();
			break;
		case 4:
			System.out.println("choice> "+ selectNo);
			arc.rightDownButton();
			break;
		case 5:
			System.out.println("choice> "+ selectNo);
			arc.changeMode();
			break;
		case 0:
			System.out.println("choice> "+ selectNo);
			RPGgameStart();
			break;
		case 9:
			System.out.println("choice> "+ selectNo);
			System.out.println("EXIT");
			run = false;
			break;
		}
	}
	}
}

