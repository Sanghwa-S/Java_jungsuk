package ch7;

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyer_PolyArgumentTest2 b = new Buyer_PolyArgumentTest2();
		
		b.buy_PolyArgumentTest2(new Tv_PolyArgumentTest2());
		b.buy_PolyArgumentTest2(new Computer_PolyArgumentTest2());
		b.buy_PolyArgumentTest2(new Audio_PolyArgumentTest2());
		b.summary();
	}

}

class Product_PolyArgumentTest2{
	int price;
	int bonusPoint;
	
	Product_PolyArgumentTest2(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
	
	
}

class Tv_PolyArgumentTest2 extends Product_PolyArgumentTest2{
	Tv_PolyArgumentTest2(){
		super(100);
	}
	
	public String toString() {
		return "TV";
	}
}

class Computer_PolyArgumentTest2 extends Product_PolyArgumentTest2{
	Computer_PolyArgumentTest2(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio_PolyArgumentTest2 extends Product_PolyArgumentTest2{
	Audio_PolyArgumentTest2(){
		super(300);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer_PolyArgumentTest2{
	int money = 1000;
	int bonusPoint = 0;
	Product_PolyArgumentTest2[] item = new Product_PolyArgumentTest2[10];
	int i = 0;
	
	void buy_PolyArgumentTest2(Product_PolyArgumentTest2 p) {
		if(money < p.price) {
			System.out.println("너 가지고 있는 돈이 없어서, 아무것도 못사!!!! 이 거지 새끼야!!!!!");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + " 을 구입 하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		//반복문을 이용해 구입한 물품의 총 가격과 목록을 만든다.
		for(int i = 0; i < item.length; i++) {
			if(item[i]==null)
				break;
			
			sum += item[i].price;
			itemList += item[i].toString() + "";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + " 입니다.");
		System.out.println("구입하신 제품은 " + itemList + " 입니다.");
	}
	
}