package com.office.memberAndDiary;

public interface IMemverService {
	
	public void signUp(EntireDto memberDto);
	
	public void signIn(EntireDto memberDto);
	
	public void modify(EntireDto memberDto);
	
	public void delete(EntireDto memberDto);
	

}
