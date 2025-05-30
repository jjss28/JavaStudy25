package ch06.Service;

import java.util.Scanner;

public class StudentService {
	private String name;
	private ScoreService score;
	private StatsService stats;

	public String getName() {
		return name;
	}

	public ScoreService getScore() {
		return score;
	}

	public StatsService getStats() {
		return stats;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(ScoreService score) {
		this.score = score;
	}

	public void setStats(StatsService stats) {
		this.stats = stats;
	}

}
