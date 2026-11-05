package com.office.diary;

import java.util.ArrayList;

import com.office.member.DiaryDto;

public class DiaryDao {
	
	//[] -> 길이수정 X =====> ArrayList
	
	private ArrayList<String> diaries = new ArrayList<String>();

	public boolean insertDiary(DiaryDto diaryDto) {
		
		int beforeSize = diaries.size();

//		diaries.add(diaryDto.getTxt());
		diaries.add(0, diaryDto.getTxt());
		
		int afterSize = diaries.size();

		return afterSize > beforeSize ? true : false;
	}

	public ArrayList<String> getDiaries() {
		return diaries;
	}
	
	

}
