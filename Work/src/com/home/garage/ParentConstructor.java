package com.home.garage;

public class ParentConstructor {
	public static void main(String[] args) {
		Child c = new Child("김태연", 27 , 1);
		System.out.println(c);
	}
}

class Parent{
	String name;
	int age;
	
	Parent(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Child extends Parent {
	int grade;
	Child(String name , int age, int grade){
		super(name, age); // 부모클래스 필드값 초기화 해주는 super 가 있기에 기본 생성자를 만들어주지 않아도 된다..
		this.grade = grade;
	}
	
	public String toString() {
		return this.name + this.age + this.grade;
	}
}

class SmallChild extends Child{
	int a;
	
	SmallChild(String name , int age , int grade , int a ){
		super(name , age , grade);
		this.a = a;
	}
}