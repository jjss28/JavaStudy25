package ch06.Service;

public class StatsService {
	private int total;
	private double avg;

	public StatsService(ScoreService score) {
		this.total = score.getKor() + score.getEng() + score.getMat();
		this.avg = total / 3;
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;

	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

}
