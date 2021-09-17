package ch09;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 127;
		int i = 100;

		System.out.println(b+i);//127+100 => 227 결과타입은?int
		System.out.println(10/4);//정수/정수->정수
		System.out.println(10.0/4);//실수/정수->실수
		System.out.println((char)0x12340041);//A
		System.out.println((byte)(b+i));//오버플로우
		System.out.println((int)2.9 + 1.8);//2+1.8=> 3.8
		System.out.println((int)(2.9 + 1.8));//2.9+1.8 ->4.7 -> 4
		System.out.println((int)2.9 + (int)1.8);// 2+1 = 3

		
	}

}
