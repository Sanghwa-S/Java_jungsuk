package ch9;

public class CardToString2 {

	public static void main(String[] args) {
		Card_2 c1 = new Card_2();
		Card_2 c2 = new Card_2("HEART", 10);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}

class Card_2 {
	String kind;
	int number;
	
	Card_2(){
		this("SPADE",1);
	}
	
	Card_2(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
}