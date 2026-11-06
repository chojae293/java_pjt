package com.office.memberAndDiary;

import java.util.ArrayList;

public class EntireService implements IMemverService{
	
	final private EntireDao memberDao;
	
	public EntireService(EntireDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Override
	public void signUp(EntireDto memberDto) {

		//아이디 중복체크
		
		boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		//회원가입
		if(!isMember) {
			int result = memberDao.insertNewMember(memberDto); // 0: 실패,   1: 성공 
			
			if(result == 0) {
				System.out.println("죄송합니다 회원가입 실패입니다. 잠시 후 다시 시도 해주세요.");
			
			}else {
				System.out.println("회원가입 성공했어요!");
			}
		}else {
			System.out.println("이미 존재하는 아이디입니다.");
			
		}
		
		
		
	}

	@Override
	public void signIn(EntireDto memberDto) {

		EntireDto searchedMemberDto =
				memberDao.searchMemberByMemIdAndMemPw(memberDto);
		
		if(searchedMemberDto != null) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
	}
	
	

	@Override
	public void modify(EntireDto memberDto) {

		EntireDto updatedMemberDto = memberDao.updateMemberByMemId(memberDto);
		
	}
	
	public void writeNewDiary(EntireDto memberDto) {
		
		boolean result = memberDao.insertDiary(memberDto);
		
		if(result) {
			System.out.println("WRITE DIARY TXT!!");
			
		}
	}
		
		public void readDiaries() {
			
			ArrayList<String>diaries = memberDao.getDiaries();
			for(int i = 0; i < diaries.size(); i++) {
				System.out.println(diaries.get(i));
			}
		
	}

	@Override
	public void delete(EntireDto memberDto) {
		
		EntireDto deletedMemberDto = memberDao.deleteMemberByMemIdAndMemPw(memberDto);
		if(deletedMemberDto != null) {
			System.out.println("탈퇴처리 완료되었습니다.");
		}else {
			System.out.println("입력된 정보가 없습니다.");
		}
		
	}

	public boolean doAuthenticationByMemIdAndMemPw(EntireDto memberDto) {

		EntireDto dto = memberDao.searchMemberByMemIdAndMemPw(memberDto);
		
		
		/*
		 * MemberDto MemberDto null
		 */
		
		return dto != null ? true : false;
	}


	
	
	

}
