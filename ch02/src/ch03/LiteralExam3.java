package ch03;

public class LiteralExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1=12.;
		double d2 = 12.0;
		double d3= 0.1234;
		double d4 = 1234e-4;
		double d5 = 1234E-4;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		
		
		// �Ǽ����ͷ� f�� 32��Ʈ ����, �Ǽ����ͷ� d�� 2������ 64��Ʈ ����
		float f=0.1234f;
		double w = .1234d;
		
		//���Կ����� =�� ��������
		// ������ 32��Ʈ�� ������ �� �ִ� ��������,
		// �������� 64��Ʈ ���̸� ���� ���ͷ�
		// ����Ұ�
		//float f2 = .1234d;
		
		double w2 = 0.1234f;
		
		//�Ǽ�Ÿ���� ���ͷ��� ���ڰ� �ڿ� f��, d�� ǥ������ ������
		// default�� d(double)�� �ν���.
		//float f3 = .1234;//

	}

}
