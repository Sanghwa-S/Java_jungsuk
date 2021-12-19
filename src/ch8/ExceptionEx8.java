package ch8;

public class ExceptionEx8 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외 메세지: " + ae.getMessage());
		}
		System.out.println(5);
	}
}


//ArithmeticException 인스턴스 ae의 printStackTrace()를 사용해서, 호출 스텍(call back)에 대한 정보와 예외 메세지를 출력하였다.