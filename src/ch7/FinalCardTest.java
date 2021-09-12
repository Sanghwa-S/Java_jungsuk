package ch7;

class Card_2{
	final int NUMBER;		//상수지만 선언관 함께 초기화 하지 않고
	final String KIND;			//생성자에서 단 한번만 초기화할 수 있다.
	static int width = 100;
	static int height = 250;
	
	Card_2(){
		this("SPARE", 1);
	}
	
	Card_2(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class FinalCardTest {

	public static void main(String[] args) {
		Card_2 c = new Card_2("HEART", 10);
//		c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); 		//원래는 sysout(c.toString()); 이다.
	}

}
