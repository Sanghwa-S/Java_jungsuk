package ch7;

public class BindingTest2 {

	public static void main(String[] args) {
		Parent_Binding2 p2 = new Child_Binding2();
		Child_Binding2 c2 = new Child_Binding2();
		
		System.out.println("p2.x : " + p2.x);
		p2.method();
		
		System.out.println("c2.x : " + c2.x);
		c2.method();
	}

}

class Parent_Binding2{
	int x = 300;
	
	void method() {
		System.out.println("This is a parent method");
	}
}

class Child_Binding2 extends Parent_Binding2{};