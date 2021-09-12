package ch7;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv_PolyArgument());
		b.buy(new Computer_PolyArgument());
		
		System.out.println("현재 남은 돈은 " + b.money + " 만원 입니다.");
		System.out.println("현재 남은 보너스포인트는 " + b.bonusPoint + " 점입니다.");
	}

}

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
}

class Tv_PolyArgument extends Product {
	Tv_PolyArgument(){
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer_PolyArgument extends Product{
	Computer_PolyArgument(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < 0) {
			System.out.println("너 돈 없어 지금, 아무것도 못사");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + " 을 구입하셨습니다.");
	}
}
