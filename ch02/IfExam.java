package ch02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		
		System.out.println("귀하에 성함을 입력하세요!!!");
		System.out.print(">>>");
		String name = input.next();
		
		System.out.println("국어 점수를 입력하세요 !!!");
		System.out.print(">>>");
		int kor = input.nextInt();
		
		if (kor > 0 && kor  <= 100) { 
			if (kor >= 90) { 
				System.out.println(name + "님 이 입력하신 국어점수가 90점 이상입니다.");
				System.out.println("점수 : " + kor + "등급 (A)");
			} else if (kor >= 80) {
				System.out.println(name + "님이 입력하신 국어점수가 89~80이상입니다.");
				System.out.println("점수 : " + kor + " : 등급 (B)");
			} else if (kor >= 70) {
				System.out.println(name + "님이 입력하신 국어점수가 79~70이상입니다.");
				System.out.println("점수 : " + kor + " : 등급 (C)");
			} else if (kor >= 60) {
				System.out.println(name + "님이 입력하신 국어점수가 69~60이상입니다.");
				System.out.println("점수 : " + kor + " : 등급 (D)");
			} else {
				System.out.println(name + "님이 입력하신 국어점수가 낮아 등급 F로 결정됨");
				System.out.println("점수 : " + kor + " : 등급 (F)");
			} 
		}else  {
			System.out.println(name + "님 입력값을 확인해주세요");
			System.out.println("현재 입력값은" + kor + "입니다.");
		}
		
		System.out.println("수학 점수를 입력하세요 !!!");
		System.out.print(">>>");
		int mat = input.nextInt();
		
		if (mat > 0 && mat  <= 100) { 
			if (mat >= 90) { 
				System.out.println(name + "님 이 입력하신 수학점수가 90점 이상입니다.");
				System.out.println("점수 : " + mat + "등급 (A)");
			} else if (mat >= 80) {
				System.out.println(name + "님이 입력하신 수학점수가 89~80이상입니다.");
				System.out.println("점수 : " + mat + " : 등급 (B)");
			} else if (mat >= 70) {
				System.out.println(name + "님이 입력하신 수학점수가 79~70이상입니다.");
				System.out.println("점수 : " + mat + " : 등급 (C)");
			} else if (mat >= 60) {
				System.out.println(name + "님이 입력하신 수학점수가 69~60이상입니다.");
				System.out.println("점수 : " + mat + " : 등급 (D)");
			} else {
				System.out.println(name + "님이 입력하신 수학점수가 낮아 등급 F로 결정됨");
				System.out.println("점수 : " + mat + " : 등급 (F)");
			} 
		}else  {
			System.out.println(name + "님 입력값을 확인해주세요");
			System.out.println("현재 입력값은" + mat + "입니다.");
		}
		
		System.out.println("영어 점수를 입력하세요 !!!");
		System.out.print(">>>");
		int eng = input.nextInt();
		
		if (eng > 0 && eng  <= 100) { 
			if (eng >= 90) { 
				System.out.println(name + "님 이 입력하신 영어점수가 90점 이상입니다.");
				System.out.println("점수 : " + eng + "등급 (A)");
			} else if (eng >= 80) {
				System.out.println(name + "님이 입력하신 영어점수가 89~80이상입니다.");
				System.out.println("점수 : " + eng + " : 등급 (B)");
			} else if (eng >= 70) {
				System.out.println(name + "님이 입력하신 영어점수가 79~70이상입니다.");
				System.out.println("점수 : " + eng + " : 등급 (C)");
			} else if (eng >= 60) {
				System.out.println(name + "님이 입력하신 영어점수가 69~60이상입니다.");
				System.out.println("점수 : " + eng + " : 등급 (D)");
			} else {
				System.out.println(name + "님이 입력하신 영어점수가 낮아 등급 F로 결정됨");
				System.out.println("점수 : " + eng + " : 등급 (F)");
			} 
		}else  {
			System.out.println(name + "님 입력값을 확인해주세요");
			System.out.println("현재 입력값은" + mat + "입니다.");
		}
		
		int total = kor + mat + eng ;
	
        double avg = ((double) total / 3) ; 
		
        System.out.println("총점 및 평균을 확인하시겠습니까?");
        String answer = input.next();
        if (answer.equalsIgnoreCase("yes")) {
		System.out.println(name + "님의 총점 : " + total);
		System.out.println(name + "님의 평균 : " + avg);
        } else { 
        	System.out.println("다시 입력해주세요.");
        }
		System.out.println("프로그램이 종료 되었습니다.");

	}  
		

} 
