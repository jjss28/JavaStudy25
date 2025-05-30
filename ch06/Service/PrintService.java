package ch06.Service;

public class PrintService {
	public void print(StudentService[] students, int count) {
		System.out.println("=====성적표=====");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

		for (int i = 0; i < count; i++) {
			StudentService s = students[i];
			ScoreService score = s.getScore();
			StatsService stats = s.getStats();

			System.out.println(s.getName() + "\t" + score.getKor() + "\t" + score.getEng() + "\t" + score.getMat()
					+ "\t" + stats.getTotal() + "\t" + stats.getAvg());
		}
	}

}
