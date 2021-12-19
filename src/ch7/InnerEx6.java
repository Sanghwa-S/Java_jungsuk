package ch7;

//익명 클래스 anonymous class

class InnerEx6 {
	Object iv = new Object() { void mehtod() {} };			//익명 클래스
	static Object cv = new Object() { void method() {} };	//익명 클래스
	
	void myMethod() {
		Object lv = new Object () { void method() {} };		//익명 클래스
	}
}
