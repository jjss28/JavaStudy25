package ch05.package_test.package1;

public class B {
	A a ; // A 클래스는 B 클래스와 같은 패키지임 (가능)
	
	
	A a1 = new A(true) ;   // public용
	A a2 = new A(1);       // default용
	// A a3 = new A("문자열"); // private용
}
