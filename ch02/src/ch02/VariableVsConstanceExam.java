package ch02;

public class VariableVsConstanceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y;

		y =20;
		x= 20;
		
		System.out.println(x+y);
		
		//상수 선언
		// final 타입 변수명 = 값;
		// 상수는 일반적으로 대문잘 표시함. (변수와 구분)
		final double PI = 3.141592;
		//반지름 r=5인 원의 넓이
		//PI*r*r
		
		double area=PI*5*5;//실수값 출력
		
		System.out.println(area);
		// xx.xxxx으로 출력
		
		// 상수로 선언된 변수의 값은 초기화 후 변경시 오류발생
		//PI = 3.14;
		area = PI*5*5;
		
		System.out.println(area);
		// xx.x로 출력
		
	}

}
