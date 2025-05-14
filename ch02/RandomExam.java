package ch02;

import java.util.Scanner;

public class RandomExam {

	public static void main(String[] args) {
	
	System.out.println("주민등록번호를 입력하세요 (-생략) : ");
	Scanner in = new Scanner(System.in) ;
	
	String ssn = in.next();
	
	char ssn2 = ssn.charAt(6); 
	int num = Character.getNumericValue(ssn2);
	
	if(num % 2 == 0) {
		System.out.println("여자");
	} else if(num % 2 == 1) {
		System.out.println("남자");
	} else {
		System.out.println("다시 작성해주세요");
	}
	
	

	System.out.println("1부터 45까지 번호 중 6개를 입력해주세요");
	System.out.println(">>>");
	
	int mn1 = in.nextInt();
	System.out.println("첫번째 번호 : " + mn1);
	int mn2 = in.nextInt();
	System.out.println("두번째 번호 : " + mn2);
	int mn3 = in.nextInt();
	System.out.println("세번째 번호 : " + mn3);
	int mn4 = in.nextInt();
	System.out.println("네번째 번호 : " + mn4);
	int mn5 = in.nextInt();
	System.out.println("다섯번째 번호 : " + mn5);
	int mn6 = in.nextInt();
	System.out.println("여섯번째 번호 : " + mn6);
	
	int num1 = (int)(Math.random()*45) + 1;
	int num2 = (int)(Math.random()*45) + 1;
	int num3 = (int)(Math.random()*45) + 1;
	int num4 = (int)(Math.random()*45) + 1;
	int num5 = (int)(Math.random()*45) + 1;
	int num6 = (int)(Math.random()*45) + 1;
	
	int x = 0; // 맞은 숫자 변수 설정
	
	if(mn1 == num1 || mn1 == num2 || mn1 == num3 || mn1 == num4 || mn1 == num5 || mn1 == num6) {
		++ x ;
	}
	if(mn2 == num1 || mn2 == num2 || mn2 == num3 || mn2 == num4 || mn2 == num5 || mn2 == num6) {
		++ x ;
	}
	if(mn3 == num1 || mn3 == num2 || mn3 == num3 || mn3 == num4 || mn3 == num5 || mn3 == num6) {
		++ x ;
	}
	if(mn4 == num1 || mn4 == num2 || mn4 == num3 || mn4 == num4 || mn4 == num5 || mn4 == num6) {
		++ x ;
	}
	if(mn5 == num1 || mn5 ==num2 || mn5 ==num3 || mn5 ==num4 || mn5 ==num5 || mn5 ==num6) {
		++ x ;
	}
	if(mn6 == num1 || mn6 ==num2 || mn6 ==num3 || mn6 ==num4 || mn6 ==num5 || mn6 ==num6) {
		++ x ;
	}
	
   System.out.println("이번주 로또 당첨 번호 입니다.");
   System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);
  
   if (x == 0) {
       System.out.println("번호가 하나도 맞지 않았습니다.");
    } else if (x == 1) {
       System.out.println("축하합니다. 번호가 1개 맞았습니다.");
    } else if (x == 2) {
       System.out.println("축하합니다. 번호가 2개 맞았습니다.");
    } else if (x == 3) {
       System.out.println("축하합니다. 번호가 3개 맞았습니다.");
    } else if (x == 4) {
       System.out.println("축하합니다. 번호가 4개 맞았습니다.");
    } else if (x == 5) {
       System.out.println("축하합니다. 번호가 5개 맞았습니다.");
    } else if (x == 6) {
       System.out.println("축하합니다. 번호가 6개 맞았습니다.");
    } else {
       System.out.println("시스템이 아파요");
    }

	}



}


