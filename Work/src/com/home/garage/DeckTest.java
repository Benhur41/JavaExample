package com.home.garage;

public class DeckTest {

	public static void main(String[] args) {
		Deck d = new Deck();
		d.shuffle();
		Card c = d.pick(0);
		System.out.println(c);
		d.shuffle();
		c= d.pick(0);
		System.out.println(c);
	}

}

class Deck {
	final int CARD_NUM = 52;
	Card[] cardArr = new Card[CARD_NUM];

	Deck() {
		int i = 0;
		for (int k = Card.KIND_MAX; k > 0; k--) {
			for (int n = 1; n <= Card.NUM_MAX; n++) {
				cardArr[i++] = new Card(k, n);
			}
		}
	}
	
	Card pick(int index) {
		return cardArr[index];
	}
	
	Card pick () {
		int r = (int)(Math.random()*CARD_NUM)+1;
		return pick(r);
	}
	
	void shuffle () {
		for(int i = 0 ; i < cardArr.length ; i ++) {
			int r = (int)(Math.random()*CARD_NUM);
			Card temp = null;
			temp = cardArr[i];
			cardArr[i]=cardArr[r];
			cardArr[r]=temp;
		}
	}
	
}

class Card {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;

	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;

	int kind;
	int num;

	Card() {
	}

	Card(int kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	public String toString() {
		String[] kinds = { "" , "CLOVER" , "HEART" , "DIAMOND" , "SPADE" };
		String nums = "0123456789XJQK";
		
		return "kind = " + kinds[kind] + " num = " + nums.charAt(num);
	}
}