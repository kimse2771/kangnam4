package ch02;

public class IncreaseExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -1;
		
		//여기서는 현재의 x값을 연산에 사용하고 싶다.
		if((5/x++)==5) {
			System.out.println("true");
			}else
			{System.out.println("false");}
		System.out.println(x);

	}

}
