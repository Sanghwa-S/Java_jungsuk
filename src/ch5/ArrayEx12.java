package ch5;

public class ArrayEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[] {"Kim", "Park", "Yi"};
		
		for(int i=0; i < names.length; i++)
			System.out.println("names[" + i + "]: " + names[i]);
		
		String tmp = names[2]; //names 인덱스2 에 있는 요소를 tmp 에 저장
		System.out.println("tmp: " + tmp);
		names[0] = "Yu"; // 배열 names 인덱스0 에 있는 요소를 "Yu"로 변경

		for(String str : names)			//향상된 for 문
			System.out.println(str);
	}

}
