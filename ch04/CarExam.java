package ch04;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		// 자동차 주 실행 프로그램
		Scanner input = new Scanner(System.in);
		boolean run = true;
		boolean running = true;
		System.out.println("====차량정보 입력====");
		Car myCar = new Car(); // 기본생성자로 객체 생성
		// 생성시 속도와 rpm과 오일량은 기본값으로 생성
		System.out.println("제조회사 : ");
		myCar.company = input.next();

		System.out.println("모델 : ");
		myCar.model = input.next();

		System.out.println("색상 : ");
		myCar.color = input.next();

		while (run) {
			System.out.println("1. 차량 정보확인");
			System.out.println("2. 차량 시동걸기");
			System.out.println("3. 차량 주행시작");
			System.out.println("4. 차량 주행종료");
			System.out.print(">>>");
			String select = input.next();
			switch (select) {
			case "1":
				System.out.println("차량명" + myCar.company);
				System.out.println("모델명 : " + myCar.model);
				System.out.println("색상 : " + myCar.color);
				break;
			case "2":
				System.out.println("차량에 시동이 걸렸습니다.");
				myCar.start();
				break;
			case "3":
				while (running) {
					System.out.println("1. 가속");
					System.out.println("2. 감속");
					System.out.println("3. 주차");
					System.out.print(">>>");
					int choice = input.nextInt();
					if (choice == 1) {
						System.out.println("가속입력값을 넣어주세요.");
						System.out.print(">>>");
						int amount = input.nextInt();
						myCar.acceleration(amount);
					} else if (choice == 2) {
						System.out.println("감속입력값을 넣어주세요.");
						int amount = input.nextInt();
						myCar.deceleration(amount);
					} else if (choice == 3) {
						if(myCar.speed ==0) 
						myCar.parking();
						running = false;
					}else {
						myCar.parking();
					}

				} // while문 종료
				break;
			case "4" :
				System.out.println("차량 주행을 종료합니다.");
				run = false;
				break;

			} // 스위치문 종료

		} // while문 종료

	}

}
