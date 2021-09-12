package ch7;

public class BindingTest3 {

	public static void main(String[] args) {
		Parent_Binding3 p3 = new Child_Binding3();
		Child_Binding3 c3 = new Child_Binding3();
		
		System.out.println("p3.x : " + p3.x);
		p3.method();
		
		System.out.println("c3.x : " + c3.x);
		c3 .method();
	}

}

class Parent_Binding3{
	int x = 400;
	
	void method() {
		System.out.println("This is a parent method");
	}
}

class Child_Binding3 extends Parent_Binding3{
	int x = 500;
	
	void method() {
		System.out.println("x=" + x); // this.x 와 같다.
		System.out.println("super.x= " + super.x);
		System.out.println("this.x= " + this.x);
	}
}