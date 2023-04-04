package com.home.garage;

public class Working {

	public static void main(String[] args) {
	}

	
	public static void storeAct(User1 user) {
		
		boolean run = true;
		Store store = new Store();
		System.out.println("상점에 들어왔습니다! ");
		
		while(run) {
		System.out.println(user.name +"의 잔고는 " + user.money + " 코인 !");
		System.out.println("무엇을 구매 하시겠습니까?");
		System.out.printf("%s 수량 : %d  |  가격 %d 코인 \n",store.list[0].name,store.list[0].productNum,store.list[0].price);
		System.out.printf("%s  수량 : %d  |  가격 %d 코인 \n",store.list[1].name,store.list[1].productNum,store.list[1].price);
		System.out.printf("%s  수량 : %d  |  가격 %d 코인 \n",store.list[2].name,store.list[2].productNum,store.list[2].price);
		System.out.println("1 . 포션  |  2.  방어구  |  3.  검   | 4. 나가기 ");
		int choicepr = UtilScan.utilInt();
		switch(choicepr) {
		case 1:
			if(user.money >= store.list[0].price) {
			if(store.list[0].productNum>0) {
			store.list[0].productNum -= 1;
			user.money -= store.list[0].price;
			user.potion+=1;
			System.out.println("구매 감사합니다!");
			break;
			}else {
				System.out.println("죄송합니다 품절입니다.");
				break;
			}
			}else {
				System.out.println("돈도 없는 그지가 어딜감히!!!");
				System.out.println("-가게에서 쫒겨 났습니다..-");
				run = false;
				break;
			}
		case 2:
			if(user.money >= store.list[1].price) {
				if(store.list[1].productNum>0) {
				store.list[1].productNum -= 1;
				user.money -= store.list[1].price;
				user.armor+=1;
				System.out.println("구매 감사합니다!");
				break;
				}else {
					System.out.println("죄송합니다 품절입니다.");
					break;
				}
				}else {
					System.out.println("돈도 없는 그지가 어딜 감히!!!!");
					System.out.println("-가게에서 쫒겨 났습니다..-");
					run = false;
					break;
				}
		case 3:
			if(user.money >= store.list[2].price) {
				if(store.list[2].productNum>0) {
				store.list[2].productNum -= 1;
				user.money -= store.list[2].price;
				user.attack+=1.0;
				System.out.println("구매 감사합니다!");
				break;
				}else {
					System.out.println("죄송합니다 품절입니다.");
					break;
				}
				}else {
					System.out.println("돈도 없는 그지가 어딜 감히!!!");
					System.out.println("-가게에서 쫒겨 났습니다..-");
					run = false;
					break;
				}
		}
	}
		
	}
	
	
}
