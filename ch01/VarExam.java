package ch01;

public class VarExam {

	public static void main(String[] args) {
		int x = 1 ;
		
		char y = 65 ;
		
		char z = 'A' ;
		
	    System.out.println("int x = " + x);
	    System.out.println("char y = " + y);
	    System.out.println("char z = " + z);
	    
        char z1 = 'b' ; 
		
		int x1 ; 
		x1 = 10 ;
		System.out.println(x1);
		
        int kor, mat, eng, total, avg ;
		
		kor = 91 ;
		mat = 80 ;
		eng = 70 ;
		total = kor + mat + eng ;
		avg = total / 3 ; 
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		
		int price, $price, _price ;
		
		char firstname = '��' ; 
		char firstName = '��' ;
		
		System.out.println("�� : " + firstname);
		System.out.println("�� : " + firstName);
		
		int literal1 = 75 ; // 10����
		int literal2 = 075 ; // 8����
		int literal3 = 0b0011 ; // 2����
		int literal4 = 0xA ; // 16����
		
		System.out.println("10���� 75 : " + literal1);
		System.out.println("8���� 75 : " + literal2);
		System.out.println("2���� 0011 : " + literal3);
		System.out.println("16���� A : "+ literal4);
	}

}
