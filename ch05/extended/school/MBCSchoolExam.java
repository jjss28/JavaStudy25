package ch05.extended.school;

import java.util.Scanner;

public class MBCSchoolExam {
	// 객체를 생성하여 상속 테스트용
		public static Scanner inputStr = new Scanner(System.in);
		public static Scanner inputInt = new Scanner(System.in);

		public static Teacher[] teachers = null;
		public static Student[] students = null;

		static {
			// main() 실행시 초기값 지정용
			teachers = new Teacher[10]; // 10명의 선생님이 들어갈 방 (배열)
			students = new Student[10]; // 10명의 학생이 들어갈 방 (배열)

		}

		public static void main(String[] args) {

			// 다형성 테스트용
			boolean run = true;
			while (run) {
				Person person = null;
				System.out.println("엠비씨 아카데미 LMS 프로그램입니다.");
				System.out.println("1. 교사 등록");
				System.out.println("2. 학생 등록");
				System.out.println("3. 프로그램 종료");
				System.out.print(">>>");
				String select = inputStr.next();
				switch (select) {
				case "1":
					person = new Teacher();
					person = baseInput(person); // 상속용 기본 메서드 (반복용)

					Teacher child = (Teacher) person; // Teacher child = new Teacher();
					// 강제타입변환
					System.out.print("교직원 번호를 입력하세요");
					child.setTeacherID(inputStr.next());
					System.out.println("담당 학년을 입력하세요");
					child.setGrade(inputInt.nextInt());
					System.out.println("담당 교실을 입력하세요");
					child.setRoom(inputInt.nextInt());
					System.out.println("담당 학생수를 입력하세요");
					child.setStcount(inputInt.nextInt());
					// 자식 객체 입력 완료
					System.out.println("교사정보 입력이 완료되었습니다.");
					System.out.println(child);
					// 배열에 for문을 이용해서 null이면 등록 가능하게 구현
					break;

				case "2":
					person = new Student();
					person = baseInput(person); // 상속용 기본 메서드 (반복용)

					Student child2 = (Student) person;
					System.out.println("학생 번호를 입력하세요 : ");
					child2.setStudentID(inputStr.next());
					System.out.println("학년을 입력하세요");
					child2.setGrade(inputInt.nextInt());
					System.out.println("학점을 입력하세요");
					child2.setGpa(inputInt.nextInt());
					child2.show();
					break;

				}
			}

			Teacher teacher = new Teacher();
			System.out.print("교직원 번호를 입력하세요");
			teacher.setTeacherID(inputStr.next());

			System.out.print("담당학년을 입력하세요");
			teacher.setGrade(inputInt.nextInt());

			System.out.print("담당교실을 입력하세요");
			teacher.setRoom(inputInt.nextInt());

			System.out.print("학생수를 입력하세요");
			teacher.setStcount(inputInt.nextInt()); // 자식객체

			System.out.println("선생님 이름을 입력하세요");
			teacher.setName(inputStr.next());

			System.out.println("선생님의 키를 입력하세요");
			teacher.setHeight(inputInt.nextInt());

			System.out.println("선생님의 몸무게를 입력하세요");
			teacher.setWeight(inputInt.nextInt());

			System.out.println("선생님의 나이를 입력하세요");
			teacher.setAge(inputInt.nextInt());

			System.out.println("입력된 선생님의 정보입니다" + teacher);
			teacher.show(); // 부모 메서드 입니다.
			System.out.println("=================================");

			System.out.println("학생의 이름을 입력하세요");
			String name = inputStr.next();

			System.out.println("학생의 나이를 입력하세요");
			int age = inputInt.nextInt();

			System.out.println("학생의 키를 입력하세요");
			int height = inputInt.nextInt();

			System.out.println("학생의 몸무게를 입력하세요");
			int weight = inputInt.nextInt();

			System.out.println("학생의 학번을 입력하세요");
			String sid = inputStr.next();

			System.out.println("학생의 학년을 입력하세요");
			int grade = inputInt.nextInt();

			System.out.println("학생의 학점을 입력하세요");
			int gpa = inputInt.nextInt();

			Student student = new Student(name, height, weight, age, sid, grade, gpa);
			// 생성자를 통해서 값을 넣음

			student.show(); // Student 객체 안의 메서드

		}

		public static Person baseInput(Person person) {

			// Person person = new Teacher();
			// 자동타입변환
			System.out.print("이름을 입력하세요 : ");
			person.setName(inputStr.next());
			System.out.print("키를 입력하세요 : ");
			person.setHeight(inputInt.nextInt());
			System.out.print("몸무게를 입력하세요 : ");
			person.setWeight(inputInt.nextInt());
			System.out.print("나이를 입력하세요 : ");
			person.setAge(inputInt.nextInt());
			System.out.println("======================");
			// 부모 객체 사용하여 입력완료

			return person;
		} // 부모 객체 입력용 공통 메서드 종료

	}