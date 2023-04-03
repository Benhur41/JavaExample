package com.home.garage;

import java.util.Scanner;

public class TextRpg {

	public static void main(String[] args) {
		User user = new User();

	}

}

class Start {

	Start() {
		User user = new User();
		System.out.printf("%s 의 모험이 시작되었습니다!\n", user.name);
		System.out.println("게임 방법 ");
		System.out.println("연속으로 몬스터를 3번 잡게되면 보스 몬스터 조우 .");
		System.out.println("보스 몬스터 잡을시 게임 클리어");
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

	User() {
		System.out.println("이름을 알려주세요.");
		this.name = UtilScan.utilLine();
		this.life = 10;
		this.mana = 3;
		this.attack = 1;
		this.money = 0;
		this.potion = 1;
	}

	void fight() {
			Monster monster = new Monster();
			boolean run = true ;
			System.out.println("몬스터와 마주했습니다");
			while(run) {
				if(this.life > 0) {
					System.out.printf("%s 의 체력 : %d 공격력 : %d\n" , this.name , this.life , this.attack);
					System.out.printf("몬스터 체력 : %d  공격력 : %d \n",monster.life , monster.attack);
					System.out.println(" 1 . 공격  |  2. 도망  ");
					int selectNo = UtilScan.utilInt();
					
					switch(selectNo) {
					case 1: 
						System.out.println("몬스터를 공격합니다.");
						int lastLife = monster.life - this.attack;
						if(monster.life <= 0 ) {
							System.out.printf("해치웠습니다 ! %d 코인을 얻습니다\n",monster.money);
							this.money += monster.money;
							run = false;
							break;
						}else {
							System.out.printf("몬스터의 체력이 %d 남았습니다! \n",lastLife);
							System.out.printf("몬스터가 공격합니다 . %d 의 공격을 받습니다 !  당신의 체력 : %d ",monster.attack,this.life - monster.attack);
							break;
						}
					case 2:
						int chance = (int)(Math.random()*2)+1
						if(chance == 1) {
							System.out.println("도망에 성공하였습니다!");
							run = false ; 
							break;
						}else {
							System.out.println("도망에 실패하였습니다...");
							break;
						}
					}
					
					
				}else {
					System.out.println("당신의 여정은 끝이 났습니다 ... ");
					run  = false ;
					
						
				}
				
		}
	}

}

class UtilScan {
	static Scanner sc = new Scanner(System.in);

	public static String utilLine() {
		return sc.nextLine();
	}

	public static int utilInt() {
		return Integer.parseInt(sc.nextLine());
	}
}

class Monster {
	double life;
	double attack;
	int money;

	Monster () {
		this.life = 1.0;
		this.attack = 2.0;
		this.money = 10;
		
	}
}