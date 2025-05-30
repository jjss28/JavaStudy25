package ch05.mbcbank;

import java.util.Scanner;

import ch05.mbcbank.DTO.AccountDTO;
import ch05.mbcbank.DTO.HanaAccountDTO;
import ch05.mbcbank.DTO.NhAccountDTO;
import ch05.mbcbank.DTO.WooriAccountDTO;
import ch05.mbcbank.service.BankService;

public class BankExam {
	// 필드
	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);

	public static HanaAccountDTO[] hanaBank = new HanaAccountDTO[10];
	public static WooriAccountDTO[] wooriBank = new WooriAccountDTO[10];
	public static NhAccountDTO[] nhBank = new NhAccountDTO[10];
	public static AccountDTO session = null;

	// 생성자 -> 정적 블럭 (main 메서드 초기화 값)
	static {
		HanaAccountDTO accountDTO0 = new HanaAccountDTO("1234", "김기원", 300000, "하나");
		hanaBank[0] = accountDTO0;

		WooriAccountDTO accountDTO1 = new WooriAccountDTO("5678", "조은아", 300000, "우리");
		wooriBank[0] = accountDTO1;

		NhAccountDTO accountDTO2 = new NhAccountDTO("9876", "최준오", 300000, "농협");
		nhBank[0] = accountDTO2;
	}

	// 메서드
	public static void main(String[] args) {
		// 은행 3개를 만들어 계좌 관리하는 프로그래밍
		// 테스트 코드 작성
		// 기본값 입력 더미네이터 출력용 코드 -> toString 오버라이딩으로 볼 수 있다.
		System.out.println("하나은행 더미네이터 출력 테스트 : " + hanaBank[0]);
		System.out.println("우리은행 더미네이터 출력 테스트 : " + wooriBank[0]);
		System.out.println("농협은행 더미네이터 출력 테스트 : " + nhBank[0]);

		boolean run = true; // 주메뉴 반복용
		while (run) {
			System.out.println("===============================");
			System.out.println("MBC코인시스템에 오신것을 환영합니다.");
			System.out.println("===============================");
			System.out.println("1. 하나은행");
			System.out.println("2. 우리은행");
			System.out.println("3. 농협은행");
			System.out.println("4. 프로그램 종료");
			System.out.print(">>>");
			String select = inputStr.next();
			switch (select) {
			case "1":
				System.out.println("하나은행으로 진입합니다.");
				BankService hanaBankService = new BankService();
				hanaBankService.menu(inputInt, inputStr, hanaBank, nhBank, wooriBank);
				break;
			case "2":
				System.out.println("우리은행으로 진입합니다.");
				break;
			case "3":
				System.out.println("농협은행으로 진입합니다.");
				break;
			case "4":
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("1~4값만 입력하세요.");
				break;

			}// 메뉴 선택문 종료 (switch)
		} // 주메뉴 종료 (while)
	}
}
