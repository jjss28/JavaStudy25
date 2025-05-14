package ch02;

import java.util.Scanner;

public class UpAndDownExam {

	public static void main(String[] args) {
		int input = 0; int answer = 0 ; // 입력값, 정답의 초기값 설정
		answer = (int)(Math.random()*100) + 1 ; // 정답은 1~100까지 숫자의 랜덤 숫자
        Scanner num = new Scanner(System.in); // 예측값 num 설정
     do {   
        System.out.println("1~100까지 숫자를 입력하세요.");
        System.out.println("(1~100) >>>>");
        input = num.nextInt();
        
        if(input > answer) {
        	System.out.println("down");
        } else if (input < answer) {
		System.out.println("up");	
	  }
	
    } while(input != answer) ; 
      System.out.println("정답입니다." + answer);

  } // main 메서드 종료

} // class 종료
