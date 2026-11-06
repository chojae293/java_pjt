package com.office.memberAndDiary;

public class MainClass {

	public static void main(String[] args) {
		
//		new MemberController().execute();
		
//		MemberContainer memberContainer = MemberContainer.getInstance();
		
		EntireContainer.getInstance()
					   .getMemberController()
					   .execute();
					   
		
	}

}
