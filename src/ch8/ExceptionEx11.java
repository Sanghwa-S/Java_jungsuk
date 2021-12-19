package ch8;

public class ExceptionEx11 {

	public static void main(String[] args) {
			throw new RuntimeException(); //RuntimeException을 고의로 발생시킨다.
	}

}
//예외처리를 하지 않았음에도 불구하고 컴파일 에러가 발생되지 않는다.
//
//컴파일러가 예외처리를 확인하지는 않는 RuntimeException 클래스들은 unchecked 예외 라고 부른다.

//예외러리를 확인하는 Exception클래스들은 checked 예외라고 부른다.