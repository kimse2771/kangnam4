package ch01;

public class IncreaseDecreaaseOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 10;
		int z;

		System.out.println("----------------");
		x++;//후위연산
		System.out.println(x);
		++x;//전위연산
		System.out.println(x);
		System.out.println("----------------");
		y--;
		System.out.println(y);
		--y;
		System.out.println(y);
		System.out.println("----------------");

	}

}
