package ch04_array2;
//2행 3열
//1,2
//4,5,6 가능한가?
public class Array2Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] scores=new int[][] {{1,2},{4,5,6}};
		
		
		
		//2차원에서 length의 값은 1차원 배열의 갯수 의미
		System.out.println(scores.length);//2

		System.out.println("각 1차원 배열의 요소의 수:" + scores[0].length);//2
		System.out.println("각 1차원 배열의 요소의 수:" + scores[1].length);//3
		
		for(int i=0;i<scores.length;i++)
		{
			for(int j=0;j<scores[i].length;j++)
			{
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
		}
		//향상된 for문을 이용하여 2차원 배열의 요소들을 모두 출력하세요.
		//int->int[]->int[][]
		for(int[]s1:scores) {
			for(int s:s1)
			{
				System.out.println(s);
			}
		}
		
	}

}
