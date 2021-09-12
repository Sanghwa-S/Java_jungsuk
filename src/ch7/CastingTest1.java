package ch7;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.hydroPump();
		car = fe;		// car = (car)fe 형변환이 생략된 형태이다.
		//car.water();
		fe2 = (FireEngine)car;		// 자손타입 <- 조상타입
		fe2.water();
	}

}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("Let's drive~");
	}
	
	void stop() {
		System.out.println("Stop!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!");
	}
	
	void hydroPump() {
		System.out.println("Hydro pump!!!");
	}
}
