package ch9;

public class EqualsEx2 {
	
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		System.out.println("그냥 == 을 사용했을때");
		if(p1 == p2)
			System.out.println("p1 과 p2는 같은사람 입니다.");
		else 
			System.out.println("p1 과 p2는 다른사람 입니다.");
		
		System.out.println("p1 은 " + p1.id);
		System.out.println("p2 은 " + p2.id);
		System.out.println("p1 의 주소는 " + p1);
		System.out.println("p2 의 주소는 " + p2);
		
		System.out.println();
		
		System.out.println("equals java.lang패키지를 사용해서 비교했을때");
		if(p1.equals(p2))
			System.out.println("p1 과 p2 는 같은 사람입니다.");
		else 
			System.out.println("p1 과 p2는 다른사람 입니다.");

		System.out.println("p1 은 " + p1.id);
		System.out.println("p2 은 " + p2.id);
		System.out.println("p1 의 주소는 " + p1);
		System.out.println("p2 의 주소는 " + p2);
	}
	
}

class Person {
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id ==((Person)obj).id;
		else
			return false;
	}
	
	Person (long id){
		this.id = id;
	}
}
