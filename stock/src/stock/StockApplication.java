package stock;

import java.util.Scanner;

public class StockApplication {

	// ����� ��ü 
	//
	private static Stock[] stockArray = new Stock[100];
	private static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		boolean run = true;
		//int cnt = 1;

		while(run)
		{
			System.out.println("--------------------------------------");
			 System.out.println("1.�׸� �߰�  |2.�԰� |3. ��� |4. ����");
			 System.out.println("--------------------------------------");
			 System.out.println("����>");
			 
			 int selectNo = scanner.nextInt();
			 
			 switch(selectNo) {
			 case 1:
				 {    System.out.println("��ǰ��, ������ �Է����ּ���.");
				 addStock(scanner.next(), scanner.nextInt()); break;}
			 case 2: 
				 {    System.out.println("��ǰ��, ������ �Է����ּ���.");
					 addQty(scanner.next(), scanner.nextInt()); break;}
			 case 3:{ System.out.println("��ǰ��, ������ �Է����ּ���."); 
				 subQty(scanner.next(), scanner.nextInt());break;}
			 case 4: run=false;  break;
			 }
		 }
		 System.out.println("���α׷� ����");

		}
	
	
	// �׸��߰� �Լ�
	
	private static void addStock(String name, int amount) {
		//���� �����Ұ�
		//���� �׸� 
		// �Ϸù�ȣ
		
		
		//����� Ȯ���� �ϰ� ����
		//Ȯ���� �ϰ� �����
		
		Stock stock = findItem(name); // ����� ã�°�
		
		stock = new Stock(name,amount);
		//����� ������ ������ �߰��ϰ�, ������ �̸��� Ȯ�����ּ���
		if (stock != null) {
			System.out.println("���: �ߺ��Դϴ�.");
		}else {

			stock.setQty(amount);//��������+�����߰��ϴ¾�
            System.out.println("��� : �߰��Ǿ����ϴ�.");
		}	
		
	}
		
	//�԰� �Լ� // 
	private static void addQty(String name, int amount) {
		//����� ���� 100�� �߰�
		
		Stock stock = findItem(name); // ����� ã�°�
		
		//����� ������ ������ �߰��ϰ�, ������ �̸��� Ȯ�����ּ���
		if (stock != null) {
			stock.setQty(stock.getQty() + amount);//��������+�����߰��ϴ¾�
            System.out.println("��� : ������ �߰��Ǿ����ϴ�.");
		}else {
			System.out.println("���: �����̸��� Ȯ�����ּ���.");
		}		
	}
	//��� �Լ�
	private static void subQty(String name, int amount) {
		Stock stock = findItem(name);//����� �̸� Ȯ��
		if (stock != null) {
			if (stock.getQty() - amount >= 0) {
				stock.setQty(stock.getQty() - amount);
				System.out.println("���:��� �����Ǿ����ϴ�.");
			}else {
				System.out.println("���:����� ��� �����մϴ�. ���� ��� : " +stock.getQty());
			}
		}else {//��ǰ���� ������ 
			System.out.println("���: �����̸��� �ٽ� Ȯ�����ּ���.");
		} 
	}
		
	// 0��° �����  1��° ���ڱ� 2��° ������ 3��°�� ����Ĩ
	// ã�����ϴ°� ������
	
	private static Stock findItem(String name) {
		Stock stock=null;//���ú���
		for(int i=0;i<stockArray.length;i++) {
			  stock =stockArray[i];
			if(stock!=null) {  
			  if(stock.getName().equals(name))
				break;
			}
		}
		return stock;
	
		
}

}

