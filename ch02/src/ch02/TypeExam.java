package ch02;

public class TypeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� + ������ ���� ����� ������ ������� ��� 
		//=> ������ ���� Ÿ�԰� ������ ���� Ÿ���� ���� ����� ������ ���� Ÿ������ ���
		int x = 10;
		double y = 15.2;
		
		System.out.println(x+y);//���� x�� ����� �������� ����y�� ����� �Ǽ����� ���� ���
		// => 10->10.0(����->�Ǽ� : jvm���������� �ڵ�ó����), 10.0+15.2=>25.2
		
		// ���� + �Ǽ��� ���� ����� �Ǽ��� ������� ���
		//=> 5->5.0(����->�Ǽ� : jvm���������� �ڵ�ó����), 5.0+2.7=>7.7
		int x2 = 5;
		double y2=2.7;
		System.out.println(x2+y2);
		
	}

}
