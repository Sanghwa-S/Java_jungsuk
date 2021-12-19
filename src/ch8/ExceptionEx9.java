package ch8;

public class ExceptionEx9 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시켰음.");
			throw e;
//			throw new Exception("고의로 발생시켰음.");
			
		}catch (Exception e) {
		System.out.println("에러 메세지: " + e.getMessage());
		e.printStackTrace();
		}
	}

}

//키워드 throw 를 ㅁ사용해서 프로그래머가 고의로 예외를 발생시킬수 있다.

//1.먼저, 연산자 new 를 이용해서 발생시키려는 예오 ㅣ클래스의 객체를 만든 다음
//	Exception e = new Exception("고의로 발생 시켰음.")

//2.키워드 throw 를 이용해서 예외를 발생시킨다.
//	throw e;