package challenge;

import java.util.ArrayList;
import java.util.Scanner;



public class LendableMain {
	static Scanner scanner = new Scanner(System.in);
	//private static SeperateVolume[] svArray = new SeperateVolume[100];
	//ArrayList<SeperateVolume> list;
	private static int idx;
	public static void main(String[] args) {
		SeperateVolume sv = new SeperateVolume();

		boolean run = true;
		
		while(run)
		{
			System.out.println("--------------------------------------");
			 System.out.println("1.���� ��� |2. ���� ��� |3. ���� �뿩 |4. ���� �ݳ�|5. ����");
			 System.out.println("--------------------------------------");
			 System.out.println("����>");
			 
			 int selectNo = scanner.nextInt();
			 
			 switch(selectNo) {
			 case 1: sv.addBook(); break;
				
			 case 2: sv.drawList();break;
				
			 case 3:
				 System.out.println("å�̸� :");
				 String title = scanner.next();
				 System.out.println("�̸� : ");
				 String name = scanner.next();
				 System.out.println("��¥ : ");
				 String date = scanner.next();

				 sv.checkOut(title,name,date);
				 break;
				
			 case 4: System.out.println("å�̸� : ");
			 	 title = scanner.next();
				 sv.checkIn(title);  break;
			 case 5: run=false;  break;
			 }
		 }
		 System.out.println("���α׷� ����");

		}
	}


