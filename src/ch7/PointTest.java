package ch7;

public class PointTest {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);
		Point_2 p_2 = new Point_2(10, 20);
		p_2.getLocation();
		p3.getLocation();
	}

}

class Point_2{
	
	int x, y ;
	
	Point_2 (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + "y :" + y;
	}
}

class Point3D extends Point_2{
	int z;
	
	Point3D (int x, int y, int z){
		super(x, y);	// 조상클래스의 생성자 Point(int x, int y) 를 호출한다.
		//this.x = x;
		//this.y = y;
		this.z = z;		
	}
	
	String getLocation() { 		// overriding 
		return "x :" + x + "y :" + y + "z :" + z;
	}
}