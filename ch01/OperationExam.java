package ch01;

public class OperationExam {

	public static void main(String[] args) {
		
		int x = 10 ;
		x++ ; 
		System.out.println("10�� ++ ���� ������ ��� : " + x);
		
		x-- ; 
		System.out.println("x�� -- ���� ������ ��� : " + x);
		
		
		int y = 20 ;
		int result = x + y ;
		
		System.out.println("x + y = " + result);
		
		
		boolean result1 = (result>10) ? true : false ;
	
		System.out.println("result>10 ��� : " + result1);
		
		String result2 = (result>50) ? "ũ��" : "�۴�" ;
		System.out.println("result>50 ��� : " + result2);
		
		int x1 = 10 * 10 ; 
		System.out.println("10 x 10 = " + x1);
		int x2 = 10 / 3 ; 
		System.out.println("10 / 3 = " + x2);
		int x3 = 10 % 3 ; 
		System.out.println("10�� 3���� ���� ������ = " + x3);
		
		int odd = 11 ;
		int div = odd % 2 ; 
		String resultodd = (div == 1) ? "Ȧ��" : "¦��" ;
		System.out.println("11�� Ȧ¦ ��� ��� : " + resultodd);
		
		int multi4 = 24 ;
		int div4 = multi4 % 4 ;  
		String resultdiv4 = (div4 == 0) ? "4�ǹ���� ����" : "4�ǹ���� �ƴ�" ;
		System.out.println("4�ǹ�� �Ǵ� ��� : " +resultdiv4);
		
		// ���� ������ �׽�Ʈ
		System.out.println("-----------���� ������ ��ġ�� �ٸ� ���------------");
		int a = 10 ;
		a++ ;
		++a ;
		System.out.println("a++ -> ++a�� ��� :" + a );
		
		int b = 10 ;
		b-- ;
		--b ;
		System.out.println("10 -> b-- -> --b�� ��� :" +b);
		
		int c ;
		c = a++ ; 
		System.out.println("a�� ��� : " + a); 
		System.out.println("c�� ��� : " + c); 
		System.out.println("---------------------------");
		
		c = ++a ;
		System.out.println("a�� ��� : " + a); 
		System.out.println("c�� ��� : " + c); 
		System.out.println("---------------------------");
		
		c = ++a + b++ ;
		System.out.println("a�� ��� : " + a); 
		System.out.println("b�� ��� : " + b);
		System.out.println("c�� ��� : " + c); 
		System.out.println("--------------------");
		

	}

}
