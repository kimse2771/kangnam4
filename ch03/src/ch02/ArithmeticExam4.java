package ch02;

import java.util.Scanner;

public class ArithmeticExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 69;

		// 2자리 정수를 입력받아서 목과 나머지를 출력
		Scanner scanner = new Scanner(System.in);
		
		input = scanner.nextInt();
		
		
		System.out.println("십의자리수 : "+(input/10));
		System.out.println("일의자리수 : "+(input%10));
	}

}
