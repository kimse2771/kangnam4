package ch02;

public class ConditionOperatorExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=3;
		int b=3;
		
		//����?�� : ����
		System.out.println("�� ���� ���� " + ((a>b)?(a-b):(b-a)));

		//a�� ũ��, b�� ũ��, ���� =>  ���� ? �� : (����? ��: ����)
		System.out.println("�� ���� ���� " + ((a>b)?"a�� ũ��":(a<b) ? "b�� ũ��":"����"));

	}
}
