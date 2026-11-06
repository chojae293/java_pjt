package com.office.memberAndDiary;

public class MemberDumy {
	
	private String[] memIds= {"gildong", "chanho"};
	private String[] memPws= {"1234", "1111"};
	private String[] memMails= {"gildong@naver.com", "chanho@naver.com"};
	private String[] memPhones= {"010-1234-1234", "010-1111-2222"};

	
	public void signUpForDumy(EntireService memberService) {
		
		for(int i = 0; i < memIds.length; i++) {
			EntireDto memberDto = 
					new EntireDto(
							memIds[i],
							memPws[i],
							memMails[i],
							memPhones[i]
							);
			memberService.signUp(memberDto);
		}
		
	}
	
}
