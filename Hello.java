package com.yedam.hello;

public class Hello {

	public static void main(String[] args) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 2; j <= 5; j++) {
					System.out.printf("%d * %d = %-2d  ",j,i,j*i);
				}
				System.out.println();
			}
	}
}