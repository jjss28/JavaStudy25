package ch04;

import java.util.Scanner;

public class MemberExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] names = null;
		String[] ids = null;
		String[] pws = null;
		MemberGrade[] grades = null;
		
		System.out.println("등록할 회원수를 입력해주세요");
		System.out.print(">>>");
		int count = input.nextInt();
		names = new String[count];
		ids = new String[count];
		pws = new String[count];
		grades = new MemberGrade[count];
		
		System.out.println("회원가입 시작. 정보를 입력해주세요.");
		
	    

	}

}
