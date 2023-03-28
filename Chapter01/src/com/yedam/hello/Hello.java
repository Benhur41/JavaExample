package com.yedam.hello;

public class Hello {
	static int a =1;
	public static void main(String[] args) {
		int value = 10;
		int sum = value + 20;
		System.out.println(sum+a);
		
		if(sum+a==31) {
			sum =11;
			System.out.println(sum);
		}else {
			System.out.println("good");
		}
		
		}
	}

