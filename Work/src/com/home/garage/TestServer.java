package com.home.garage;

public class TestServer {

	public static void main(String[] args) {
		User1 user = new User1();
		user.fight(new Monster1());
	}

}

class Product {
	String name;
	int productNum;
	
	Product (String name , int productNum){
		this.name = name;
		this.productNum = productNum;
	}
}

class Store{
	Product[] list ;
	
	Store(){
		this.list = new Product[3];
		list[0]=new Product("포션" , 3);
		list[1]=new Product("방어구" ,3);
		list[2]=new Product("검" , 3);
	}
	}


class Town{
	Store store = new Store();
	
	void storyGoing () {
		System.out.println("마을에 도착했습니다 . 무엇을 하시겠습니까?");
		System.out.println("");
	}
	
	
	
}

class User1 {
	String name;
	double life;
	int mana;
	int speed;
	double attack;
	int money;
	int potion;
	int count;
	int armor;
	boolean run = true ;
	
	User1() {
		System.out.println("이름을 알려주세요.");
		this.name = UtilScan.utilLine();
		this.life = 10;
		this.mana = 3;
		this.attack = 3;
		this.money = 0;
		this.potion = 1;
		this.count = 0;
		this.armor = 0;
	}

	void IntoOrNot() {
		Monster1 monster = new Monster1();
		Monster1 king = new King();
		System.out.println("숲의 안쪽으로 더 들어가시겠습니까?");
		System.out.println("1. 들어간다  | 2. 마을로 돌아간다 ");
		int choice = UtilScan.utilInt();
		if (choice ==1 && this.count <3) {
			fight(monster);
		}else if(choice ==1 && this.count ==3) {
			fight(king);
			if(this.life > 0) {
			System.out.println("보스를 처치했습니다!");
			System.out.println("클리어!!!");
			}
		}else if (choice == 2){
			this.count = 0;
			run = false;
		}
	}
	
	void fight(Monster1 monster) {
			run = true;
			
			System.out.printf("\n%s 과 마주했습니다!!!\n\n",monster.name);
			while(run) {
				if(this.life > 0) {
					System.out.printf("%s 의 체력 : %.1f 공격력 : %.1f\n" , this.name , this.life , this.attack);
					System.out.printf("%s 체력 : %.1f  공격력 : %.1f \n\n",monster.name ,monster.life , monster.attack);
					System.out.println(" 1 . 공격  |  2. 상태창!!!  | 3. 아이템 가방 | 4. 도망 ");
					int selectNo = UtilScan.utilInt();
					
					switch(selectNo) {
					case 1: 
						
						System.out.println("\n몬스터를 공격합니다!!");
						System.out.println();
						double lastLife = monster.life - this.attack;
						monster.life = lastLife;
						if(lastLife <= 0 ) {
							System.out.printf("해치웠습니다 ! %d 코인을 얻습니다\n",monster.money);
							this.count++;
							System.out.printf("보스방까지 %d 회 더 \n" , 3-this.count);
							this.money += monster.money;
							IntoOrNot();
							break;
						}else {
							System.out.printf("몬스터의 체력이 %.1f 남았습니다! \n",lastLife);
							System.out.printf("몬스터가 공격합니다!! %.1f 의 공격을 받습니다 ! \n",monster.attack);
							this.life = this.life - monster.attack;
							break;
						}
					case 2:
						status();
						break;
					case 3:
						//아이템가방
					case 4:
						int chance = (int)(Math.random()*2)+1;
						if(chance == 1) {
							System.out.println("도망에 성공하였습니다!");
							this.count=0;
							run = false ; 
							break;
						}else {
							System.out.println("도망에 실패하였습니다...");
							break;
						}
					}
					
					
				}else {
					System.out.println("치명적인 부상을 입었습니다.. 눈이 감깁니다..");
					System.out.println("당신의 여정은 끝이 났습니다.  ");
					run  = false ;
				}
				
		}
	}

	public void status() {
		System.out.printf("유저 이름 : %s \n  현재체력  :  %f 공격력  :  %f  방어력  :  %d  코인  :  %d \n" , this.name , this.life , this.attack , this.armor , this.money);
	}
	
}

class Monster1 {
	String name;
	double life;
	double attack;
	int money;
	
	Monster1 () {
		this.name = "초록버섯";
		this.life = (double)((int)(Math.random()*5)+1);
		this.attack = (double)((int)(Math.random()*5)+1);
		this.money = 10;
		
	}
}

class King extends Monster1{
	
	public King(){
		this.name = "뿔버섯";
		this.life = 15;
		this.attack = 6;
		
	}
}
