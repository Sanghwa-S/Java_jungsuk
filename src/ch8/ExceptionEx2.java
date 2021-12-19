package ch8;

public class ExceptionEx2 {
	public static void main(String args[]) {
		int number = 100;
		int result = 0;
		
		for(int i =0; i < 10; i++) {
			result = number / (int)(Math.random() * 10);// 9번쨰 라인
			System.out.println(result);
		}
	}
	
}


//java.lang.ArithmeticExceptionㅁ은 산술 연산과정에서 오류가 있을 때 발생하는 예외이며, 정수는 0으로 나누는것이 금지되어있기 때문에 발생했다.