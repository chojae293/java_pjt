package com.office.diary;

import java.util.Scanner;

public class DiaryController {
	
	final private DiaryService diaryService;
	
	public DiaryController(DiaryService diaryService) {
		this.diaryService = diaryService;
	}
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		while (systemFlag) {
			System.out.println("1.Write    2.Read    99.SYSTEM-OUT");
			int selectedMenuNum = scanner.nextInt();
			
			switch (selectedMenuNum) {
			case DIARY_WRITE:
				
				scanner.nextLine();
				
				System.out.println("INPUT NEW DIARY TXT");
				String txt = scanner.nextLine();
				
				DiaryDto diaryDto = new DiaryDto(txt);
				
				diaryService.writeNewDiary(diaryDto);
				
				break;
				
			case DIARY_READ:
				
				break;
				
			case SYSTEM_OUT:
				systemFlag = false;
				break;

			}
		}
	}

}
