package ch7;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car();
		//Car car = new FireEngine(); 이렇게 하면 컴파일과 실행시 에러가 없다.
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;// 조상 인스턴스를 리모콘인 자손 참조변수 fe로 실행시 컴파일은 되지만, 실행시 에러가 뜬다.
		fe.drive();// 조상 인스턴스를 리모콘인 자손 참조변수 fe로 실행시 컴파일은 되지만, 실행시 에러가 뜬다.
		car2 = (Car)fe;
		car2.drive();

		
	}

}
