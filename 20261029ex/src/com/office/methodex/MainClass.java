package com.office.methodex;

public class MainClass {

	public static void main(String[] args) {

		Calculator calculator =
				new Calculator();
		
		float rst = calculator.addOperator(10, 20);
//		System.out.println("rst: " + rst);
		
		//calculator를 이용해서 자동차 하나 가지고 싶어요
		
		Object myCar = calculator.productCar();

	}

}
