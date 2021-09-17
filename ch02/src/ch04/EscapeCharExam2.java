package ch04;

public class EscapeCharExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		"안녕하세요"
		저는 '용인'에서온     "길동"입니다.
		C:\temp\javaworkspace\hello.java
*/
		String message ="";
		message ="\"안녕하세요\"\n저는 \'용인\'에서온\t\"길동\"입니다.\nC:\\temp\\javaworkspace\\hello.java";
		System.out.println(message);
	}

}
