package ch03;

import java.util.Scanner;

public class VendingMachineProgram {
	public static void main(String[] args) {
		String[] drinkMenu = { "콜라", "사이다", "오렌지주스" };
		int[] price = { 1000, 1500, 2000 };
		int[] stock = { 10, 10, 10 };

		Scanner scanner = new Scanner(System.in);
		int choice = 0;

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

	} // main 메서드 종료

	static void buyDrink(Scanner scanner, String[] drinkMenu, int[] price, int[] stock) {
		int[] cart = new int[drinkMenu.length]; // 장바구니

		while (true) {
			System.out.println("=== 음료 선택 ===");
			for (int i = 0; i < drinkMenu.length; i++) {
				System.out.println((i + 1) + ". " + drinkMenu[i] + " - " + price[i] + "원 (재고: " + stock[i] + "개)");
			}
			System.out.println((drinkMenu.length + 1) + ". 장바구니 보기 및 결제");
			System.out.println((drinkMenu.length + 2) + ". 이전으로 돌아가기");
			System.out.print("번호를 선택하세요 >>> ");
			int drinknumber = scanner.nextInt() - 1;
			scanner.nextLine();

			if (drinknumber == drinkMenu.length) { // 장바구니 결제 항목 선택했는지 보는 문구
				int total = 0; // 총합 변수 total 선언
				System.out.println("=== 장바구니 ===");
				for (int i = 0; i < cart.length; i++) {
					if (cart[i] > 0) { // 카트가 채워져 있다면
						System.out.println(drinkMenu[i] + " x " + cart[i] + "개 = " + (price[i] * cart[i]) + "원");
						total = total + price[i] * cart[i]; // 누적 총합 금액 = 가격 x 카트에 담은 갯수 다 더한 것
					}
				}
				if (total == 0) {
					System.out.println("장바구니가 비어 있습니다.");
					continue; // 비어있으므로 다시 위로 보냄.
				}
				System.out.println("총 결제 금액: " + total + "원");
				System.out.print("1. 카드 결제 | 2. 현금 결제 | 3. 결제 취소 >>> ");
				int pay = scanner.nextInt(); // 지불 방법 변수 설정
				scanner.nextLine();

				if (pay == 1) {
					System.out.println("카드 결제가 완료되었습니다.");
					for (int i = 0; i < cart.length; i++) {
						stock[i] = stock[i] - cart[i]; // cart에 담긴 갯수만큼 재고에서 제외
						cart[i] = 0; // 장바구니 결제후 비우기 선언
					}
					System.out.println("음료를 받아가세요.");
				} else if (pay == 2) {
					System.out.print("현금을 입력하세요 >>> ");
					int cash = scanner.nextInt();
					scanner.nextLine();
					if (cash >= total) {
						System.out.println("거스름돈: " + (cash - total) + "원");
						for (int i = 0; i < cart.length; i++) {
							stock[i] = stock[i] - cart[i];
							cart[i] = 0;
						}
						System.out.println("음료를 받아가세요.");
					} else {
						System.out.println("현금이 부족합니다. 결제를 취소합니다.");
					}
				} // 현금결제문 종료
			} else if (drinknumber == drinkMenu.length + 1) { // 5번 항목 선택
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;
			} else if (drinknumber >= 0 && drinknumber < drinkMenu.length) {
				if (stock[drinknumber] <= 0) { // 재고가 없으면
					System.out.println("해당 음료는 품절입니다.");
				} else {
					System.out.print("담을 개수를 입력하세요 >>> ");
					int count = scanner.nextInt(); // count는 장바구니에 담은 갯수
					scanner.nextLine();
					if (count <= 0) { // 아무것도 담지 않으면
						System.out.println("1개 이상 선택해야 합니다.");
					} else if (count > stock[drinknumber]) { // 고른 갯수가 재고보다 많을 경우
						System.out.println("재고가 부족합니다.");
					} else {
						cart[drinknumber] += count; // 카트에 이미 담겨있는 것에 더 담는 문구
						System.out.println(drinkMenu[drinknumber] + " " + count + "개 장바구니에 담았습니다.");
					}
				}
			} else {
				System.out.println("잘못된 선택입니다.");
			}
		} // while문 종료
	} // buyDrink 메서드 종료

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
	} // ManageMode 메서드 종료
} // class 종료