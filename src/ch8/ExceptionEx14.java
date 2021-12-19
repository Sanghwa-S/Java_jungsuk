package ch8;

public class ExceptionEx14 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main메서드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}
		

	static void method1() throws Exception {
		throw new Exception();
	}//method1() 의 끝

}//class의 끝



//예외가 발생한 메서드에서 예외를 처리핮 ㅣ않고 호출한 메서드로 넘겨 주면 호출한 메서드에서는 method()을 호출한 라인에서 예외가 발생한 것으로 간주되어 이에 대한 처리를 하게 된다.