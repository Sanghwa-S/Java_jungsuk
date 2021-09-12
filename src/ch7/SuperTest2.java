package ch7;

public class SuperTest2 {

	public static void main(String[] args) {
		Child_2 c = new Child_2();
		c.method();
	}

}

class Parent_2 {
	int x = 10;
}

class Child_2 extends Parent_2 {
	
	int x = 20;
	
	void method () {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}