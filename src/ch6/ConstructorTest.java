package ch6;

public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
//		Data2 d2 = new Data2(); 에러난다
		Data2 d2 = new Data2(10); // 이렇게하면 에러가 안난다.
	}

}

class Data1{
	int value;
}
class Data2{
	int value;
	
	Data2(int x) {	//매개변수가 있는 생성자. 내가 따로 생성자를 정의해줬기 때문에 Data2() 는 실행되지 않는다.
		value = x;
	}
}
