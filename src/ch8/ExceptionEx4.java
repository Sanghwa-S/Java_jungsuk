package ch8;

public class ExceptionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
	}

}

//try 블럭 내에서 예외가 발생한 경우.
//1. 발생한 예외와 일치하는 catch 블럭 있는지 확인한다.
//일치하는 catch블럭을 찾게 되면, 그 catch 블럭 내의 문장들을 수행하고 전체 try catch 문을 빠져나가서 그 다음 문장을 계속해서 수행한다. 만일 이치하는 catch 블럭을 찾지 못하면, 예외는 처리되지 못한다.

//try 블럭내에서 예외가 발생하지 않는 경우.
//catch 블럭을 거치지 않고 전체 try catch 문을 빠져나가서 수행을 계속한다.