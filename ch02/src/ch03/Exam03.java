package ch03;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int weight =75;
		int height = 175;
		final double manA = 1.10;
		final double manB = 128;

		//체지방률% = 100 - 제지방률%
		//제지방률% = (제지방량kg * 100 ) / 체중kg 
		double temp = (manA*weight)-(manB*((weight*weight)/(double)(height*height)));//제지방량
		double result = 100-((temp*100)/weight);
		System.out.println(result);

	}

}
