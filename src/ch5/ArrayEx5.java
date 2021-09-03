package ch5;

public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //총점을 저장하기 위한 변수
		float avg = 0f; //평균을 저장하기 위한 변수
		
		int[] score = new int[] {100, 88, 100, 100, 90};
		
		for(int i=0; i < score.length; i++)
			sum += score[i];
		
		System.out.println("총점: " + sum);
		
		avg = (float)sum/score.length;
		
		System.out.println("평균: " + avg);
	}

}
