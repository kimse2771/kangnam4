package ch02_array;

public class ArrayExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		a=10;
		int scores[]= {10,15,1,3,5,4,8,6,9,5};
	
		int sum=0;
		
		for(int i=0;i<scores.length;i++) {
			sum=sum+scores[i];
		}

		
		
		double avg=sum/(double)scores.length;
		System.out.println(avg);
	}

}
