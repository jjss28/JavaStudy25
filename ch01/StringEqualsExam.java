package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		// ���ݱ��� ��� ���� Ÿ���� �⺻Ÿ������ �ڹٿ��� ��ü ���� ����.
		// String�� ���� ��ü�� �����ϰ� ������ ������ ���ǻ� ������.
		
		String strval1 = "kim" ;
		String strval2 = "kim" ;
		String strval3 = new String("kim") ; // ��ü��������
		System.out.println(strval1 == strval2); // true
		System.out.println(strval1 == strval3);
		
		// ��ü�� �ּҸ� �Ǵ��� ���� == �� �����
		// ��ü�� ���� ���� ������� ���� ����� �޼��带 ����ؾ���
		// String�� ��ü�̰� ��ü ���ʿ��� �޼������ ��� �ִ�.
		// �޼��尡 ��������� .�� ������ ���δ�.
		boolean eq1 = strval1.equals(strval3) ;
		System.out.println("1�� 3���� equals �޼��� ��� ��� : " + eq1);

	}

}
