package com.office.ex;

/*
 * 싱글턴 클래스로 만들자!
 */

public class PayCount {
	
	//속성
	private static PayCount payCount = null;
	private int cnt = 0;
	
	//생성자
	private PayCount() {
		
	}
	
	//메서드
	public static PayCount getPayCountInstance() {
		if (payCount == null) {
			payCount = new PayCount();
		}
		return payCount;
	}
	
	//누적 급여 지급 횟수 조죄
	public int getCnt() {
		return cnt;
	}
	
	// 급여 지급 횟수 증가, 설정(초기화)
	public void setCnt() {
		cnt++;
	}

}
