package ch6;

class Tv_2 {
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

public class TvTest2 {

	public static void main(String[] args) {
		Tv_2 t1 = new Tv_2();
		Tv_2 t2 = new Tv_2();
		System.out.println("t1의 채널값은 " + t1.channel + " 입니다");
		System.out.println("t2의 채널값은 " + t2.channel + " 입니다");
		
		t1.channel = 7;
		System.out.println("t1의 channel  값을 7 으로 변경 하였습니다.");
		
		System.out.println("t1의 channel 값은 " + t1.channel + " 입니다.");
		System.out.println("t2의 channel 값은 " + t2.channel + " 입니다.");
	}

}
