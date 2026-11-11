package com.office.exception;

public class MainClass {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		
		System.out.println("num1 + num2="+ (num1 + num2));		// 10
		System.out.println("num1 - num2="+ (num1 - num2));		// 10
		
		/*
		 * 예외처리: try ~ catch문
		 */
		try {
			System.out.println("num1 / num2="+ (num1 / num2));		// exception
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();          //현업에서 많이 사용한다.
		} finally {
			//생략가능한 옵션이다.
		}
		/*
		 * 데이터는 에러가났을때 무슨 데이터 타입인가 
		 * xml
		 * html
		 * json
		 * 탄생배경과 용도 
		 */
		
		System.out.println("num1 * num2="+ (num1 * num2));		// 0
	
		
		
				
	}

}
