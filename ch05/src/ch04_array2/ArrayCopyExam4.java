package ch04_array2;

import java.util.Arrays;

public class ArrayCopyExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray= {"java","array","copy"};
		String[] newStrArray= new String[5];
		
		String[] arr2= Arrays.copyOf(oldStrArray,oldStrArray.length);
		
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
		
		
		System.out.println();
		arr2[0]="hi";
		
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
		System.out.println();
		for(int i=0;i<oldStrArray.length;i++)
			System.out.print(oldStrArray[i]+" ");

		Arrays.
	}

}
