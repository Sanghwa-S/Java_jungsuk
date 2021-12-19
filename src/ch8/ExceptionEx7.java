package ch8;

public class ExceptionEx7 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException)
				System.out.println("ae 는 ArithmeticException 의 인스턴스가 맞습니다.");
			System.out.println("ArithmeticException이 발생하였으모 try 문을 종료 합니다.");
		}
		System.out.println(5);
	}
}
