package ch09;

public class ByteOverflowExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//byte의 표현 범위는-128~127 사이를 사이클링함.
		for(int i = -128;i<229;i++)
		{
			System.out.println((byte)i);
		}
	}

}
