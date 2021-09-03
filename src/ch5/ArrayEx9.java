package ch5;
import java.util.*;

public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] code = new int[] { -4, -1, 3, 6, 11}; //불연속적인 값들로 구성된 배열
		int[] arr = new int[10];
		
		for(int i=0; i < arr.length; i++) {
			int tmp = (int)(Math.random() * code.length); // tmp 에는 0~4 중의 하나가 저장된다.
			arr[i] = code[tmp];
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
