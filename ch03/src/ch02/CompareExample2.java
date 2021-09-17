package ch02;

public class CompareExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 25;
		
		//자바에서 사용불가
		//if(20<=age<300) {} 범위를 구할땐 이렇게 하면 안됌.
		if((age>=20)&&(age<30))
		{
			System.out.println("20대");
		}
		char c ='x';
		
		if((c>='A')&&(c<='Z')) {
			System.out.println("영문대문자");}
		
		int x= 50;
		int y= 25;
		if((x>=0)&&(y>=0)&&(x<=50)&&y<=50);
		{
			System.out.println("영역내에 있는 좌표");
		}
		
		
				

	}

}
