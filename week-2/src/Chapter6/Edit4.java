package Chapter6;

public class Edit4 {
/*
  정적 멤버와 static
  클래스에 고정된 멤버, 객체 생성하지않고 사용 간으한 필드와 메서드.
  클래스 멤버라고도 불림.
  
 */
	//정적 필드 선언
	static double pi = 3.14;
	
	static int plus(int x , int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
}
