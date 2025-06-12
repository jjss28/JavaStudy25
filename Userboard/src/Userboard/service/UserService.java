package Userboard.service;

import java.sql.SQLException;
import java.util.Scanner;

import Userboard.dao.UserDAO;
import Userboard.dto.UserDTO;

public class UserService {
	private UserDAO dao = new UserDAO();

	public void insertUser(Scanner input) throws SQLException {
		UserDTO user = new UserDTO();
		System.out.print("이름 : ");
		user.setName(input.next());
		System.out.print("아이디 : ");
		user.setId(input.next());
		System.out.print("비밀번호 : ");
		user.setPw(input.next());
		dao.insertUser(user);
	}

	public void readAll() throws SQLException {
		dao.readAll();
	}

	public void updateUser(Scanner input) throws SQLException {
		System.out.print("수정할 회원번호 입력 : ");
		int mno = input.nextInt();
		UserDTO user = new UserDTO();
		System.out.print("새 이름 : ");
		user.setName(input.next());
		System.out.print("새 아이디 : ");
		user.setId(input.next());
		System.out.print("새 비밀번호 : ");
		user.setPw(input.next());
		dao.updateUser(mno, user);
	}

	public void deleteUser(Scanner input) throws SQLException {
		System.out.print("삭제할 회원번호 입력 : ");
		int mno = input.nextInt();
		dao.deleteUser(mno);
	}
}
