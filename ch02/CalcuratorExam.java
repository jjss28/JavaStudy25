package ch02;

import java.util.Scanner;

public class CalcuratorExam {

	// 숫자 > 연산자 > 숫자
	// 연산자별로 메서드에 숫자 넣기, (입력받는 순서에 맞춰서 메서드에서 해결)
	// 결과값 main 메서드에서 출력해주기 (return을 다시받아서)

	static int plus(int x1, int x3) {
			int x4 = 0;
			x4 = x1 + x3 ;
			return x4;
	}
	static int minus(int x1, int x3) {
			int x4 = 0;
			x4 = x1 - x3 ;
			return x4;
	}
	static int times(int x1, int x3) {
			int x4 = 0;
			x4 = x1 * x3 ;
			return x4;
	}
	static int divide(int x1, int x3) {
		int x4 = 0;
		x4 = x1 / x3;
		return x4;
	}

	public static void main(String[] args) {
		
	 int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0;
	 // x1 첫번째 입력 숫자, x2 연산기호, x3 두번째 입력숫자, x4 계산값, x5 다음여부
	 
	 boolean run = true, run2 = true;
	 
	 String y1 = "연산기호";
	 
	 Scanner scInt = new Scanner(System.in);
	
	 while (run) {
		 if(x1 == 0) {
			 System.out.println("**정수계산기**\n숫자를 입력해주세요(int 범위 내에서만)\n>>");
             x1 = scInt.nextInt();			 
		 }
		 
		 System.out.println("부호를 선택해주세요");
		 x2 = scInt.nextInt();
		 
		 System.out.println("숫자를 입력해주세요");
		 x3 = scInt.nextInt();
		 
		 run2 = true;
		 
		 switch (x2) {
		 
		 case 1 : 
			 x4 = plus(x1, x3); y1 = "+";
			 break;
			 
		 case 2 : 
			 x4 = minus(x1, x3); y1 = "-";
		     break;
		 case 3 : 
			 x4 = times(x1, x3); y1 = "x";
			 break;
		 case 4 : 
			 x4 = divide(x1, x3); y1 = "÷";
			 break;
		 }
			 System.out.println("계산결과 :"+x1 +" " +y1+" "+x3 +" = " + x4);
			 
		 while(run2)
			 if(x4 != 0) {
				 System.out.println("1. 종료하기\n2.다시하기\n3.이어서 계산하기\n>>>");
				 
			 }else {
				 System.out.println("1. 종료하기\n2.다시하기\n>>>");
			 }
			 
		     x5 = scInt.nextInt();
		     
		     switch (x5) {
		     case 2 : 
		    	 x1 = 0;
		    	 
		    	 x2 = 0;
		    	 
		    	 x3 = 0;
		    	 
		    	 run2 = false;
		    	 break;
		     case 3 : 
		    	 x1 = x4;
		    	 
		    	 x2 = 0;
		    	 
		    	 x3 = 0;
		    	 
		    	 run2 = false;
		    	 break;
		    	 
		     case 1 : 
		    	 run = false; run2 = false;
		    	 break;
	    	 default : 
	    		 System.out.println("숫자를 잘못 선택하셨습니다.\n다시 입력해주세요\n");
	    		 
		    	 
		    	 

		     } // switch 문 종료
			 
			 
		 } // while(run2) 종료
		 } // while(run1) 종료
		} // main 메서드 종료
 // class 종료
