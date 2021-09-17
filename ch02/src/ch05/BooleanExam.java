package ch05;

public class BooleanExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		boolean c = 10>0;
		
		// 대입 연산자 - 을 기준으로 왼쪽은 boolean, 오른쪽은 int 형변환 불가
		 //boolean d = 1;
		
		//boolean타입의 리터럴은 반복문의 종료 조건에 사용됨
		int i = 1;
		while(b) {
			System.out.println(i);
			System.out.println("hello");
			i++;
			if(i==10)b=false;
		}
		System.out.println("종료");
		
		if(b) {
			System.out.println("hello");
		}
	}

}
