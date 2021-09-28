package ch01;

// 참조 변수 선언 시 선언만하고 객체 생성을 하지 않으면
// NullPointerException예외가 발생
public class NullPointExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = null;//객체 참조 변수 선언만 하고 실제객체는 생성하지 않음
		//intArray=new int[10];//배열객체 생성
		intArray[0]=10;//프로그램 실행 중 예외발생-runtime Exception
		
		String str = null;//객체 참조 변수 선언만 하고 실제 객체는 생성하지 않음
		//str="hello";//"hello"문자열 객체생성
		System.out.println("총 문자수:"+str.length());//프로그램 실행 중 예외발생-runtime Exception
		

	}

}
