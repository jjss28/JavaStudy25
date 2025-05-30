package ch04.singleton;

public class Singleton {
	// 싱글톤은 단 1개의 객체만 만들 수 있도록 보장하는 방법
	// 예약어로 싱글톤은 존재하지 않는다.
	// 단, 생성할때 private static을 선언한다.

	// 정적 필드 (싱글톤은 자신 객체를 미리 1개 만들어 놓고 정적 메서드에서 호출함)
	private static Singleton singleton = new Singleton();

	// 정적 생성자
	private Singleton() {
		// private이란 자신 클래스만 객체를 생성할 수 있다.

	}

	// 정적 메서드
	public static Singleton getInstance() {
		return singleton;
	}

}
