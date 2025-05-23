package ch02;

import java.util.Scanner;

public class MethodExam {

	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		boolean run = true ;
		String id = "kkw" ;
		String pw = "1234" ;
		boolean session = false ; // 프로그램 시작시에 로그인되지 않은 상태를 말해주는 것 (로그인하지 않은 사용자가 이용하지 못하도록 막는 용도)
		
		while(run) {
			System.out.println("====성적처리용====)");
			System.out.println("1. 로그인");
			System.out.println("2. 교사관리");
			System.out.println("3. 학생관리");
			System.out.println("4. 성적관리");
			System.out.println("5. 프로그램 종료");
			System.out.println(">>>");
			int select = inputInt.nextInt()
;
			switch(select) {
			case 1 : 
				System.out.println("로그인 메뉴로 이동합니다.");
			    session = LoginOk(id, pw, session);
			    
			    if(session == true) {
			    	System.out.println(id + "님 환영합니다.");
			    	System.out.println("2~4의 메뉴를 사용하실 수 있습니다.");
			    } break;
		    
			case 2 : 
				System.out.println("교사관리 메뉴로 이동합니다.");
				break;
			case 3 :
				System.out.println("학생관리 메뉴로 이동합니다.");
				break;
			case 4 : 
				System.out.println("성적관리 메뉴로 이동합니다.");
				break;
			case 5 : 
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			    
			}
		}

	}

	static boolean LoginOk(String id, String pw, boolean session) {
		Scanner inputLogin = new Scanner(System.in);
		System.out.println("로그인 id를 입력하세요");
		System.out.println(">>>");
		String inputId = inputLogin.next();
		System.out.println("로그인 pw를 입력하세요");
		System.out.println(">>>");
		String inputPw = inputLogin.next();
		if(id.equals(inputId) && pw.equals(inputPw)) {
			System.out.println("id와 pw가 일치합니다");
			System.out.println("로그인 성공");
			session = true;
		}else {
			System.out.println("id와 pw가 불일치합니다");
			System.out.println("로그인 실패");
			session = false;
		}
		return session;
	    
	}

}
