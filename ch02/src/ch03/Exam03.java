package ch03;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int weight =75;
		int height = 175;
		final double manA = 1.10;
		final double manB = 128;

		//ü�����% = 100 - �������%
		//�������% = (�����淮kg * 100 ) / ü��kg 
		double temp = (manA*weight)-(manB*((weight*weight)/(double)(height*height)));//�����淮
		double result = 100-((temp*100)/weight);
		System.out.println(result);

	}

}
