package stock;

public class Stock {
	
	private String item; // �Ϸù�ȣ
	private String name; // ��ǰ��
	private int qty; // ��ǰ����
	int cnt = 1;
	private String item_num ="111-"+cnt;
	public Stock(String name, int qty)
	{
		this.item =  item_num;
		cnt++;
		this.name = name;
		this.qty = qty;
	}

	public String getItem() {return item;}
	public void setItem(String item) {this.item = item;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getQty() {return qty;}
	public void setQty(int qty) {this.qty = qty;}
	
}

