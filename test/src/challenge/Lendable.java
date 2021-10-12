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
					System.out.println("�������� å�Դϴ�.");
					return;
				}
				this.name = name;
				this.date = date;
				list.get(i).setState(BORROWED) ;
				System.out.println(title + "�� " + name + "�� �����߽��ϴ�.");
				System.out.println("�������� : " + date);
				return;
			}
		}System.out.println("���� ��Ͽ� �����ϴ�.");

	}

	@Override
	public void addBook() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("å��ȣ, ����, ���ڸ� �Է��ϼ���.");
		System.out.println("å��ȣ>");
		requestNo = scanner.next();
		System.out.println("����>");
		title = scanner.next();
		System.out.println("����>");
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
					System.out.println(title + "�� �ݳ��߽��ϴ�.");
					return;

				}else {

					System.out.println(title + "�� �������� �����ϴ�.");
					return;
					
				}
			}
		}System.out.println("���� ��Ͽ� �����ϴ�.");
		

	}

	@Override
	public void drawList() {

		for (int i = 0; i < list.size(); i++) {
			System.out.println("å ��ȣ : " + list.get(i).getRequestNo() + " å ���� : " +list.get(i).getTitle() + " ���� : " + list.get(i).getWriter());
		}
	}
}
