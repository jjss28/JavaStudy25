package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		// 지금까지 배운 변수 타입은 기본타입으로 자바에서 객체 없이 사용됨.
		// String도 원래 객체를 생성하고 만들어야 하지만 편의상 생략함.
		
		String strval1 = "kim" ;
		String strval2 = "kim" ;
		String strval3 = new String("kim") ; // 객체생성문구
		System.out.println(strval1 == strval2); // true
		System.out.println(strval1 == strval3);
		
		// 객체의 주소를 판단할 때는 == 을 사용함
		// 객체의 안쪽 값을 동등비교할 때는 내장된 메서드를 사용해야함
		// String은 객체이고 객체 안쪽에는 메서드들이 들어 있다.
		// 메서드가 보고싶으면 .을 찍으면 보인다.
		boolean eq1 = strval1.equals(strval3) ;
		System.out.println("1과 3번의 equals 메서드 사용 결과 : " + eq1);

	}

}
