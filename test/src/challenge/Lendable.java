package challenge;

import java.util.ArrayList;
import java.util.Scanner;

import challenge.SeperateVolume;

public interface Lendable {

	int BORROWED = 1;
	int NORMAL = 0;

	void checkOut(String title, String name, String date);

	void checkIn(String title);

	void addBook();

	void drawList();

	public static final ArrayList<SeperateVolume> list = new ArrayList<SeperateVolume>();

}

class SeperateVolume implements Lendable {

	String requestNo;
	String title;
	String writer;
	int state;
	String name = "", date = "";

	public String getTitle() {
		return title;
	}
	public String getRequestNo() {
		return requestNo;
	}
	public String getWriter() {
		return writer;
	}
	public void setState(int state) {this.state = state;}
	public int getState() {return state;}

	public SeperateVolume(String requestNo, String title, String writer) {
		this.requestNo = requestNo;
		this.title = title;
		this.writer = writer;
	}

	public SeperateVolume() {
	}

	@Override
	public void checkOut(String title, String name, String date) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {

				if (list.get(i).getState() == BORROWED) {
					System.out.println("대출중인 책입니다.");
					return;
				}
				this.name = name;
				this.date = date;
				list.get(i).setState(BORROWED) ;
				System.out.println(title + "을 " + name + "가 대출했습니다.");
				System.out.println("대출일자 : " + date);
				return;
			}
		}System.out.println("도서 목록에 없습니다.");

	}

	@Override
	public void addBook() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("책번호, 제목, 저자를 입력하세요.");
		System.out.println("책번호>");
		requestNo = scanner.next();
		System.out.println("제목>");
		title = scanner.next();
		System.out.println("저자>");
		writer = scanner.next();

		list.add(new SeperateVolume(requestNo, title, writer));

	}

	@Override
	public void checkIn(String title) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				name = "";
				date = "";
				if(list.get(i).getState() == BORROWED) {
					list.get(i).setState(NORMAL) ;
					System.out.println(title + "을 반납했습니다.");
					return;

				}else {

					System.out.println(title + "의 대출기록이 없습니다.");
					return;
					
				}
			}
		}System.out.println("도서 목록에 없습니다.");
		

	}

	@Override
	public void drawList() {

		for (int i = 0; i < list.size(); i++) {
			System.out.println("책 번호 : " + list.get(i).getRequestNo() + " 책 제목 : " +list.get(i).getTitle() + " 저자 : " + list.get(i).getWriter());
		}
	}
}
