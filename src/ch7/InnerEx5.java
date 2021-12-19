package ch7;

public class InnerEx5 {
	public static void main(String[] args) {
		Outer_Ex5 outer = new Outer_Ex5();
		Outer_Ex5.Inner inner = outer.new Inner();
		inner.method();
	}
}//InnerEx5 끝

class Outer_Ex5{
	int value = 10;		//Outer.this.value
	
	class Inner{
		
			int value = 20;		//this.value
			
			void method() {
				int value = 30;
				System.out.println("           value :" + value);
				System.out.println("      this.value :" + this.value);
				System.out.println("Outer.this.value :" + Outer_Ex5.this.value);
			}
		}// Inner 클래스의 끝
	}//Outer 클래스의 끝

