package ch04_array2;

public class Work01 {
	/*���� ������� 10/4��(��) 23:59�� ����
	/* vctor@naver.com
	 * ���� ������� 10/4��(��) 23:59�� ����
	 * ��ĳ�ʷ� �Է°� �Է¹ޱ� ����, ����, Ű, ������
	 * �ݺ�ó�� �����ϰ� ����� 
	 * ��� ���� ����� yes/no���� �޾Ƽ� �����ϵ��� �����ϱ�.
	 *  https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=kmovie97&logNo=150186681215
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����淮 ���ϱ�
		final double ST1 = 1.10;
		final double ST2 = 128;
		int weight = 75;
		int height = 175;
		//�����淮
		double result = ST1 * weight - ST2 * 
				        ((weight * weight) /(double)(height * height)); 
		System.out.println(result);
		// ü���淮 ���ϱ�
		double result2 = weight - result;
		System.out.println(result2);
		// ü����� ���ϱ� = ü���淮*100/ü��
		final double ST3 = 100;
		double result3 = result2 * ST3 / weight;
		System.out.println(result3);

	}

}
