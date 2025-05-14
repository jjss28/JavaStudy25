package ch02;

public class IfExam2 {

	public static void main(String[] args) {
		// 실습 예제 90이상 인지를 묻고 95점 이상이면 A+등급을 출력하는 중첩 if문을 만들어 보자.
		int score = (int)( Math.random()*20 ) + 81; 
		System.out.println("현재 나의 점수 : " + score );
		System.out.println(">>>");
		String grade ;
		if(score >= 90) {
			if(score>=95) {
				grade = "A+" ;
			} else {
				grade = "A";
		    }
		    } else {
		 	if(score>=85) {
				grade = "B+" ;
			} else {
				grade = "B" ;
            }
        }
             System.out.println("학점 : " +grade);
	}

}
