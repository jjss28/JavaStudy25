package ch05.extended.school;

public class Teacher extends Person {
	private String teacherID; // 교직원 번호
	private int grade; // 담당 학년
	private int room; // 담당 교실
	private int Stcount; // 학생수

	public Teacher() { // 기본생성자
		super();
	}

	// 게터 세터 메서드

	public String getTeacherID() {
		return teacherID;
	}

	public int getGrade() {
		return grade;
	}

	public int getRoom() {
		return room;
	}

	public int getStcount() {
		return Stcount;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public void setStcount(int stcount) {
		Stcount = stcount;
	}

	@Override // 재정의 프린트로 출력하면 주소가 나오는데 이것을 필드값으로 출력
	public String toString() {
		return "Teacher [teacherID=" + teacherID + ", grade=" + grade + ", room=" + room + ", Stcount=" + Stcount
				+ ", getName()=" + getName() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight()
				+ ", getAge()=" + getAge() + "]";
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("----------자식에서 재정의한 show----------");
		System.out.println("교사 담당학년 : " + getGrade()); 
		System.out.println("교사 담당교실 : " + getRoom());
		System.out.println("교사 교직원번호 : " + getTeacherID());
		System.out.println("교사 담당학생수 : " + getStcount());
	}
}
