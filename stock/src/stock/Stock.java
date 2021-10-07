package stock;

public class Stock {
	
	private String item; // 일련번호
	private String name; // 제품명
	private int qty; // 제품수량
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

