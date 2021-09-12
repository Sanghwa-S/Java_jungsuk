package ch7;

class Tv_7_4{
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() {--channel; }
}

class VCR {
	boolean power;
	int counter = 0;
	void power() { power = !power; }
	void play() { }
	void stop() { }
	void rew() { }
	void ff() { }
}

class TVCR extends Tv_7_4{
	VCR vcr = new VCR();
	
	void play() {
		vcr.play();
	}
	void stop() {
		vcr.stop();
	}
	void rew() {
		vcr.rew();
	}
	void ff() {
		vcr.ff();
	}
}
/*
 * public class TVCR extends Tv {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * }
 */
