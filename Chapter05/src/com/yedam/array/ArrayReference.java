package com.yedam.array;

public class ArrayReference {

	public static void main(String[] args) {
		//참조배열
		String[] strArray = new String[3];
		strArray[0] = "yedam";
		strArray[1] = "yedam";
		strArray[2] = new String("yedam");
		
		System.out.println(strArray[1] == strArray[2]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
		
		//배열 복사
		int[] oldArray = {1,2,3};
		
		int[] newArray = new int[5];
		
		for (int i = 0; i < oldArray.length; i++) {
			newArray[i]=oldArray[i];
		}
		
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
		
		//다른방법의 복사
		int[] oldArray2 = {1,2,3,4,5,6,7,8};
		int[] newArray2 = new int[10];
		
		System.arraycopy(oldArray2,0,newArray2,0,oldArray2.length);
		for(int i = 0 ; i < newArray2.length;i++) {
			System.out.print(newArray2[i]);
		}
		System.out.println();
		
		//향샹된 for문
		// 배열의 타입인 int 타입 변수 temp 에 newArray2 의 값 차례대로 저장하는 반복문 
		for(int temp : newArray2) {
			System.out.print(temp);
		}
		
		
		
		
		
		
		
		
		
	}

}
