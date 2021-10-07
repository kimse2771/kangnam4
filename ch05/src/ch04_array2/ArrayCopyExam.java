package ch04_array2;

public class ArrayCopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldStrArray= {"java","array","copy"};
		String[] newStrArray= new String[5];
		
		//for(int i =0;i<oldStrArray.length;i++)
	//	{
			//newStrArray[i]=oldStrArray[i];
		//}
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);
		for(int i =0;i<newStrArray.length;i++)
		{
			System.out.println(newStrArray[i]);
		}
		
		System.out.println("\n-------------------");
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);
		for(int i =0;i<newStrArray.length;i++)
		{
			System.out.println(newStrArray[i]);
		}


		

	}

}
