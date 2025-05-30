package ch04.singleton;

public class SingletonExam {
	public static void main(String[] args) {
		// 싱글톤 객체 생성 테스트
		// Singleton obj1 = new Singleton(); 생성자에 private이 적용되어 안됨.
		// Singleton obj2 = new Singleton();

		Singleton obj3 = Singleton.getInstance(); // 단 1개의 객체 생성됨.
		Singleton obj4 = Singleton.getInstance(); // 객체의 주소가 연결됨.

		System.out.println("obj3와 obj4가 같은가??" + (obj3 == obj4));
	}

}
