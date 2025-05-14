package ch01;

public class OperationExam {

	public static void main(String[] args) {
		
		int x = 10 ;
		x++ ; 
		System.out.println("10에 ++ 단항 연산한 결과 : " + x);
		
		x-- ; 
		System.out.println("x에 -- 단항 연산한 결과 : " + x);
		
		
		int y = 20 ;
		int result = x + y ;
		
		System.out.println("x + y = " + result);
		
		
		boolean result1 = (result>10) ? true : false ;
	
		System.out.println("result>10 결과 : " + result1);
		
		String result2 = (result>50) ? "크다" : "작다" ;
		System.out.println("result>50 결과 : " + result2);
		
		int x1 = 10 * 10 ; 
		System.out.println("10 x 10 = " + x1);
		int x2 = 10 / 3 ; 
		System.out.println("10 / 3 = " + x2);
		int x3 = 10 % 3 ; 
		System.out.println("10을 3으로 나눈 나머지 = " + x3);
		
		int odd = 11 ;
		int div = odd % 2 ; 
		String resultodd = (div == 1) ? "홀수" : "짝수" ;
		System.out.println("11의 홀짝 계산 결과 : " + resultodd);
		
		int multi4 = 24 ;
		int div4 = multi4 % 4 ;  
		String resultdiv4 = (div4 == 0) ? "4의배수가 맞음" : "4의배수가 아님" ;
		System.out.println("4의배수 판단 결과 : " +resultdiv4);
		
		// 증감 연산자 테스트
		System.out.println("-----------증감 연산자 위치에 다른 결과------------");
		int a = 10 ;
		a++ ;
		++a ;
		System.out.println("a++ -> ++a의 결과 :" + a );
		
		int b = 10 ;
		b-- ;
		--b ;
		System.out.println("10 -> b-- -> --b의 결과 :" +b);
		
		int c ;
		c = a++ ; 
		System.out.println("a의 결과 : " + a); 
		System.out.println("c의 결과 : " + c); 
		System.out.println("---------------------------");
		
		c = ++a ;
		System.out.println("a의 결과 : " + a); 
		System.out.println("c의 결과 : " + c); 
		System.out.println("---------------------------");
		
		c = ++a + b++ ;
		System.out.println("a의 결과 : " + a); 
		System.out.println("b의 결과 : " + b);
		System.out.println("c의 결과 : " + c); 
		System.out.println("--------------------");
		

	}

}
