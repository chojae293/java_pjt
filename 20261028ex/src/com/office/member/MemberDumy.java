package com.office.member;

public class MemberDumy {
	
	// 속성
	MemberDB db;
	
	// 생성자
	public MemberDumy(MemberDB memberDB) {
		this.db = memberDB;
	}
	
	// 메서드
	public void initMemberDumyData() {
		
		//아이디,비밀번호,메일,연락처
		
		String[] memberIDs = {"gildong","changho", "saeri"};
		String[] memberPWs = {"1234","0000", "9999"};
		String[] memberMAILs = {"gildong@naver.com","changho@naver.com", "saeri@naver.com"};
		String[] memberPHONEs = {"010-1234-1234","010-0000-0000", "010-9999-9999"};
		
		for(int i = 0; i < memberIDs.length; i++) {
			Member member = new Member(memberIDs[i], memberPWs[i], memberMAILs[i], memberPHONEs[i]);
			db.memberDB.put(memberIDs[i], member);
		}
	}

}
