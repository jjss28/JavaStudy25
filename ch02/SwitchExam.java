package ch02;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("================================");
	System.out.println("===========MBC 아카데미===========");
	System.out.println("========학원정보 관리 프로그램========");
	System.out.println("a. 수업 스케줄 관리");
	System.out.println("b. 교직원 관리");
	System.out.println("c. 학원별 위치 관리");
	System.out.println("z. 프로그램 종료");
	System.out.print("(a~z) >>>");
	char select = input.next().charAt(0);
	System.out.println("선택한 문자 : " +select);
	
	switch(select) {
	
	case 'A' : 
	case 'a' : 
		System.out.println("수업 스케줄 관리 프로그램에 진입하였습니다");
		System.out.println("1. 수업 스케줄 등록");
		System.out.println("2. 수업 스케줄 보기");
		System.out.println("3. 수업 스케줄 수정");
		System.out.println("4. 수업 스케줄 삭제");
		System.out.println("(1~4)>>>");
		int subSelect = input.nextInt();
		switch(subSelect) {
		
		case 1 : 
			System.out.println("수업 스케줄 등록 메뉴입니다");
			break ;
		case 2 : 
			System.out.println("수업 스케줄 등록 보기입니다");
			break ;
		case 3 : 
			System.out.println("수업 스케줄 등록 수정입니다");
			break ;
		case 4 : 
			System.out.println("수업 스케줄 등록 삭제입니다");
			break ;
		default :
			System.out.println("1~4값만 입력하세요.");
			System.out.println("프로그램을 다시 실행하세요");
			break ;
		}
	    break;
	case 'B' :
	case 'b' : 
		System.out.println("교직원관리메뉴로 진입하셨습니다");
		break;
	
	case 'C' :	
	case 'c' : 
		System.out.println("학원별 위치 관리메뉴로 진입하셨습니다");
		break;
		
	case 'Z' :	
	case 'z' : 
		System.out.println("프로그램을 종료합니다");
		break;
		
	default :
		System.out.println("메뉴에 없는 문자를 넣었습니다");
		System.out.println("프로그램을 다시 실행해 주세요");
		break;
	}

  }
	
}
