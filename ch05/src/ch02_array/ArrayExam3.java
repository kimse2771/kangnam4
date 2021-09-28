package ch02_array;

public class ArrayExam3 {

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
		
		System.out.println(scores.length);
		int sum=0;
		
		for(int i=0;i<scores.length;i++) {
			sum=sum+scores[i];
		}

		
		
		double avg=sum/(double)scores.length;
		System.out.println(avg);
	}

}
