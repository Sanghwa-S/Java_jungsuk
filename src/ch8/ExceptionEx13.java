package ch8;

public class ExceptionEx13 {

	public static void main(String[] args) {
		method1();		//같은 클래스내의 static 멤버이므로 객체 생성없이 직접 호출가능 하다.
		
	}//main메서드의 끝
	
	static void method1() {
		try {
			throw new Exception();
		}catch (Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}		//method의 끝
}


// 예외가 발생한 메서드(method1)	내에서 처리되어지면, 호출한 메서드(main메서드)에서는 예외가 발생했따는 사실 조차 모르게 된다.