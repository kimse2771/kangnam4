package ch02;

import java.util.Scanner;

public class ArithmeticExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 5000;
		
		
		// 키보드로 입력받을 스캐너 객체 생성

		
		
		System.out.println("시분초로 출력하기");
		
	
		
		int second = time % 60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.println(time + "초는");
		System.out.println(hour + "시간");
		System.out.println(minute + "분");
		System.out.println(second + "초입니다.");

	}

}
