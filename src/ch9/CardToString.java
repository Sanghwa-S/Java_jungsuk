package ch9;

public class CardToString {
	
	public static void main(String args[]) {
		
		Card_1 c1 = new Card_1();
		Card_1 c2 = new Card_1();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
	}
}

class Card_1 {
	String kind;
	int number;
	
	Card_1(){
		this("SPADE", 1);
	}
	Card_1(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
}