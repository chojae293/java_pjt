package com.office.member;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Flag flag = new Flag();
		
		Config config = new Config();		
		
		
		MemberDB memberDB = new MemberDB();

		MemberService memberService = new MemberService(memberDB);

		// 개발환경일 때만 더미 데이터 초기화
		if (config.IS_DEV) {
			MemberDumy memberDumy = new MemberDumy(memberDB);
			memberDumy.initMemberDumyData();
		}
		
		/*
		 * 과제: 더미 초기화는 개발환경과 실환경으로 구분해야 한다.
		 */
		
		while (flag.systemFlag) {
			
			System.out.println("1.SIGN-UP   2.SIGN-IN   3.MODIFY   4.DELETE   5.PRINT-ALL   99.SYSTEM-OUT");
			int selectedMenu = scanner.nextInt();
			
			switch (selectedMenu) {
			case Menu.MENU_SIGN_UP: 	//SIGN-UP
//				memberService = new MemberService();
				memberService.doSignUp(scanner);
				break;
				
			case Menu.MENU_SIGN_IN: 	//SIGN-IN
//				memberService = new MemberService();
				memberService.doSignIn(scanner);
				
				break;
				
			case Menu.MENU_MODIFY: 	//MODIFY
				
				memberService.doModify(scanner);
				
				break;
				
			case Menu.MENU_DELETE: 	//DELETE
				
				memberService.doDelete(scanner);
				
				break;
				
			case Menu.MENU_PRINT_ALL: 	// PRINT-ALL
				
				memberService.doPrintAll();
				
//				HashMap<String, Member> db = memberDB.memberDB;
//				
//				for (String key : db.keySet()) {
//					Member member = db.get(key);
//					System.out.println(member.memberID);
//					System.out.println(member.memberPW);
//					System.out.println(member.memberMAIL);
//					System.out.println(member.memberPHONE);
//					
//				}
				//이건 교수님 방법
				
				break;
				
			case Menu.END: 	//EXIT
				flag.systemFlag = false;
				System.out.println("안녕히가세요");
				break;
				
				//과제: case에 사용되는 리터럴 상수 -> 상수로 변경  --END
				//과제: 메뉴 5번 -> 전체 회원정보 출력하는 기능 구현 
				
			
			}
		}
		
		scanner.close();
		

	}

}
