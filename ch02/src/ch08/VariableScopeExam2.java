package ch08;

public class VariableScopeExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main �޼ҵ� �������� ����� ���ú���
		int var1;
		
		if(true) {
			//main�޼ҵ峻�� if������ ����� ���ú���
			int var2;
			var1= 1;//main�޼ҵ� ���� if �������� ��밡��.
			var2= 2;// �ڽ��� ����� �������� ��밡��
			
			int result = var1+var2;
			System.out.println(result);
			
		}
		
		while(true){
			//main �޼ҵ峻�� while������ ����� ���ú���
			int var3;
			int var2;
			var1= 1;
			//int var1; ���� ������ �������� ����� ������ ���� ���� ������ ����� �ߺ����� ���� �߻�

			
			break;
		}

		//System.out.println(var1);
		//System.out.println(var2);
		//System.out.println(var3);
	}

}
