package stock;

import java.util.Scanner;

public class StockApplication {

	// 새우깡 객체 
	//
	private static Stock[] stockArray = new Stock[100];
	private static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		boolean run = true;
		//int cnt = 1;

		while(run)
		{
			System.out.println("--------------------------------------");
			 System.out.println("1.항목 추가  |2.입고 |3. 출고 |4. 종료");
			 System.out.println("--------------------------------------");
			 System.out.println("선택>");
			 
			 int selectNo = scanner.nextInt();
			 
			 switch(selectNo) {
			 case 1:
				 {    System.out.println("제품명, 수량을 입력해주세요.");
				 addStock(scanner.next(), scanner.nextInt()); break;}
			 case 2: 
				 {    System.out.println("제품명, 수량을 입력해주세요.");
					 addQty(scanner.next(), scanner.nextInt()); break;}
			 case 3:{ System.out.println("제품명, 수량을 입력해주세요."); 
				 subQty(scanner.next(), scanner.nextInt());break;}
			 case 4: run=false;  break;
			 }
		 }
		 System.out.println("프로그램 종료");

		}
	
	
	// 항목추가 함수
	
	private static void addStock(String name, int amount) {
		//수량 음수불가
		//기존 항목 
		// 일련번호
		
		
		//만들고서 확인을 하고 삭제
		//확인을 하고 만들기
		
		Stock stock = findItem(name); // 새우깡 찾는거
		
		stock = new Stock(name,amount);
		//새우깡 있으면 갯수를 추가하고, 없으면 이름을 확인해주세요
		if (stock != null) {
			System.out.println("결과: 중복입니다.");
		}else {

			stock.setQty(amount);//기존수량+새로추가하는양
            System.out.println("결과 : 추가되었습니다.");
		}	
		
	}
		
	//입고 함수 // 
	private static void addQty(String name, int amount) {
		//새우깡 수량 100개 추가
		
		Stock stock = findItem(name); // 새우깡 찾는거
		
		//새우깡 있으면 갯수를 추가하고, 없으면 이름을 확인해주세요
		if (stock != null) {
			stock.setQty(stock.getQty() + amount);//기존수량+새로추가하는양
            System.out.println("결과 : 수량이 추가되었습니다.");
		}else {
			System.out.println("결과: 과자이름을 확인해주세요.");
		}		
	}
	//출고 함수
	private static void subQty(String name, int amount) {
		Stock stock = findItem(name);//새우깡 이름 확인
		if (stock != null) {
			if (stock.getQty() - amount >= 0) {
				stock.setQty(stock.getQty() - amount);
				System.out.println("결과:출고가 성공되었습니다.");
			}else {
				System.out.println("결과:출고할 재고가 부족합니다. 현재 재고 : " +stock.getQty());
			}
		}else {//제품명이 없을떄 
			System.out.println("결과: 과자이름을 다시 확인해주세요.");
		} 
	}
		
	// 0번째 새우깡  1번째 감자깡 2번째 고구마깡 3번째에 감자칩
	// 찾고자하는게 고구마깡
	
	private static Stock findItem(String name) {
		Stock stock=null;//로컬변수
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

