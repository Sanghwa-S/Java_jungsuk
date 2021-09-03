package ch5;

public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];
		
		for (int i = 0; i < numArr.length; i++)
			System.out.print(numArr[i] = (int)(Math.random()*10));
		
		System.out.println();
		
		for(int i=0; i < numArr.length - 1; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지를 체크 한다.
			
			for(int j=0; j < numArr.length-1-i; j++) {
				//numArr[j]와 바로 옆의 요소 numArr[j+1]을 비교한다.
				if(numArr[j] > numArr[j+1]) { // 왼쪽 값이 크면 바꾼다.
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
					changed = true; // 자리 바꿈이 발생했으니 changed를 true로.
				}
			
			if(!changed) break; //자리 바꿈이 없으면 반복문을 벗어난다.
			
			for(int k=0; k < numArr.length; k++)
				System.out.print(numArr[k]); // 정렬된 결과를 출력한다.
			
			System.out.println();
			}
		}
	}

}
