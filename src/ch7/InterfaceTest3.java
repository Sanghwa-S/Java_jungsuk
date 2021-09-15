package ch7;



public class InterfaceTest3 {

	public static void main(String[] args) {
		A_3 a = new A_3();
		a.methodA_3();
	}

}

class A_3 {
	void methodA_3() {
		I_3 i = InstacneManager.getInstance();
		i.methodB_3();
		System.out.println(i.toString());
	}
}

interface I_3{
	public abstract void methodB_3();
}

class B_3 implements I_3{
	public void methodB_3() {
		System.out.println("methodB_3 in B class");
	}
	public String toString() {
		return "class B";
	}
}

class InstacneManager{
	public static I_3 getInstance() {
		return new B_3();
	}
}