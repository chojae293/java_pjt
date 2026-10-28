package com.office.member;

public class Member {
	
	// 속성(맴버필드)
	/*
	 * 아이디, 비밀번호, 메일주소, 연락처
	 */
	String memberID;
	String memberPW;
	String memberMAIL;
	String memberPHONE;
	
	// 생성자
	public Member() {
		
	}
	public Member(String memberID, String memberPW, String memberMAIL, String memberPHONE) {
		
		this.memberID = memberID;
		this.memberPW = memberPW;
		this.memberMAIL = memberMAIL;
		this.memberPHONE = memberPHONE;
	}
	
	// 기능(메서드)
	/*
	 * 회원 정보 출력 기능
	 */
	
	

	public void printInfo() {
		System.out.println("Member ID: " + memberID);
		System.out.println("Member Pw: " + memberPW);
		System.out.println("Member Mail: " + memberMAIL);
		System.out.println("Member Phone: " + memberPHONE);

	}

}
