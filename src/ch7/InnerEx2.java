package ch7;

public class InnerEx2 {

	class InstanceInner{}
	static class StaticInner2 {}
	
	//인스턴스 멤버 간에는 서로 직접 접근이 가능하다.
	InstanceInner iv = new InstanceInner();
	//static 멤버 간에는 서로 직접 접근이 가능하다.
	static StaticInner2 cv = new StaticInner2();
	
	static void staticMethod() {
		//static 멤버는 인스턴스멤버에 직접 접근할 수 없다.
//		InstanceInner obj1 = new InstanceInner();
		StaticInner2 obj2 = new StaticInner2();
		
		//굳이 접근하려면 아래와 같이 객체를 생성ㅇ해야 한다.
		//인스턴스 클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있따.
		
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		//인스턴스메서드 에서는 인스턴스멤버와 static 멤버 모두 접근 가능하다.
		InstanceInner obj1 = new InstanceInner();
		StaticInner2 obj2 = new StaticInner2();
		
		//메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
}
