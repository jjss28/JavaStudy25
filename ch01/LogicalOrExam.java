package ch01;

import java.util.Scanner;

public class LogicalOrExam {

	public static void main(String[] args) {
		// ���� �׽�Ʈ��
		// & ������ ��κ� ������ 2�� �̻��� ��� �Ǵ��ϴ� �뵵�� ����Ѵ�.
		// ���� ��� id �� pw�� �Ѵ� �¾ƾ� �α����� �����ϴ� ���!!
		// (������ �ִ� id == Ű����� �Է��� id) & (������ �ִ� pw == Ű����� �Է��� pw)
		//              false                               false             = false
		//              true                                false             = false
		//              false                               true              = false
		//              true                                true              = true
		
		Scanner input = new Scanner(System.in); // Ű����� �Է��� �� �ִ� ��ü ������.
		System.out.println("������ �Է��Ͻø� ��ҹ��ڳ� ���ڸ� �Ǵ��� �帱�Կ�!!");
		System.out.println("�����ڵ�ǥ�� �����Ͽ� ���α׷��� �����Ͽ����ϴ�.");
		System.out.println("���� �Է� >>>");
		int charCode = input.nextInt(); //Ű����� �������� �Էµǰ� ������ ��.
		
		//if(���Ǵܹ�){ ���Ǵܹ��� true ���϶� ����Ǵ� �� }
		//else { ���Ǵܹ��� false���϶� ����Ǵ� �� }
		if((charCode >= 65) & (charCode <= 90)) {
			// �Էµ� ���� ���� 65 �̻��̰� 90�����̸� �빮��
			System.out.println("���� �Էµ� ���ڴ� �빮�� �Դϴ� : " + (char)charCode);
		}else if( (charCode>=97)  && (charCode<=122) ) { 
			// ������ ����� if ���� false�� ��� �� �񱳸� �ϰ� ��.
			// �Էµ� ���� ���� 97 �̻��̰� 122 �����̸� �ҹ���
			// &&�� ����ϸ� ���� ó���� �Ѵ�. (�ڵ�Ʃ��)
			System.out.println("���� �Էµ� ���ڴ� �ҹ��� �Դϴ�. : " + (char)charCode );
		}else if( !( charCode < 48 )  && !( charCode > 57 ) ) {
		   // NAND �����̴�. ��𸣰��� ��Ģ�� �ľ��ϸ� NOR
		   // 48���� ���� �ʰ� 57���� ũ�� ���� �񱳹�
			System.out.println("���� �Էµ� ���ڴ� �����ڵ��� �����׼��� �Դϴ�. : " 
		   + (char)charCode );
		}else {
			System.out.println("�빮��, �ҹ���, ������ �����ڵ� ǥ ���� �����Դϴ�.");
			System.out.println("���α׷��� �ٽ� ������ �ּ���!!!");
			
		} // ���� if�� ����


	}// main �޼��� ����

}// class ����

