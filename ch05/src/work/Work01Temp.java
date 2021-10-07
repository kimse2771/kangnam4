package work;

public class Work01Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=10;
		System.out.println(a==b?"a와 b가 같습니다":"a와 b가 다릅니다");
		System.out.println(a!=b?"a와 b가 다릅니다":"a와 b가 같습니다");
		
		
		String str1=new String("hello");
		String str2=new String("hello");
		
		System.out.println(str1==str2?"str1의 주소와 str2의 주소가 같습니다.":"str1의 주소와 str2의 주소가 다릅니다");
		System.out.println(str1.equals(str2)?"str1와 str2가 같습니다.":"str1와 str2가 다릅니다");

	}

}
