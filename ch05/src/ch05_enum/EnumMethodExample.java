package ch05_enum;

import java.util.Scanner;

public class EnumMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Week today = Week.SUNDAY;
		
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int result1 = day1.compareTo(day2);//0-2
		int result2 = day2.compareTo(day1);//0-2
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() �޼ҵ� : String -> ����
		System.out.println("������ ���Ż�� �������� �Է����ּ���.");
		String strDay = scanner.next();
		Week weekDay = Week.valueOf(strDay);
		
		switch(weekDay.ordinal()) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:System.out.println("����");break;
		case 5:
		case 6:System.out.println("�ָ�");break;
			
		}
	/*	if(weekDay == Week.SATURDAY||weekDay == Week.SUNDAY)
		{
			System.out.println("�ָ�");
		}else
		{System.out.println("����");}*/
		
		
		//values()�޼ҵ�
		Week[] days = Week.values();
		
		for(int i=0;i<days.length;i++)
		{
			System.out.print(days[i]+" ");
		}
		
		System.out.println();
		
		for(Week d:days)
		{
			System.out.println(d);
		}
	}
	


}

