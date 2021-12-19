package ch8;

public class ExceptionEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			System.out.println("ArithmeticException 에러가 발생하였다. 여기서 try문을 나간다.");
		}
		System.out.println(6);
	}
}
