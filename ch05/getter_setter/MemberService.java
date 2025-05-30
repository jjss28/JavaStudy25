package ch05.getter_setter;

import java.util.Scanner;

public class MemberService {
	// 부메뉴로 dto를 가지고 CRUD하는 용도
	// 필드
	
	MemberDTO memberDTO = new MemberDTO();
	
	
	// 생성자
	
	
	// 메서드
	public void menu() {
	//	memberDTO.name = "김기원";
	//	memberDTO.age = 90;
	//	memberDTO.admin = true;
		// 앞으로 필드 접근은 게터와 세터를 이용한다.
	}// menu 메서드 종료
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		System.out.println(">>>");
		String name = input.next();
		
		System.out.println("나이를 입력하세요");
		int age = input.nextInt();
		
		System.out.println("관리자 유무를 입력하세요");
		boolean admin = input.nextBoolean();
		
		MemberDTO memberDTO = new MemberDTO();
		// 같은 패키지인 경우에는 import가 없다.
		memberDTO.setName(name);
		memberDTO.setAge(age);
		memberDTO.setAdmin(admin);
		
		
		System.out.println("객체에 저장된 이름 : " + memberDTO.getName());
		System.out.println("객체에 저장된 나이 : " + memberDTO.getAge());
		System.out.println("객체에 저장된 관리자 : " + memberDTO.isAdmin());
	}
}
