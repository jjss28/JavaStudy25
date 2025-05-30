package ch05.extended.school;

public class Person {
	// 부모 클래스로 자식이 상속받는다.

	private String name;
	private int height;
	private int weight;
	private int age;

	public Person(String name, int height, int weight, int age) {
		// Person person = new Person(이름, 키, 몸무게, 나이);
		super(); // 부모생성자 -> superclass (자바의 최상위 부모객체) -> 생략가능
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}

	public Person() {// 기본생성자 = new person();용
		super();
	}

	// 게터 세터 메서드(필드가 개인적으로 선언되었기때문에 메서드로 접근 -> 캡슐화)

	public String getName() {
		// 이름 필드 값을 리턴한다.
		return name;
	}

	public int getHeight() {
		// 키 필드 값을 리턴한다.
		return height;
	}

	public int getWeight() {
		// 몸무게 필드 값을 리턴한다.
		return weight;
	}

	public int getAge() {
		// 나이 필드 값을 리턴한다.
		return age;
	}

	public void setName(String name) {
		// 파라미터로 받은 이름을 필드로 전달한다.
		this.name = name;
	}

	public void setHeight(int height) {
		// 파라미터 받은 키를 필드로 전달한다.
		this.height = height;
	}

	public void setWeight(int weight) {
		// 파라미터 받은 몸무게를 필드로 전달한다.
		this.weight = weight;
	}

	public void setAge(int age) {
		// 파라미터 받은 나이를 필드로 전달한다.
		this.age = age;
	}
	
	// 부모가 가지고 있는 공통 메서드
	
	// 추가 메서드 -> 자식에게 전파가 된다.
	
	public void show() { 
		// Student에 있는 show 메서드를 부모로 옮기고
		// 필요없는 출력은 제거
		// 입력된 필드를 출력하는 메서드
		System.out.println("-----------------");
		System.out.println("이름 : " + getName()); //부모
		System.out.println("나이 : " + getAge());
		System.out.println("키 : " + getHeight());
		System.out.println("몸무게 : " + getWeight());
//		System.out.println("---------------");
//		System.out.println("학생 학번 : " + getStudentID()); //자식
//		System.out.println("학생 학년 : " + getGrade());
//		System.out.println("학생 학점 : " + getGpa()); //부모

	}

}
