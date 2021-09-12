package ch6;

class Data { int x; }

public class PrimitiveParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x =" + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x) {	// 기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}

//
//main() : x =10
//change() : x = 1000
//After change(d.x)
//main() : x = 10

// x 의 값이 변하지 않았다 이유는 기본형 매개변수는 변수에 저장된 값만 읽을 수만 있을 뿐 변경할수 없기 때문이다.