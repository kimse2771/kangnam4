package ch04_array2;
//2�� 3��
//1,2
//4,5,6 �����Ѱ�?
public class Array2Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] scores=new int[][] {{1,2},{4,5,6}};
		
		
		
		//2�������� length�� ���� 1���� �迭�� ���� �ǹ�
		System.out.println(scores.length);//2

		System.out.println("�� 1���� �迭�� ����� ��:" + scores[0].length);//2
		System.out.println("�� 1���� �迭�� ����� ��:" + scores[1].length);//3
		
		for(int i=0;i<scores.length;i++)
		{
			for(int j=0;j<scores[i].length;j++)
			{
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
		}
		//���� for���� �̿��Ͽ� 2���� �迭�� ��ҵ��� ��� ����ϼ���.
		//int->int[]->int[][]
		for(int[]s1:scores) {
			for(int s:s1)
			{
				System.out.println(s);
			}
		}
		
	}

}
