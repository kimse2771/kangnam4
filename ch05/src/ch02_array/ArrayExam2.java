package ch02_array;

public class ArrayExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores=new int[10];
		scores[0]=10;
		scores[1]=15;
		scores[2]=5;
		scores[3]=7;
		scores[4]=8;
		scores[5]=3;
		scores[6]=9;
		scores[7]=10;
		scores[8]=5;
		scores[9]=4;
		
		int sum=0;
		
		for(int i=0;i<10;i++) {
			sum=sum+scores[i];
		}
		int cnt=10;
		
		
		double avg=sum/(double)cnt;
		System.out.println(avg);
	}

}
