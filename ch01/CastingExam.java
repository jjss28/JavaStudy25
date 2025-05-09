package ch01;

public class CastingExam {

	public static void main(String[] args) {
	int intValue = 123456789 ;
	byte byteValue = (byte) intValue ; 
	
	System.out.println("int 타입 값 출력 : " + intValue);
	System.out.println("byte 타입 값 출력 : " + byteValue);
	
	int kor = 84 ;
	int eng = 99 ;
	int mat = 97 ;
	
	int total = kor + eng + mat ;
	
	System.out.println("===========성적표=========");
	System.out.println("국어 + 영어 + 수학 = 총점 : " + total);
	
	double avg = total / 3; // double로 소수점까지 표현.
	System.out.println("평균점수(자동타입) = " + avg);
	
	avg = (double) total / 3;
	System.out.println("평균점수(강제타입) = " + avg);

	}

}
