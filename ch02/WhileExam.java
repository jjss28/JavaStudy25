package ch02;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean run = true;
		boolean session = false;
		String id = "kkw";
		String pw = "1234";
				
		while(run) {
			System.out.println("=====성적처리 프로그램=====");
			System.out.println("1. 로그인");
			System.out.println("2. 교사관리");
			System.out.println("3. 학생관리"); 
			System.out.println("4. 성적관리");
			System.out.println("5. 프로그램 종료");
			
			int select = input.nextInt();
			switch(select) {
			case 1 : 
				System.out.println("로그인메뉴");
				login(id,pw) ; 
					if(session) { // 현재 사용자의 로그인 상태를 확인함.
						System.out.println(id + "님 환영합니다. 메뉴를 이용해주세요.");
						
					}break;
			case 2 : 
				if(session) {
					System.out.println("교사관리 메뉴");
				} else {
					System.out.println("로그인이 필요합니다.");
					
				}break;
				
			case 3 : 
				if(session) { 
					System.out.println("학생관리 메뉴");
				}  else {
					System.out.println("로그인이 필요합니다.");
					
				}break;
				
			case 4 : 
				if(session) { 
					System.out.println("성적관리 메뉴");
					GradeManagement(input);
				}  else {
					System.out.println("로그인이 필요합니다.");
					
				}break;
			
			case 5 : 
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				default : 
					System.out.println("1~5번중에서 선택해주세요");
						
			}
		}
				
	}

	static boolean login(String id, String pw) {
		Scanner inputLogin = new Scanner(System.in);
		System.out.println("id를 입력해주세요.");
		System.out.println(">>>");
		String inputId = inputLogin.next();
		System.out.println("pw를 입력해주세요");
		System.out.println(">>>");
		String inputPw = inputLogin.next();

		if (id.equals(inputId) && pw.equals(inputPw)) {
			System.out.println("로그인 성공");
			return true;
		} else {
			System.out.println("id나 pw가 불일치합니다. 로그인 실패");
			return false;
		}
	}

	static void 
	GradeManagement(Scanner input) {
		System.out.println("국어 점수 입력");
		System.out.println(">>>");
		int kor = input.nextInt();
		System.out.println("영어 점수 입력");
		System.out.println(">>>");
		int eng = input.nextInt();
		System.out.println("수학 점수 입력");
		System.out.println(">>>");
		int mat = input.nextInt();

		int total = kor + eng + mat;
		double avg = total / 3.0;

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}
}
