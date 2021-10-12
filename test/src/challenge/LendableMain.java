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
			 System.out.println("1.도서 등록 |2. 도서 목록 |3. 도서 대여 |4. 도서 반납|5. 종료");
			 System.out.println("--------------------------------------");
			 System.out.println("선택>");
			 
			 int selectNo = scanner.nextInt();
			 
			 switch(selectNo) {
			 case 1: sv.addBook(); break;
				
			 case 2: sv.drawList();break;
				
			 case 3:
				 System.out.println("책이름 :");
				 String title = scanner.next();
				 System.out.println("이름 : ");
				 String name = scanner.next();
				 System.out.println("날짜 : ");
				 String date = scanner.next();

				 sv.checkOut(title,name,date);
				 break;
				
			 case 4: System.out.println("책이름 : ");
			 	 title = scanner.next();
				 sv.checkIn(title);  break;
			 case 5: run=false;  break;
			 }
		 }
		 System.out.println("프로그램 종료");

		}
	}


