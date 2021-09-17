package ch01;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean play = true;
		
		System.out.println(play);
		
		play = !play;//!true -> not true -> false
		System.out.println(play);

		play= !play;//!false -> not false -> true
		System.out.println(play);
		
		int i = 0;
		
		while(play) {
			i++;
			System.out.println("hello");
			if(i==5)play = !play;//반복문 나가는 조건
		}
		
		System.out.println("end");

	}

}
