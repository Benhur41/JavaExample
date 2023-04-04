

public class Gamble {

	public static void main(String[] args) {
		
	}

}

class Dice {
	int dice1 ;
	int dice2 ;
	static String str = "";
	public Dice () {
		this.dice1 = (int)(Math.random()*6)+1;
		this.dice2 = (int)(Math.random()*6)+1;
}
}

class OddEven {
	
	int bettingMoney;
	
	void shuffle() {
		Dice dice = new Dice();
		
		if(dice.dice1 + dice.dice2 %2 ==0) {
			Dice.str = "짝";
		}else {
			Dice.str = "홀";
		}
		System.out.printf("1번 주사위 : %d  2번 주사위 : %d  = %s = 입니다!!\n",dice.dice1,dice.dice2,Dice.str);
	}
	
	void betting(GambleUser user) {
		System.out.println("배팅 할 금액을 적어주세요.>");
		int bet = UtilScan.utilInt();
		if(bet > 0 && bet <= user.money) {
			user.money-=bet;
			this.bettingMoney = bet;
		}else {
			System.out.println("0원 이하 이거나 자신이 가진 돈 보다 많게는 걸수 없습니다.");
			System.out.println("현재 자산 : " + user.money);
			betting(user);
		}
	}
	
	void priceOrNot(GambleUser user) {
		String userChoice = UtilScan.utilLine();
			if(Dice.str == userChoice) {
				System.out.println("축하드립니다!! 상금을 드립니다.");
				user.money += 2*bettingMoney;
			}else {
				System.out.println("저런.. 틀리셨습니다.");
				this.bettingMoney =0;
			}
		}
	
	void game() {
		//게임시작 shuffle price 으로 구현
	}
	
}
	
	
	


class Factory{
	int salary;
	
	public Factory() {
		this.salary = (int)(Math.random()*5)+5;
	}
	
	public void working() {
		//타이핑 노가다 구현
	}
	
}

class GambleUser{
	String name;
	int money;// 일정 금액 모을시 게임 성공
	int food;// 하루마다 돈 깎으면서 유지해야함 0 밑으로 떨어지면 게임종료
	
	public GambleUser(){
		this.name = UtilScan.utilLine();
		this.money = 10;
		this.food = 5;
	}	
}
