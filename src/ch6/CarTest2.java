package ch6;

class Car_2 {
	String color;		//색상
	String gearType;	//변속기 종류 - auto(자동), manual(수동)
	int door;			//문의 개수
	
	Car_2(){
		this("white", "auto", 4);
	}
	
	Car_2(String color){
		this(color, "auto", 4);
	}
	
	Car_2(String color, String gearType, int door){
		this.color  = color;
		this.gearType = gearType;
		this.door = door;
	}
}


public class CarTest2 {

	public static void main(String[] args) {
		Car_2 c1 = new Car_2();
		Car_2 c2 = new Car_2("blue");
		
		System.out.println("c1의 color: " + c1.color + ", c1의 gearType: " + c1.gearType + ", c1의 door 개수: " + c1.door);
		System.out.println("c2의 color: " + c2.color + ", c2의 gearType: " + c2.gearType + ", c2의 door 개수: " + c2.door);
	}

}
