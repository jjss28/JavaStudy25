package ch02;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		// for문은 반복문으로 초기화식, 조건식, 증감식으로 만든다.
    	// for(int i=0 ; i<10 ; i++){ 반복실행문; }
		// i는 0부터 10이전까지 1씩 반복하는 실행문!
		// for문에서 사용하는 i 초기값은 for{}끝나면 사라진다.
		Scanner inputInt = new Scanner(System.in);
		System.out.println("확인할 max 값을 입력하세요.");
		System.out.println(">>>");
		int max = inputInt.nextInt();
		
		System.out.println("확인할 min 값을 입력하세요.");
		System.out.println(">>>");
		int min = inputInt.nextInt();
		
		System.out.println("확인할 증가값을 입력하세요.");
		System.out.println(">>>");
		int add = inputInt.nextInt();
		
		System.out.println(min + "~" + max + "까지" + add + "증가값을 출력해보자.");
		int total = 0;
		
		for(total = min; total <=max; total+=add) {
			System.out.println("출력 테스트 : " + total);
		}
	}

}
