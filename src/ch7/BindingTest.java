package ch7;

public class BindingTest {

	public static void main(String[] args) {
		
		Parent_Binding p = new Child_Binding();
		Child_Binding c = new Child_Binding();
		
		System.out.println("p.x : "+ p.x);
		p.method();
		
		System.out.println("c.x : " + c.x);
		c.method();
		
	}

}

class Parent_Binding{
	int x = 100;
	
	void method() {
		System.out.println("Child method");
	}
}

class Child_Binding extends Parent_Binding{
	int x = 200;
	
	void method() {
		System.out.println("Child method");
	}
}