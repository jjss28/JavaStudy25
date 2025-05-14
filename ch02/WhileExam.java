package ch02;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = input.nextLine();
        System.out.println("국어점수를 입력하세요");
		int kor = input.nextInt();
		System.out.println("영어점수를 입력하세요");
	    int eng = input.nextInt();
		System.out.println("수학점수를 입력하세요");
	    int mat = input.nextInt();
				
	}

}
