package ch8;

public class ExceptionEx12 {

	public static void main(String[] args) throws Exception {
		method1();	//같은 클래스내의 static멤버이므로 객체생성없이 직접 호출가능.
		
	}
	
	static void method1() throws Exception {
		method2(); 
	}

	static void method2() throws Exception {
		throw new Exception();//예외가 여기서 강제적으로 발생됐지만, try catch 문으로 처리하지 않았기 때문에 종료되면서 자신을 호출한 method1()에게 예외를 보내준다.		
	}
}


//Exception in thread "main" java.lang.Exception
//at ch8.ExceptionEx12.method2(ExceptionEx12.java:15)
//at ch8.ExceptionEx12.method1(ExceptionEx12.java:11)
//at ch8.ExceptionEx12.main(ExceptionEx12.java:6)

//실행 결과 프로그램의 실행도중 java.lang.Exception이 발생하여 비정상적으로 종료했다는 것과 예외가 발생했을 때 호출스택(call back)의 내용을 알수 있다.

//예외가 여기서 강제적으로 발생됐지만, try catch 문으로 처리하지 않았기 때문에 종료되면서 자신을 호출한 method1()에게 예외를 보내준다.		
//method1()에도 try catch 가 없기때문에 main 한테 예외를 보내준다.
//하지만 main 에서도 try catch 처리가 없기떄문에 프로그램이 예외로 인해 비정상적으로 종료되는 것이다.

//결국 어느 한 곳에서는 반드시 try catch문으로 예외처리를 해주어야 한다.

