package com.yedam.homework;

import java.util.Scanner;

public class HomeWork_0330 {

	public static void main(String[] args) {
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		Scanner sc = new Scanner(System.in);
		boolean run = true ;
		int count = 0;
		Product[] pAry = null;
		
		while(run) {
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료  ");
			System.out.println("번호를 입력 하세요>");
			int selectNo = Integer.parseInt(sc.nextLine());	
			
			if(selectNo==1) {
				System.out.println("상품 수를 입력하시오>");
				count = Integer.parseInt(sc.nextLine());
			}else if(selectNo ==2) {
				pAry = new Product[count];
				for(int i = 0 ; i < pAry.length;i++) {
					pAry[i] = new Product();
					System.out.println("상품 명을 입력하시오>");
					String name = sc.nextLine();
					pAry[i].name = name;
					System.out.println("가격을 입력하시오>");
					int price = Integer.parseInt(sc.nextLine());
					pAry[i].price = price;
					
				}
			}else if(selectNo ==3) {
				for(int i = 0 ; i < pAry.length ; i++) {
					System.out.printf(" %s : %5d \n",pAry[i].name,pAry[i].price);
				}
			}else if(selectNo ==4) {
				int max = 0;
				int sum = 0 ;
				for(int i = 0 ; i < pAry.length ; i++) {
					if(max < pAry[i].price) {
						max = pAry[i].price;
					}
					sum += pAry[i].price;
				}
				for(int i = 0 ; i < pAry.length ; i++) {
					if(pAry[i].price == max) {
						System.out.println("최고가격을 가지는 제품은" + pAry[i].name+" 입니다.");
					}
				}
				System.out.println("해당 제품을 제외한 가격의 총합은 " + (sum-max) + " 입니다." );
			}else if(selectNo ==5) {
				System.out.println("종료되었습니다!");
			    run = false;
			}
		}
	}

}

class Product {
	String name;
	int price;
	
}
