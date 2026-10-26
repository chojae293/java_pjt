package com.office.classex03;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 홍길동
		 * 22
		 * 
		 * white
		 * 123가1234
		 */
		
		
		Student student1 = new Student("홍길동", 22, new Car("White", "123가1234"));
		student1.printInfo();

	}

}
