package com.yedam.homework;

public class GamePack {

	public static void main(String[] args) {
		
		
		RPGgame rpg = new RPGgame();
		rpg.leftUpButton();
		rpg.rightUpButton();
		rpg.changeMode();
		rpg.rightUpButton();
		rpg.rightDownButton();
		rpg.leftDownButton();
		rpg.changeMode();
		rpg.rightDownButton();
		System.out.println("===================================");
		ArcadeGame acd = new ArcadeGame();
		acd.leftUpButton();
		acd.rightUpButton();
		acd.leftDownButton();
		acd.changeMode();
		acd.rightUpButton();
		acd.leftUpButton();
		acd.rightDownButton();
	}

}
