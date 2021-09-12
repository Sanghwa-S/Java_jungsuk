package ch7;

import java.util.*;//vector 클래스를 사용하기 위해서 추가해 주었다.

class Prodcut_PolyArgumentTest3{
	int price;
	int bonusPoint;
	
	Prodcut_PolyArgumentTest3(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
	Prodcut_PolyArgumentTest3(){
		this.price = 0;
		this.bonusPoint = 0;
	}
}

class Tv_PolyArgumentTest3 extends Prodcut_PolyArgumentTest3{
	Tv_PolyArgumentTest3(){
		super(100);
	}
	
	public String toString() {return "TV";}
}

class Computer_PolyArgumentTest3 extends Prodcut_PolyArgumentTest3{
	Computer_PolyArgumentTest3(){
		super(200);
	}
	
	public String toString() {return "Computer";}
}

class Audio_PolyArgumentTest3 extends Prodcut_PolyArgumentTest3{
	Audio_PolyArgumentTest3(){
		super(300);
	}
	
	public String toString() {return "Audio";}
}

class Buyer_PolyArgumentTest3{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector(); // 구입한 제품을 저장하는데 사용될 Vector 객체
	int i = 0;
	
	void buy_PolyArgumentTest3(Prodcut_PolyArgumentTest3 p) {
		if(money < p.price) {
			System.out.println("돈이 부족해서 물건 못사요~");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "을 구입 하셨습니다.");	
	}
	
	void refund(Prodcut_PolyArgumentTest3 p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품 하셨습니다.");
		}
		else
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
	}
	
	void summary_PolyArgumentTest3() {
		int sum = 0;
		String itemList ="";
		
		if(item.isEmpty()) {		//Vector가 비어있는지 확인합니다.
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i =0; i < item.size(); i++) {
			Prodcut_PolyArgumentTest3 p = (Prodcut_PolyArgumentTest3)item.get(i); //vector 의 첫번째 있는 객체를 가지고 온다.
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p; 
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + " 입니다.");
		System.out.println("구입하신 물품은 " + itemList + " 입니다.");
	}
}
public class PolyArgumentTest3 {

	public static void main(String[] args) {
		Buyer_PolyArgumentTest3 b = new Buyer_PolyArgumentTest3();
		Tv_PolyArgumentTest3 t = new Tv_PolyArgumentTest3();
		Computer_PolyArgumentTest3 c = new Computer_PolyArgumentTest3();
		Audio_PolyArgumentTest3 a = new Audio_PolyArgumentTest3();
		
		b.buy_PolyArgumentTest3(t);
		b.buy_PolyArgumentTest3(c);
		b.buy_PolyArgumentTest3(a);
		b.summary_PolyArgumentTest3();
		System.out.println();
		System.out.println();
		b.refund(a);
		b.summary_PolyArgumentTest3();
		b.refund(c);
		b.summary_PolyArgumentTest3();
		b.refund(t);
		b.summary_PolyArgumentTest3();
	}

}
