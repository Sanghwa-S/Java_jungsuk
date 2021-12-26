package ch9;

import ch7.SuperTest;

public class ShallowDeepCopy {
	public static void main(String[] args) {
		Circle c1 = new Circle(new Point_9(1,1), 2.0);
		Circle c2 = c1.shallowCopy();
		Circle c3 = c1.deepCopy();
		
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
		
		System.out.println();
		System.out.println("--- c1 변경후 ---");
		c1.p.x = 9;
		c1.p.y = 9;
		
		
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
		
	}
}

class Circle implements Cloneable {
	Point_9 p;//원점
	double r;//반지름
	
	Circle(Point_9 p, double r){
		this.p = p;
		this.r = r;
	}
	
	public Circle shallowCopy() {
		Object obj = null;
		
		try {
			obj = super.clone();
		}
		catch(CloneNotSupportedException e) {}
		
		return (Circle)obj;
	}
	
	public Circle deepCopy() {
		Object obj = null;
		
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		
		Circle c = (Circle)obj;
		c.p = new Point_9(this.p.x, this.p.y);
				
		return c;
	}
	
	public String toString() {
		return "[p= " + p + ", r= " + r + " ]"; 
	}
}

class Point_9 {
	int x, y;
	
	Point_9(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "( " + x + " , " + y + " )";
	}
}
