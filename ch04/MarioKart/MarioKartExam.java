package ch04.MarioKart;
// 마리오카트 게임프로젝트

// MVC 패턴으로 프로젝트 구현
// dto : 객체처리 (Data Transfer Object 데이터 전송 객체) -> new
// service : 부메뉴용 (객체와 객체를 연결하여 서비스 제공)
// start : 배열과 주메뉴용

import java.util.Scanner;

public class MarioKartExam {
	// 필드

	public static Scanner input = new Scanner(System.in);
	public static MemberDTO[] memberDTOs = new MemberDTO[10];
	public static CharacterDTO[] characterDTOs = new CharacterDTO[15];
	public static CartDTO[] cartDTOs = new CartDTO[8];
	public static GliderDTO[] gliderDTOs = new GliderDTO[10];
	public static TireDTO[] tireDTOs = new TireDTO[10];
	public static ItemDTO[] itemDTOs = new ItemDTO[10];
	public static MemberDTO LoginState;
	// 로그인 상태 유지

	// MemberService memberService ;
	// 메인메뉴 실행하면서 객체 생성

	// 생성자 -> static에는 필요없음 (new x)

	static {
		CharacterDTO characterDTO0 = new CharacterDTO("마리오", 3.0, 4.5, 3.7, 4.1, 3.8);
		CharacterDTO characterDTO1 = new CharacterDTO("루이지", 3.2, 4.4, 3.1, 4.4, 3.2);
		CharacterDTO characterDTO2 = new CharacterDTO("와리오", 3.4, 4.2, 3.2, 4.2, 3.4);
		CharacterDTO characterDTO3 = new CharacterDTO("피치", 3.1, 4.8, 3.4, 4.5, 3.5);
		// 객체 생성 완료

		characterDTOs[0] = characterDTO0;
		characterDTOs[1] = characterDTO1;
		characterDTOs[2] = characterDTO2;
		characterDTOs[3] = characterDTO3;
		// CharacterDTO배열에 삽입완료

	} // 스태틱 블럭 -> 스태틱으로 만든 클래스의 초기값 배정

	// 메서드

	public static void main(String[] args) {

		System.out.println("===== 마리오 카트 게임을 시작합니다. =====");
		boolean run = true;
		while (run) {
			System.out.println("1. 회원관리 | 2. 카트관리 | 3. 게임실행 | 4. 종료");
			System.out.print(">>>");

			int select = input.nextInt(); // 숫자가 아닌경우 오류발생함 (차후처리)

			switch (select) {
			case 1:
				System.out.println("회원관리 클래스로 진입합니다.");

				MemberService memberService = new MemberService();
				// 회원관리용 서비스 객체 생성

				LoginState = memberService.menu(input, memberDTOs, LoginState);
				// 서비스의 메뉴 호출(스캐너 객체 전달)
				System.out.println("현재 로그인한 회원 이름은 : " + LoginState.nickName);
				break;
			case 2:
				System.out.println("카트관리 클래스로 진입합니다.");

				CartService cartService = new CartService();
				// 카트 관리 클래스 객체 생성

				cartService.menu(input, characterDTOs, LoginState); // 부메뉴 호출
				break;
			case 3:
				System.out.println("게임실행 클래스로 진입합니다.");
				break;
			case 4:
				System.out.println("게임종료를 진행합니다.");
				run = false; // while문 종료
				break;

			default:
				System.out.println("1~4번 숫자만 입력하세요");
				// break;

			} // switch문 종료
		} // while문 종료

	} // main() 종료
} // class 종료
