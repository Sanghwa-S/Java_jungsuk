package ch8;

public class ExceptionEx6 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(Exception e) {
			System.out.println("예외가 발생하여서 여기서 try 문을 빠져나온다.");
		}
		
		System.out.println(5);
	}

}
