package com.office.classex04;

public class MainClass {
	
	public void printHello() {
		System.out.println("Hello~");
	}

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.goForward(30);  //30 = 인수, 실무에서는 파라미터로 통일 
		car1.goBack();
		car1.doTest();
		
		MainClass mainClass1 = new MainClass();
		mainClass1.printHello();
//		printHello();         X 
		

	}

}
