package ch7;

class InnerEx1 {
	class InstanceInner {
		int iv = 100;
//		static int cv = 100;		//에러! static 변수는 인스턴스 클래스안에 생성할 수 없다.
		final static int CONST = 100;	//final static은 상수이므로 가능하다!
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;		//static 클래스 안에서만 클래스 변수(static)를 생성 할 수 있다.
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300;	//에러!
			final static int CONST = 300;
		}
	}
	
	public static void main(String agrs[]) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}
