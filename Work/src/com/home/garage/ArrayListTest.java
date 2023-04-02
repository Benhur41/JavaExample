package com.home.garage;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("안녕");
		a.add("나는 김태연");
		a.add("java 공부중");
		
		for(String as : a) {
			System.out.println(as);
		}
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		//중간 부분 삭제시 빈 공간을 다음 요소로 채운다 - 연속적으로 이어지게 
		a.remove(1);
		
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		// ArrayList 는 get(index) 메소드로 인데스값의 요소를 불러올수 있다
		
		
	}

}
