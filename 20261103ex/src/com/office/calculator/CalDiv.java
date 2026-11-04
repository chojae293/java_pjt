package com.office.calculator;

public class CalDiv implements ICalculator{
	
	/*
	//나눗셈
	public int calDiv(int n1, int n2) {
		int result = n1 / n2;
		return result;
//		System.out.println("result: " + result);
	}
	*/
	@Override
	public int doOperator(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}

}
