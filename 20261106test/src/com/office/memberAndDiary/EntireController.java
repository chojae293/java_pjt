package com.office.memberAndDiary;

import java.util.Scanner;

public class EntireController implements EntireConfig{

	final private EntireService memberService;
	
	public EntireController(EntireService memberService) {
		this.memberService = memberService;
	}

	
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
//		MemberService memberService = new MemberService();
		
		if (IS_DEV) 
			new MemberDumy().signUpForDumy(memberService);
			
		String memId;
		String memPw;
		String memMail;
		String memPhone;
		EntireDto memberDto;
		
		
		while (systemFlag) {
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.Write    5.Read    6.DELETE    99.SYSTEM-OUT");
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
				
				memberDto = new EntireDto(memId, memPw, memMail, memPhone);
				
				
				memberService.signUp(memberDto);
				break;
				
			case SIGN_IN :
				
				System.out.println("Input memeber ID");
				memId = scanner.next();
				
				System.out.println("Input memeber PW");
				memPw = scanner.next();
				
				memberDto = new EntireDto(memId, memPw, null);
				
				memberService.signIn(memberDto);
				
				
				break;
				
			case MODIFY :
				/*
				 *  ID, PW --> 인증 OK -> PW, MAIL, PHONE 수정 한다.
				 */
				
				
				System.out.println("Input memeber ID");
				memId = scanner.next();
				
				System.out.println("Input memeber PW");
				memPw = scanner.next();
				
				memberDto = new EntireDto(memId, memPw, null);
						
				boolean isAuthentication = 
						memberService.doAuthenticationByMemIdAndMemPw(memberDto);
				
				if(isAuthentication) {
					
					System.out.println("Input member PW");
					memPw = scanner.next();
					
					System.out.println("Input member Mail");
					memMail = scanner.next();
					
					System.out.println("Input member Phone");
					memPhone = scanner.next();
					
					memberDto.setMemPw(memPw);
					memberDto.setMemMail(memMail);
					memberDto.setMemPhone(memPhone);
					
					memberService.modify(memberDto);
					
				}
				
				
				break;
				
			case DIARY_WRITE:
				
				scanner.nextLine();
				
				System.out.println("INPUT NEW DIARY TXT");
				String txt = scanner.nextLine();
				
				EntireDto memberDto1 = new EntireDto(txt);
				
				memberService.writeNewDiary(memberDto1);
				
				break;
				
			case DIARY_READ:
				
				memberService.readDiaries();
				
				break;
				
			case DELETE :
				// ID && PW 인증 후 삭제
				
				System.out.println("Input memeber ID");
				memId = scanner.next();
				
				System.out.println("Input memeber PW");
				memPw = scanner.next();
				
				memberDto1 = new EntireDto(memId, memPw, null);
				
				memberService.delete(memberDto1);
				break;
				
			case SYSTEM_OUT :
				systemFlag = false;
				System.out.println("Good Bye");
				
				break;
				

			}
			
		}
		scanner.close();
	}

}
