package ch01;

public class ReferenceseExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ͷ��� ���ڿ� ����
		String strA="ȫ�浿";
		String strB="ȫ�浿";
		if(strA==strB)System.out.println("���� ���ڿ� ����");
		else System.out.println("�ٸ� ���ڿ� ����");
		
		
		//new String() �����ڷ� ���ڿ� ���� - ����Ÿ�� Ư�� ����
		// ����Ÿ���� ������ newŬ������();���� ����
		String str1=new String("ȫ�浿");
		String str2=new String("ȫ�浿");
		if(str1==str2)System.out.println("���� ���ڿ� ����");
		else System.out.println("�ٸ� ���ڿ� ����");
		
	}

}
