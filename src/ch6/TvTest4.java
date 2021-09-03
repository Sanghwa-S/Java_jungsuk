package ch6;

class Tv_4{
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

public class TvTest4 {

	public static void main(String[] args) {
		Tv_4[] tvArr = new Tv_4[3]; // 길이가 3인 Tv 객체 배열
		
		// Tv객체를 생성해서 Tv 객체 배열의 각 요소에 저장.
		for(int i=0; i < tvArr.length; i++) {
			tvArr[i] = new Tv_4();
			tvArr[i].channel = i + 10;
		}
		
		for(int i=0; i < tvArr.length; i++) {
			tvArr[i].channelUp(); // tvArr[i]의 메서드를 호출. 채널 1이 증가.
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
	} 

}
