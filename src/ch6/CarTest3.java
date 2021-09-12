package ch6;

class Car_3 {
	String color;
	String gearType;
	int door;
	
	Car_3(){
		this("white", "auto", 4);
	}
	
	Car_3(Car_3 c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car_3(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		Car_3 c1 = new Car_3();
		Car_3 c2 = new Car_3(c1);
		
		System.out.println("c1의 color: " + c1.color + ", c1의 gearType: " + c1.gearType + ", c1의 door 개수: " + c1.door);
		System.out.println("c2의 color: " + c2.color + ", c2의 gearType: " + c2.gearType + ", c2의 door 개수: " + c2.door);
		
		c1.door = 100;
		System.out.println("c1.door = 100 수행후");
		
		
		System.out.println("c1의 color: " + c1.color + ", c1의 gearType: " + c1.gearType + ", c1의 door 개수: " + c1.door);
		System.out.println("c2의 color: " + c2.color + ", c2의 gearType: " + c2.gearType + ", c2의 door 개수: " + c2.door);
		
	}

}
