package ch06.Service;

public class ScoreService {
	private int kor;
	private int eng;
	private int mat;

	public ScoreService(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;

	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

}
