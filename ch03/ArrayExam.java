package ch03;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		String LoginId = "kkw";
		String LoginPw = "1234";
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		System.out.println("=====엠비씨 성적 처리 로그인=====");

		while (true) {
			System.out.println("아이디: ");
			String id = inputStr.nextLine();
			System.out.println("비밀번호: ");
			String pw = inputStr.nextLine();

			if (id.equals(LoginId) && pw.equals(LoginPw)) {
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
			}
		}

		System.out.println("======엠비씨 성적 처리 =====");
		System.out.println("학생 수를 입력해주세요");
		System.out.print(">>>");
		int count = inputInt.nextInt();

		String[] names = new String[count];
		int[] kors = new int[count];
		int[] mats = new int[count];
		int[] engs = new int[count];

		boolean run = true;
		while (run) {
			System.out.println("====== 성적처리 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 전체성적보기");
			System.out.println("3. 개인성적보기");
			System.out.println("4. 성적수정하기");
			System.out.println("5. 성적삭제하기");
			System.out.println("9. 성적프로그램 종료");
			System.out.print(">>>");
			int select = inputInt.nextInt();

			switch (select) {
			case 1:
				System.out.println("성적입력화면입니다.");
				// 메서드 생성할 때는 입력값과 출력값을 먼저 생각해야한다.
				scoreAdd(names, kors, mats, engs);
				break;

			case 2:
				System.out.println("전체성적보기화면입니다.");
				break;

			case 3:
				System.out.println("개인성적보기화면입니다.");
				break;

			case 4:
				System.out.println("개인성적수정화면입니다.");
				scoreMod(names, kors, mats, engs);
				break;

			case 5:
				System.out.println("성적삭제화면입니다.");
				break;

			case 9:
				System.out.println("성적처리 종료! 프로그램이 종료됩니다.");
				run = false;
				break;

			default:
				System.out.println("1~9까지만 입력하세요");
				break;
			}
		}
	}

	static void scoreAdd(String[] names, int[] kors, int[] mats, int[] engs) {
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				System.out.println("이름을 입력하세요.");
				System.out.print(">>>");
				names[i] = inputStr.next();

				System.out.print("국어점수 : ");
				kors[i] = inputInt.nextInt();

				System.out.print("수학점수 : ");
				mats[i] = inputInt.nextInt();

				System.out.print("영어점수 : ");
				engs[i] = inputInt.nextInt();

			} // 반복 성적 입력 종료
			System.out.println("성적입력이 완료 되었습니다.");
		}
	}

	static void scoreMod(String[] names, int[] kors, int[] mats, int[] engs) {
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		System.out.println("수정할 학생의 이름을 입력하세요");
		System.out.print(">>>");
		String name = inputStr.nextLine();
		for (int i = 0; i < names.length; i++) {
			// 초기화 조건확인 반복실행
			if (names[i] != null && names[i].equals(name)) {
				// 키보드로 입력한 값이 이름배열에 같은값이 있는지 파악
				System.out.println(names[i] + "학생 점수");
				System.out.println("국어 :" + kors[i]);
				System.out.println("수학 :" + mats[i]);
				System.out.println("영어 :" + engs[i]);
				System.out.println("=================");
				System.out.println("수정할 점수를 입력하세요");

				System.out.print("국어 수정 점수 : ");
				kors[i] = inputInt.nextInt();

				System.out.print("수학 수정 점수 : ");
				mats[i] = inputInt.nextInt();

				System.out.print("영어 수정 점수 : ");
				engs[i] = inputInt.nextInt();
				System.out.println("수정완료!!!");

				System.out.println("국어 :" + kors[i]);
				System.out.println("수학 :" + mats[i]);
				System.out.println("영어 :" + engs[i]);
				System.out.println("=================");
				break;
			}
		}
	}
}
