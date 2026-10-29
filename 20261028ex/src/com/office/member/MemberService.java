package com.office.member;

import java.util.Scanner;

public class MemberService {
	
	// 속성
	MemberDB db;
	
	
	// 생성자
	public MemberService(MemberDB memberDB) {
		this.db = memberDB;
	}
	
	// 메서드
	
	/*
	 * 회원가입
	 */
	String memberID;
	String memberPW;
	String memberMAIL;
	String memberPHONE;
	
	public void doSignUp(Scanner scanner) {
		
		while(true) {
			System.out.println("Input new member ID");
			memberID = scanner.next();
			
			if (db.memberDB.get(memberID) != null) {
			    System.out.println("이미 존재하는 ID입니다.");
			    
			} else {
			    System.out.println("사용 가능한 ID입니다.");
			    break;
			}
		}
		
		while(true) {
			System.out.println("Input new member PW");
			memberPW = scanner.next();
				
			if (memberPW.length() >= 8 && memberPW.length() <= 12) {
				System.out.println("비밀번호 등록 성공!");
				break;
			}else {
				System.out.println("비밀번호는 8~12자리로 등록해주세요");
					
			}
		}
		
		
		System.out.println("Input new member MAIL");
		memberMAIL = scanner.next();
		
		System.out.println("Input new member PHONE");
		memberPHONE = scanner.next();
		
		Member member = new Member(memberID, memberPW,  memberMAIL, memberPHONE);
//		MemberDB db = new MemberDB();
		
		db.memberDB.put(memberID, member);
		
		db.memberDB.get(memberID).printInfo();
		
		/*
		 * 과제: ID 중복 체크 기능 추가 --완
		 * 과제: 비밀번호는 8~12자리로 변경 --완
		 */
	}
	
	/*
	 * 로그인
	 */
	public void doSignIn(Scanner scanner) {
		
		System.out.println("Input member ID");
		memberID = scanner.next();
		
		
//		MemberDB db = new MemberDB();
		Member serchedMember = db.memberDB.get(memberID);
		
		// serchedMember: Member or null
		
	    if (serchedMember == null) {
	        System.out.println("3.SIGN-IN FAIL");
	        return;
	    }

	    for (int i = 0; i < 4; i++) {

	        System.out.println("Input member PW");
	        memberPW = scanner.next();

	        if (serchedMember.memberPW.equals(memberPW)) {
	            System.out.println("1.SIGN-IN SUCCESS");
	            return;
	        } else {
	            System.out.println("2.SIGN-IN FAIL");

	            if (i == 3) {
	                System.out.println("로그인 횟수 초과");
	                return;
	            }
	        }
	    }
	}
		
		/*
		 * 과제: 로그인 실패가 3회 초과이면 시스템 종료 --완
		 */
	
	
	/*
	 * 정보수정
	 */
	public void doModify(Scanner scanner) {
			
		
		System.out.println("Input member ID");
		String memberID = scanner.next();
		
		System.out.println("Input member PW");
		String memberPW = scanner.next();
		
	    Member serchMember = db.memberDB.get(memberID);

	    if (serchMember == null || !serchMember.memberPW.equals(memberPW)) {
	        System.out.println("ID 또는 PW가 일치하지 않습니다.");
	        return;
	    }
	    
	    
	    System.out.println("Input new member PW");
	    String newPW = scanner.next();
		
		System.out.println("Input member MAIL");
		String newMAIL = scanner.next();
		
		System.out.println("Input member PHONE");
		String newPHONE = scanner.next();
		
	    serchMember.memberPW = newPW;
	    serchMember.memberMAIL = newMAIL;
	    serchMember.memberPHONE = newPHONE;

	    serchMember.printInfo();
	}
		
//		Member serchMember = db.memberDB.get(memberID);
//		serchMember.memberPW = memberPW;
//		serchMember.memberMAIL = memberMAIL;
//		serchMember.memberPHONE = memberPHONE;
//		
//		serchMember = db.memberDB.get(memberID);
//		serchMember.printInfo();
//		System.out.println(serchMember.memberID);
//		System.out.println(serchMember.memberPW);
//		System.out.println(serchMember.memberMAIL);
//		System.out.println(serchMember.memberPHONE);
		
		/*
		 * 과제: ID, PW인증 -> ok -> 정보수정
		 */
		
		
//	}
	
	/*
	 * 회원탈퇴
	 */
	public void doDelete(Scanner scanner) {
		
		System.out.println("Input member ID");
		String memberID = scanner.next();
		
		System.out.println("Input member PW");
		String memberPW = scanner.next();
		
		Member searchedMember = db.memberDB.get(memberID);
		
		if(searchedMember != null && searchedMember.memberPW.equals(memberPW)) {
			db.memberDB.remove(memberID);
		} else {
			System.out.println("ID 또는 PW가 일치하지 않습니다.");
		}
	}
		
		/*
		 * 전체 회원정보 출력
		 */
		public void doPrintAll() {

			if (db.memberDB.isEmpty()) {
				System.out.println("등록된 회원이 없습니다.");
				return;
			}

			for (Member member : db.memberDB.values()) {
				member.printInfo();
			}
		
	}
}



