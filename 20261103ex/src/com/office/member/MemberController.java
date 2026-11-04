package com.office.member;

import java.util.Scanner;

public class MemberController implements MemberConfig{

	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		MemberService memberService = new MemberService();
		
		if (IS_DEV) 
			new MemberDumy().signUpForDumy(memberService);
			
		String memId;
		String memPw;
		String memMail;
		String memPhone;
		MemberDto memberDto;
		
		
		while (systemFlag) {
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    99.EXIT");
			int selectedMenuNum = scanner.nextInt();
			
			switch (selectedMenuNum) {
			case SIGN_UP :
				
				System.out.println("Input new memeber ID");
				memId = scanner.next();
				
				System.out.println("Input new memeber PW");
				memPw = scanner.next();
				
				System.out.println("Input new memeber MAIL");
				memMail = scanner.next();
				
				System.out.println("Input new memeber PHONE");
				memPhone = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, memMail, memPhone);
				
				
				memberService.signUp(memberDto);
				break;
				
			case SIGN_IN :
				
				System.out.println("Input memeber ID");
				memId = scanner.next();
				
				System.out.println("Input memeber PW");
				memPw = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, null);
				
				memberService.signIn(memberDto);
				
				
				break;
				
			case MODIFY :
				memberService.modify();
				break;
				
			case DELETE :
				// ID && PW 인증 후 삭제
				
				System.out.println("Input memeber ID");
				memId = scanner.next();
				
				System.out.println("Input memeber PW");
				memPw = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, null);
				
				memberService.delete(memberDto);
				break;
				
			case EXIT :
				systemFlag = false;
				System.out.println("Good Bye");
				
				break;
				

			}
			
		}
		scanner.close();
	}

}
