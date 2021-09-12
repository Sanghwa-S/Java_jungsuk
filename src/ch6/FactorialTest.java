package ch6;

public class FactorialTest {

	public static void main(String[] args) {
		int result = factorial(4);	//factorial 메서드는 static 메서드이므로 인스턴스를 생성하지 않고 직접 호출 가능하다.
		System.out.println(result);
	}
	
	static int factorial(int n) {	
		int result = 0;
		
		if ( n ==1 )
			result = 1;
		else
			result = n * factorial(n-1);	//다시 메서드 자신을 호출한다.
		
		return result;
	}

}
