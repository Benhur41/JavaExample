package com.home.garage;

import java.util.Arrays;

public class TwoCondition {

	public static void main(String[] args) {
		//한 조건식에 false 면 멈추는 듯? || , && 둘다 똑같이 나온다.. 
//		for(int i = 1 , j = 2 ; i <=j && j <=10000 ; i++,j*=2) {
//			System.out.println(i + " -- " + j);
//		}
		
		
		
		// 석차 구하기
		// 가장 작은 등수의 등수++ 시키기
		
		//A반 학생 5명의 성적 
		int[] classA = {100,90,95,65,80};
		
		//등수++ 시켜줄 배열 만들기
		int[] number = new int[classA.length]; //5명의 등수를 정해야 하기 때문에 길이 같게 만들기
		for(int i = 0 ; i < number.length ; i++) {
			number[i] = 1; // 기본 등수 1등으로 놓고 자신보다 높은 점수와 비교 될때 마다 등수 내려가게 만들기위해 1로 놓음
		}
		//classA 의 특정 점수 하나와 전체 점수를 비교하는 중첩반복문 
		for(int i = 0 ; i < classA.length ; i++) {
			for(int j = 0 ; j < classA.length ; j++) {
				if(classA[i] < classA[j]) {
					number[i]++;//나보다 큰 성적의 수만큼 등수 증가
				}
			}
		}
		
		System.out.println(classA[2] + " 의 등수는 " + number[2] + " 등 입니다.");
		
		//선택정렬
		//가장 작은 숫자를 찾아서 앞으로 보내기
		
		for(int i = 1 ; i < classA.length ; i ++) {
			for(int j = 0 ; j < classA.length - i ; j ++) {
				int temp = 0 ;
				if(classA[j] > classA[j+1]) {
					temp = classA[j];
					classA[j]=classA[j+1];
					classA[j+1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(classA));
		
		int temp = 0;
		 for(int i = 0; i < classA.length - 1; i++){
				int min = i; //첫번째 값의 위치
				for(int j = i + 1; j < classA.length; j++){
					if(classA[j] < classA[min]){ //최소값의 위치 찾기
						min = j; //최소값의 위치 기억
					}
				}
				temp = classA[i];
				classA[i] = classA[min];
				classA[min] = temp; //i랑 최소값의 위치랑 바꿈
			}
			System.out.println(Arrays.toString(classA));
			
			/*1~5 사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
		
			*예시)	 [3,2,3,2,3,4,5,5,2,4]
			 출력 :   [3,2,4,5]
			*/
			
			int[] arry = new int[10];
			for(int i = 0 ; i < arry.length ; i++) {
				int r = (int)(Math.random()*5)+1;
				arry[i] = r;
			}
			System.out.println(Arrays.toString(arry));
			
			for(int i = 1 ; i < arry.length ; i ++) {
				for(int j = 0 ; j < arry.length - i ; j ++) {
					int temp1 = 0 ;
					if(arry[j] > arry[j+1]) {
						temp1 = arry[j];
						arry[j]=arry[j+1];
						arry[j+1]=temp1;
					}
				}
			}
			System.out.println(Arrays.toString(arry));
			
			int k = 0;
			int[] str = new int[arry.length];
			for(int i = 0 ; i < arry.length-1 ; i ++) {
				if(arry[i]!=arry[i+1]) {
				 str[k++] = arry[i];
				}
			}
			str[k++]=arry[arry.length-1];
			System.out.println(k);
			System.out.println(Arrays.toString(str));
			int[] shit = new int[k];
			for(int i = 0 ; i < shit.length ; i ++) {
				shit[i]=str[i];
			}
			System.out.println(Arrays.toString(shit));
			
			int sum = 0;
			
			int[] arr = {1,2,3,4,5,6};
			for(int i : arr) {
				sum += i;
			}
			System.out.println(sum);
			
			factorial(0);
			
			
			Test1 t1 = new Test1("하이","바이",3,4);
			Test1 t2 = new Test1(t1);
			Test1 t3 = new Test1();
			
			t1.getInfo();
			t2.getInfo();
			t3.getInfo();
			
			
	}
	
	public static void factorial(int n) {
		int a = n;
		for(int i = 1 ; i <=n-1;i++) {
			a*=(n-i);
		}
		System.out.println(a);
	}
}


class Test1 {
	String a;
	String b;
	int a1;
	int b1;
	
	Test1(Test1 t){
		a = t.a;
		b = t.b;
		a1 = t.a1;
		b1 = t.b1;
	}
	
	Test1(){
		a = "a";
		b = "b";
		a1 = 1;
		b1 = 2;
	}
	Test1(String a , String b , int a1 , int b1 ){
		this.a = a;
		this.b = b;
		this.a1 = a1; 
		this.b1 = b1;
	}
	
	public void getInfo() {
		System.out.printf(" %s %s %d %d\n",a,b,a1,b1);
	}
}

