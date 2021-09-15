package ch7;

public class InterfaceTest2 {

	public static void main(String[] args) {
		A_2 a = new A_2();
		a.autoPlay(new B_2());
		a.autoPlay(new C_2());
	}

}

class A_2 {
	void autoPlay(I_2 i) {
		i.play();
	}
}

interface I_2 {
	public abstract void play();
}

class B_2 implements I_2 {
	public void play() {
		System.out.println("play in B class");
	}
}

class C_2 implements I_2 {
	public void play() {
		System.out.println("play in C class");
	}
}
