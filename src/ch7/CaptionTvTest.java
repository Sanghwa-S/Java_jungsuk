package ch7;

class Tv {
	boolean power;		//전원상태 (on/off)
	int channel;		//채널
	
	void power() { power = !power; }
	void chnnelUp() { ++channel; }
	void channelDown() { --channel; }
}

class CaptionTv extends Tv{
	boolean caption;		// 캡션상태 (on/off)
	void displayCaption(String text) {
		if(caption) {		// 캡션 상태가 on(true) 일 경우만 text를 보여준다.
			System.out.println(text);
		}
	}
}
public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.chnnelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello world 1");
		ctv.caption = true;		// 캡션(자막)을 킨다.
		ctv.displayCaption("Hello world 2");		
		
	}

}
