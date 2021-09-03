package ch5;

public class ArrayEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "ABCDE";
		
		for(int i=0; i <src.length(); i++) {
			char ch = src.charAt(i); //src의 인덱스 i 번째의 문자를 ch에 저장한다.
			System.out.println("src.charAt(" + i + "):" + ch);
		}
		
		//String을 char [] 로 변환
		char[] chArr = src.toCharArray();
		
		//char배열 ( char [] ) 을 출력
		System.out.println(chArr);
	}

}
