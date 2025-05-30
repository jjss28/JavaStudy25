package ch06;

import java.util.Scanner;

import ch06.Service.PrintService;
import ch06.Service.ScoreService;
import ch06.Service.StatsService;
import ch06.Service.StudentService;

public class MBCSchool {
	private StudentService[] students = new StudentService[50];
	private int studentCount = 0;
	private Scanner input = new Scanner(System.in);
	private PrintService print = new PrintService();

	public static void main(String[] args) {
		MBCSchool app = new MBCSchool();
		app.run();
	}

	public void run() {
		boolean run = true;
		while (run) {
			System.out.println("=====성적처리 프로그램=====");
			System.out.println("1. 학생 성적 입력");
			System.out.println("2. 성적표 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 성적 삭제");
			System.out.println("5. 프로그램 종료");

			int select = input.nextInt();

			switch (select) {
			case 1:
				inputStudent();
				break;
			case 2:
				print.print(students, studentCount);
				break;
			case 3:
				// updateStudent();
				break;
			case 4:
				// deleteStudent();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("1~5까지만 입력해주세요.");
			}

		}
	}

	private void inputStudent() {
		if (studentCount >= students.length) {
			System.out.println("학생수 오류");
			return;
		}
		StudentService student = new StudentService();
		System.out.println("이름 : ");
		student.setName(input.next());
		System.out.println("국어 : ");
		int kor = input.nextInt();
		System.out.println("영어 : ");
		int eng = input.nextInt();
		System.out.println("수학 : ");
		int mat = input.nextInt();

		ScoreService score = new ScoreService(kor, eng, mat);
		StatsService stats = new StatsService(score);

		student.setScore(score);
		student.setStats(stats);
		students[studentCount] = student;
		studentCount++;
		System.out.println("성적이 입력되었습니다.");
	}
}
