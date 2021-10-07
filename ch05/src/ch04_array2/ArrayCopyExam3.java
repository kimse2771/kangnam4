package ch04_array2;

public class ArrayCopyExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray= {"java","array","copy"};
		String[] newStrArray= new String[5];
		
		//for(int i =0;i<oldStrArray.length;i++)
	//	{
			//newStrArray[i]=oldStrArray[i];
		//}
		//arraycopy(소스, 소시의 시작인덱스, 타겟, 타겟의 시작 인덱스, 복사할 길이)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);
		for(int i =0;i<newStrArray.length;i++)
		{
			System.out.println(newStrArray[i]);
		}
		
		System.out.println("\n-------------------");
		System.arraycopy(oldStrArray, 1, newStrArray,3 , oldStrArray.length-1);
		for(int i =0;i<newStrArray.length;i++)
		{
			System.out.println(newStrArray[i]);
		}
		
		int srcPos=1;
		int num = oldStrArray.length-srcPos;
		System.arraycopy(oldStrArray, 1, newStrArray,3 , oldStrArray.length-1);
		
		


		

	}

}
