package ch02_array;

public class ArrayExam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] arrB=new byte[5];
		for(int i=0;i<arrB.length;i++) {
			System.out.print(10+arrB[i]+"\t");
		}
		
		char[] charA=new char[5];
		for(int i=0;i<charA.length;i++) {
			System.out.print(charA[i]+"\t");
		}
		
		short[] shortA=new short[5];
		for(int i=0;i<shortA.length;i++) {
			System.out.print(shortA[i]+"\t");
		}
		
		int[] intA=new int[5];
		for(int i=0;i<intA.length;i++) {
			System.out.print(10+intA[i]+"\t");
		}
		
		long[] longA=new long[5];
		System.out.println("실수배열");
		for(int i=0;i<longA.length;i++) {
			System.out.print(longA[i]+"\t");
		}
		
		double[] doubleA=new double[5];
		for(int i=0;i<doubleA.length;i++) {
			System.out.print(10+doubleA[i]+"\t");
		}
		
		
		String[] stringA=new String[5];
		System.out.println("참조배열");
		stringA[0]="a";
		stringA[1]="a";
		stringA[2]="a";
		stringA[3]="a";
		stringA[4]="a";
		for(int i=0;i<stringA.length;i++) {
			System.out.print(10+stringA[i]+"\t");
		}
		
		
		
		
		
	}

}
