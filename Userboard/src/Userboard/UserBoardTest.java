package Userboard;

import java.sql.SQLException;
import java.util.Scanner;

import Userboard.service.UserService;

public class UserBoardTest {
	public static Scanner inputStr = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {

		UserService service = new UserService();
		boolean run = true;
		while (run) {
			System.out.println("회원 사이트입니다.");
			System.out.println("1. 회원가입");
			System.out.println("2. 회원목록 조회");
			System.out.println("3. 회원정보 수정");
			System.out.println("4. 회원정보 삭제");
			System.out.println("5. 종료");
			System.out.print(">>>");

			String select = inputStr.next();

			switch (select) {
			case "1":
				System.out.println("회원가입을 진행합니다.");
				service.insertUser(inputStr);
				break;

			case "2":
				System.out.println("회원목록 조회로 이동합니다.");
				service.readAll();
				break;

			case "3":
				System.out.println("회원정보 수정메뉴로 이동합니다.");
				service.updateUser(inputStr);
				break;

			case "4":
				System.out.println("회원정보 삭제메뉴로 이동합니다.");
				service.deleteUser(inputStr);
				break;

			case "5":
				System.out.println("회원가입 사이트를 종료합니다.");
				run = false;
				break;

			default:
				System.out.println("1~5까지만 입력 바랍니다");
			}
		}
	}

}
