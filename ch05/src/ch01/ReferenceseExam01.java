package ch01;

public class ReferenceseExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//리터럴로 문자열 생성
		String strA="홍길동";
		String strB="홍길동";
		if(strA==strB)System.out.println("같은 문자열 잠조");
		else System.out.println("다른 문자열 참조");
		
		
		//new String() 생성자로 문자열 생성 - 참조타입 특성 따름
		// 참조타입은 생성시 new클래스명();으로 생성
		String str1=new String("홍길동");
		String str2=new String("홍길동");
		if(str1==str2)System.out.println("같은 문자열 잠조");
		else System.out.println("다른 문자열 참조");
		
	}

}
