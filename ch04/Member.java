package ch04;

import java.util.Scanner;

public class Member {

	public int mno;
	public String id;
	public String pw;

	public Member() {

	}

	public Member memberAdd(Scanner input) {
		Member member = new Member();
		System.out.println("회원가입용 메서드입니다.");
		System.out.println("회원번호를 입력해주세요.");
		System.out.println("(숫자) >>>");
		member.mno = input.nextInt();

		System.out.println("id를 입력해주세요.");
		member.id = input.next();

		System.out.println("pw를 입력해주세요.");
		member.pw = input.next();
		return member;

	} // memberAdd() 메서드 종료

	public void memberAllList(Member[] members) {
		System.out.println("모든 회원보기 리스트 메서드 입니다.");
		for (int i = 0; i < members.length; i++) {
			Member memberlist = new Member();
			System.out.print("회원번호 : " + members[i].mno);
			System.out.print(": 회원id : " + members[i].id);
			System.out.print(": 회원pw : " + members[i].pw);
			System.out.println("----------------------------");

		}
	} // memberAllList()메서드 종료

	public boolean memberLogin(Member[] members) {
		Scanner scanner = new Scanner(System.in);
		String id = scanner.next();
		String pw = scanner.next();
		System.out.println("로그인 메서드 입니다.");
		System.out.println("회원번호를 입력해주세요.");
		System.out.print(">>>");

		System.out.println("id를 입력해주세요");
		System.out.print(">>>");
		System.out.println("pw를 입력해주세요");
		System.out.print(">>>");
		for (int i = 0; i < members.length; i++) {
			if (id.equals(members[i]) && pw.equals(members[i])) {
				System.out.println("로그인 성공");
				return true;

			} else {
				System.out.println("id나 pw가 불일치합니다.");
				return false;
			}
		}
		return false;
	}

	public void memberUpdate() {
		System.out.println("회원수정 메서드 입니다.");
	}

	public void memberDelete() {
		System.out.println("회원탈퇴 메서드 입니다.");
	}

	// 메서드
}
