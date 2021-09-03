package ch5;

import java.util.Arrays; //Array.toString 을 사용할때

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
	//	int[] iArr3 = new int[] {100, 95, 80, 70, 60};
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd', 'e'};
		
		for(int i=0; i < iArr1.length; i++) 
			iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열안에 넣는
		
		for(int i=0; i < iArr2.length; i++)
			iArr2[i] = (int)(Math.random()*10)+1; //1~10의 값을 배열에 저장.
		
		for(int i=0; i < iArr1.length; i++)
			System.out.printf(iArr1[i] + ",");
		
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);// 타입@주소 형태로 출력된다. [I 는 1차원 int 배열 이라는 의미, @뒤에 나오는 16진수들은 배열의 주소이다
		System.out.println(chArr);// char 배열은 println 메서드로 출력하면 구분자 없이 그대로 출력되도록 설계되었다.
	}
}
