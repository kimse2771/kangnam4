package ch02;

public class ConditionOperatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
		int y= 3;
		
		int s;
		//���ǹ��� �̿��� ó��
		if(x>y)s=1;
		else s=-1;
		
		System.out.println(s);
		
		//���׽��� �̿��� ó��
		s=x>y?3:6;
		System.out.println(s);
	}

}
