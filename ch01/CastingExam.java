package ch01;

public class CastingExam {

	public static void main(String[] args) {
	int intValue = 123456789 ;
	byte byteValue = (byte) intValue ; 
	
	System.out.println("int Ÿ�� �� ��� : " + intValue);
	System.out.println("byte Ÿ�� �� ��� : " + byteValue);
	
	int kor = 84 ;
	int eng = 99 ;
	int mat = 97 ;
	
	int total = kor + eng + mat ;
	
	System.out.println("===========����ǥ=========");
	System.out.println("���� + ���� + ���� = ���� : " + total);
	
	double avg = total / 3; // double�� �Ҽ������� ǥ��.
	System.out.println("�������(�ڵ�Ÿ��) = " + avg);
	
	avg = (double) total / 3;
	System.out.println("�������(����Ÿ��) = " + avg);

	}

}
