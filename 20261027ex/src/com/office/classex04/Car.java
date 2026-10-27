package com.office.classex04;

public class Car {
	
	//맴버필드 = 속성
	String color;
	int length;
	int price;
	int displacement;
	
	//생성자
	public Car() {
		System.out.println("---CONSTRUCTOR---");
	}

	public Car(String color, int length, int price, int displacement) {
		this.color = color;
		this.length = length;
		this.price = price;
		this.displacement = displacement;
	}
	
	
	//메서드
	// int speed : parameter, 매개 변수 
	public void goForward(int speed) {
		System.out.println("--- goForward() method ---");
		System.out.println(speed + "km/h");

	}
	public void goBack() {
		System.out.println("--- goBack() method ---");
//		goForward(); 	//이거는 되는데 main메서드에서는 안되는 걸 볼수있다. 
	}
	public void doTest() {
		goForward(30);	// == this.goForward();
		goBack();		// == this.goBack();
	}

}
