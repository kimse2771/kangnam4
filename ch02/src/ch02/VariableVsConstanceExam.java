package ch02;

public class VariableVsConstanceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y;

		y =20;
		x= 20;
		
		System.out.println(x+y);
		
		//��� ����
		// final Ÿ�� ������ = ��;
		// ����� �Ϲ������� �빮�� ǥ����. (������ ����)
		final double PI = 3.141592;
		//������ r=5�� ���� ����
		//PI*r*r
		
		double area=PI*5*5;//�Ǽ��� ���
		
		System.out.println(area);
		// xx.xxxx���� ���
		
		// ����� ����� ������ ���� �ʱ�ȭ �� ����� �����߻�
		//PI = 3.14;
		area = PI*5*5;
		
		System.out.println(area);
		// xx.x�� ���
		
	}

}
