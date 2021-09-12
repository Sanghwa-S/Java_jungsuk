package ch7;

final class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton() {
		//...
	}
	
	public static Singleton getInstance() {
		if(s == null)
			s = new Singleton();
		
		return s;
	}
}

public class SingletonTest {

	public static void main(String[] args) {
		//Singleton s = new Singleton(); //에러 난다. Singleton(); 는 private access 를 가지고 있어서 안된다.
		Singleton s = Singleton.getInstance();
	}

}
