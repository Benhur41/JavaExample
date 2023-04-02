package com.yedam.homework0331;

public class Ingan {

	public static void main(String[] args) {
		Human hum = new StandardWeightInfo("홍길동",168,45);
		hum.getInformation();
		hum = new ObesityInfo("박둘이",168,90);
		hum.getInformation();
	}

}

class Human {
	//필드
	String name;
	int height;
	int weight;
	
	//생성자
	public Human() {}
	public Human(String name , int height , int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	//메서드
	public void getInformation() {
		System.out.printf("이름: %s 키: %s 몸무게: %f\n", this.name, this.height, this.weight);
	}
}


class StandardWeightInfo extends Human{
	
	public StandardWeightInfo(String string, int i, int j) {
		super(string,i,j);
	}

	public void getInformation() {
		System.out.printf("%s 님의 신장 %d, 몸무게 %d, 표준체중 %.1f 입니다.\n", this.name, this.height, this.weight, this.getStandardWeight());
	}
	
	public double getStandardWeight() {
		return (this.height-100)*0.9;
	}
}

class ObesityInfo extends StandardWeightInfo {
	public ObesityInfo(String string, int i, int j) {
		super(string,i,j);
	}

	public void getInformation() {
		double obs = this.getObesity();
		String obstr = null;
		if(obs <=18.5) {
			obstr = "저체중";
		}else if(obs >18.5 && obs <23.0) {
			obstr = "정상";
		}else if(obs >=23.0 && obs <25.0) {
			obstr = "과체중";
		}else if(obs >=25.0) {
			obstr = "비만";
		}
		System.out.printf("%s 님의 신장 %d, 몸무게 %d, %s 입니다.\n", this.name ,this.height, this.weight, obstr);
	}
	
	public double getObesity() {
		return (this.weight - this.getStandardWeight())/this.getStandardWeight()*100;
	}
}
