package ch01;

public class AccuracyExam2 {

	public static void main(String[] args) {
		// ��� 1���� 10���� �ɰ��� �Ҽ����� ó���������� 10���� ���ؼ�
		// Ȱ���� �غ���. int Ÿ�Ը� Ȱ��

		int apple = 1 ; // ��� 1��
		int totalPieces = apple*10 ; // 10���� ó����
		int number = 7 ; // ��� 1����
		int temp = totalPieces - number ; // 10���� - 7����
		
		double result = temp / 10.0 ; // ������ 10������ ����ġ
		System.out.println("��� ���� ���� �� : " + result);
		
		// ��Ȯ�� ����� ���� ���� �������� �ٲ㼭 ���
	}

}
