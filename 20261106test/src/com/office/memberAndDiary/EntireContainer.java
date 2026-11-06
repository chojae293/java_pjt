package com.office.memberAndDiary;

public class EntireContainer {
	
	final private EntireDao memberDao = new EntireDao();
	final private EntireService memberService = new EntireService(memberDao);
	final private EntireController memberController = new EntireController(memberService);
	
	private static EntireContainer memberContainer;
	
	private EntireContainer() {}
	
	public static EntireContainer getInstance() {
		if (memberContainer == null) {
			memberContainer = new EntireContainer();
		}
		return memberContainer;
	}

	public EntireController getMemberController() {
		return memberController;
	}

	public EntireService getMemberService() {
		return memberService;
	}

	public EntireDao getMemberDao() {
		return memberDao;
	}

}
