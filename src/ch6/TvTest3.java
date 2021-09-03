package ch6;

class Tv_3 {
	//properties of Tv
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}


public class TvTest3 {

	public static void main(String[] args) {
		Tv_3 t1 = new Tv_3();
		Tv_3 t2 = new Tv_3();
		System.out.println("t1의 channel 값은 " + t1.channel + " 입니다.");
		System.out.println("t2의 channel 값은 " + t2.channel + " 입니다.");
		
		t2 = t1;		// t1이 저장하고 있는 값(주소) 을 t2에 저장한다.
		t1.channel = 7;
		System.out.println("t1의 channel 값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel 값은" + t1.channel + " 입니다.");
		System.out.println("t2의 channel 값은" + t2.channel + " 입니다.");
	}

}
