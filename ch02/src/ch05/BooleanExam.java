package ch05;

public class BooleanExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		boolean c = 10>0;
		
		// ���� ������ - �� �������� ������ boolean, �������� int ����ȯ �Ұ�
		 //boolean d = 1;
		
		//booleanŸ���� ���ͷ��� �ݺ����� ���� ���ǿ� ����
		int i = 1;
		while(b) {
			System.out.println(i);
			System.out.println("hello");
			i++;
			if(i==10)b=false;
		}
		System.out.println("����");
		
		if(b) {
			System.out.println("hello");
		}
	}

}
