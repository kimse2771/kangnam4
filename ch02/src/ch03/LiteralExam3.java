package ch03;

public class LiteralExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1=12.;
		double d2 = 12.0;
		double d3= 0.1234;
		double d4 = 1234e-4;
		double d5 = 1234E-4;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		
		
		// 실수리터럴 f는 32비트 범위, 실수리터럴 d는 2배정도 64비트 범위
		float f=0.1234f;
		double w = .1234d;
		
		//대입연산자 =을 기준으로
		// 왼쪽은 32비트를 저정할 수 있는 범위공간,
		// 오른쪽은 64비트 길이를 가진 리터럴
		// 저장불가
		//float f2 = .1234d;
		
		double w2 = 0.1234f;
		
		//실수타입의 리터럴은 숫자값 뒤에 f나, d를 표시하지 않으면
		// default로 d(double)로 인식함.
		//float f3 = .1234;//

	}

}
