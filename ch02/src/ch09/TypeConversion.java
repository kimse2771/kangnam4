package ch09;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 127;
		int i = 100;

		System.out.println(b+i);//127+100 => 227 ���Ÿ����?int
		System.out.println(10/4);//����/����->����
		System.out.println(10.0/4);//�Ǽ�/����->�Ǽ�
		System.out.println((char)0x12340041);//A
		System.out.println((byte)(b+i));//�����÷ο�
		System.out.println((int)2.9 + 1.8);//2+1.8=> 3.8
		System.out.println((int)(2.9 + 1.8));//2.9+1.8 ->4.7 -> 4
		System.out.println((int)2.9 + (int)1.8);// 2+1 = 3

		
	}

}
