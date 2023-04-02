package com.home.garage;

import java.util.Scanner;

public class TextRpg {

	public static void main(String[] args) {

	}

}

class User {
	String name;
	double life;
	int mana;
	int speed;
	double attack;
	int money;
	int potion;
	
	User(){
		this.name = UtilScan.utilLine();
		this.life = 10;
		this.mana = 3;
		this.speed = 3;
		this.attack = 1;
		this.money = 0;
		this.potion =1;
	}
	
	
}

class UtilScan{
	static Scanner sc = new Scanner(System.in);
	
	public static String utilLine() {
		return sc.nextLine();
	}
	
	public static int utilInt() {
		return Integer.parseInt(sc.nextLine());
	}
}