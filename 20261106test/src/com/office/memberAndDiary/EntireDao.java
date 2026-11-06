package com.office.memberAndDiary;

import java.util.HashMap;
import java.util.ArrayList;

public class EntireDao {
	
	/*
	 * gildong : MemberDto
	 */
	
	HashMap<String, EntireDto> db = new HashMap<String, EntireDto>();
	
	public boolean isMember(String memId) {

		EntireDto memberDto = db.get(memId);
		
		
		return memberDto != null ? true : false;
	}

	public int insertNewMember(EntireDto memberDto) {

		db.put(memberDto.getMemId(), memberDto);
			
		return db.get(memberDto.getMemId()) != null ? 1 : 0;   //0 or 1
	}

	public EntireDto searchMemberByMemIdAndMemPw(EntireDto memberDto) {

		EntireDto dto = db.get(memberDto.getMemId());
		
		if(dto != null && dto.getMemPw().equals(memberDto.getMemPw())) {
			return dto;
		}else {
			return null;
		}
		
	}

	public EntireDto deleteMemberByMemIdAndMemPw(EntireDto memberDto) {
		
		EntireDto dto = db.get(memberDto.getMemId());

		if(dto != null && dto.getMemPw().equals(memberDto.getMemPw())) {
			EntireDto deletedMemberDto = db.remove(memberDto.getMemId());
			
			if (deletedMemberDto != null) {
				return deletedMemberDto;
			}else {
				return null;
			}
		
		}else {
		  return null;
		}
		
	}
	
	public EntireDto updateMemberByMemId(EntireDto memberDto) {
		
		db.put(memberDto.getMemId(), memberDto);
		
		return db.get(memberDto.getMemId());
	}
	
	private ArrayList<String> diaries = new ArrayList<String>();

	public boolean insertDiary(EntireDto memberDto) {
		
		int beforeSize = diaries.size();

//		diaries.add(diaryDto.getTxt());
		diaries.add(0, memberDto.getTxt());
		
		int afterSize = diaries.size();

		return afterSize > beforeSize ? true : false;
	}

	public ArrayList<String> getDiaries() {
		return diaries;
	}



}
