package ch05.extended.school;

public class Student extends Person {
	// Person 객체의 자식 클래스
	// Student 객체를 생성하면 Person 객체부터 생성하고 Student가 나중에 생성됨.

	private String studentID; // 학번
	private int grade; // 학년
	private int gpa; // 학점
	// Student student = new Student(이름, 키, 몸무게, 나이, 학번, 학년, 학점)

	public Student(String name, int height, int weight, int age, String studentID, int grade, int gpa) {
		super(name, height, weight, age); // 부모생성자의 값을 넣는다.
		this.studentID = studentID;
		this.grade = grade;
		this.gpa = gpa;
	}

	// 부모 생성자 + 자식 기본생성자
	public Student(String name, int height, int weight, int age) {
		super(name, height, weight, age);
	}

	// 부모 기본생성자 + 자식 기본생성자용
	public Student() {
		super();
	}

	// 자식 클래스의 게터세터
	public String getStudentID() {
		return studentID;
	}

	public int getGrade() {
		return grade;
	}

	public int getGpa() {
		return gpa;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	@Override // 부모에서 만든 코드가 마음에 들지않아 자식에서 재정의
	public void show() {
		super.show();

		System.out.println("----------자식에서 재정의한 show----------");
		System.out.println("학생 학번 : " + getStudentID()); // 자식
		System.out.println("학생 학년 : " + getGrade());
		System.out.println("학생 학점 : " + getGpa()); // 부모
	}

	

}
