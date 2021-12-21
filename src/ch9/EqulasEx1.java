package ch9;

public class EqulasEx1 {
	
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		//Value v2 = new Value(20);
		
		System.out.println("v1 = " + v1.value);
		System.out.println("v2 = " + v2.value);
		System.out.println("v1 의 주소값은  " + v1);
		System.out.println("v2 의 주소값은 " + v2);
		
		
		
		if(v1.equals(v2))
			System.out.println("V1 과 V2 는 같습니다.");
		else
			System.out.println("V1과 v2 는 다릅니다.");
		
		System.out.println();
		v1 = v2;
		
		System.out.println("v1 = " + v1.value);
		System.out.println("v2 = " + v2.value);
		System.out.println("v1 의 주소값은  " + v1);
		System.out.println("v2 의 주소값은 " + v2);
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}
	
}

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
}