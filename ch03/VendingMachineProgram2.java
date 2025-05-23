package ch03;

import java.util.Scanner;

public class VendingMachineProgram2 {
	public static void main(String[] args) {
		String[] drinkMenu = { "콜라", "사이다", "오렌지주스" };
		int[] price = { 1000, 1500, 2000 };
		int[] stock = { 10, 10, 10 };

		Scanner scanner = new Scanner(System.in);
		int choice = 0; // 저장 변수 선언

		boolean run = true;
		while (run) {
			System.out.println("=== 자판기 ===");
			System.out.println("1. 음료 구매");
			System.out.println("2. 관리자 모드");
			System.out.println("3. 자판기 종료");
			System.out.print("번호를 입력해주세요 >>> ");

			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				buyDrink(scanner, drinkMenu, price, stock);
				break;
			case 2:
				System.out.print("관리자 비밀번호를 입력하세요 >>> ");
				String pw = scanner.nextLine();
				if (pw.equals("1234")) {
					ManageMode(scanner, drinkMenu, price, stock);
				} else {
					System.out.println("비밀번호가 옳지 않습니다.");
				}
				break;
			case 3:
				System.out.println("자판기를 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			} // switch문 종료
		} // while문 종료

	} // main 종료

	static void buyDrink(Scanner scanner, String[] drinkMenu, int[] price, int[] stock) {
		while (true) {
			System.out.println("=== 음료 선택 ===");
			for (int i = 0; i < drinkMenu.length; i++) {
				System.out.println((i + 1) + ". " + drinkMenu[i] + " - " + price[i] + "원 (재고: " + stock[i] + "개)");
			}
			System.out.println((drinkMenu.length + 1) + ". 이전으로 돌아가기");
			System.out.print("음료 번호를 선택하세요 >>> ");

			int drinknumber = scanner.nextInt() - 1;
			scanner.nextLine();

			if (drinknumber == drinkMenu.length) {
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;
			}

			if (drinknumber >= 0 && drinknumber < drinkMenu.length) {
				if (stock[drinknumber] <= 0) {
					System.out.println("해당 음료는 품절입니다.");
					continue;
				}

				System.out.println(drinkMenu[drinknumber] + " 선택 (가격: " + price[drinknumber] + "원)");
				System.out.print("1. 결제 진행 | 2. 결제 취소 >>> ");
				int confirm = scanner.nextInt();
				scanner.nextLine();

				if (confirm == 1) {
					System.out.print("결제 수단 선택: 1. 카드 | 2. 현금 >>> ");
					int pay = scanner.nextInt();
					scanner.nextLine();

					if (pay == 1) {
						System.out.println("카드 결제가 완료되었습니다.");
						stock[drinknumber]--;
					} else if (pay == 2) {
						System.out.print("현금을 입력하세요 >>> ");
						int cash = scanner.nextInt();
						scanner.nextLine();

						if (cash >= price[drinknumber]) {
							System.out.println("거스름돈: " + (cash - price[drinknumber]) + "원");
							stock[drinknumber]--;
							System.out.println("음료를 받으세요.");
						} else {
							System.out.println("현금이 부족합니다.");
						}
					} else {
						System.out.println("잘못된 결제 수단입니다.");
					}
				}
			} else {
				System.out.println("잘못된 선택입니다.");
			}
		} // while문 종료
	} // 메서드 종료

	static void ManageMode(Scanner scanner, String[] drinkMenu, int[] price, int[] stock) {
		boolean manager = true;
		while (manager) {
			System.out.println("=== 관리자 모드 ===");
			System.out.println("1. 메뉴 이름 변경");
			System.out.println("2. 가격 변경");
			System.out.println("3. 재고 리필");
			System.out.println("4. 관리자 모드 종료");
			System.out.print("선택 >>> ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			int drinknumber;

			switch (choice) {
			case 1:
				for (int i = 0; i < drinkMenu.length; i++) {
					System.out.println((i + 1) + ". " + drinkMenu[i]);
				}
				System.out.print("이름 변경할 음료 번호 선택 >>> ");
				drinknumber = scanner.nextInt() - 1;
				scanner.nextLine();
				if (drinknumber >= 0 && drinknumber < drinkMenu.length) {
					System.out.print("새 이름 입력 >>> ");
					drinkMenu[drinknumber] = scanner.nextLine();
					System.out.println("이름이 변경되었습니다.");
				} else {
					System.out.println("잘못된 선택입니다.");
				}
				break;

			case 2:
				for (int i = 0; i < price.length; i++) {
					System.out.println((i + 1) + ". " + drinkMenu[i] + " (현재 가격: " + price[i] + "원)");
				}
				System.out.print("가격 변경할 음료 번호 선택 >>> ");
				drinknumber = scanner.nextInt() - 1;
				scanner.nextLine();
				if (drinknumber >= 0 && drinknumber < price.length) {
					System.out.print("새 가격 입력 >>> ");
					price[drinknumber] = scanner.nextInt();
					scanner.nextLine();
					System.out.println("가격이 변경되었습니다.");
				} else {
					System.out.println("잘못된 선택입니다.");
				}
				break;

			case 3:
				for (int i = 0; i < stock.length; i++) {
					stock[i] = 10;
				}
				System.out.println("모든 음료 재고가 10개로 리필되었습니다.");
				break;

			case 4:
				System.out.println("관리자 모드를 종료합니다.");
				manager = false;
				break;

			default:
				System.out.println("잘못된 입력입니다.");
			} // switch문 종료
		} // while문 종료
	} // 메서드 종료
} // 클래스 종료
