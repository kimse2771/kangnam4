package ch02;

import java.util.Scanner;

public class ArithmeticExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 69;

		// 2�ڸ� ������ �Է¹޾Ƽ� ��� �������� ���
		Scanner scanner = new Scanner(System.in);
		
		input = scanner.nextInt();
		
		
		System.out.println("�����ڸ��� : "+(input/10));
		System.out.println("�����ڸ��� : "+(input%10));
	}

}
