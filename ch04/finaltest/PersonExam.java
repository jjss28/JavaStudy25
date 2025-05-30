package ch04.finaltest;

public class PersonExam {

	public static void main(String[] args) {
		// 필드에 final을 붙인 객체를 사용해보자.
		Person person = new Person("123456-1234567", "김기원");
		System.out.println("국가 명 : " + person.nation);
		System.out.println("주민번호 : " + person.ssn);
		System.out.println("성명 : " + person.name);

		// person.nation = "USA";
		// person.ssn = "98765-1234567"; final로 적용되서 변경이 안됨.
		person.name = "나기원";

	}

}
