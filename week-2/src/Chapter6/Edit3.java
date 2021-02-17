package Chapter6;

public class Edit3 {
/*
  클래스의 구성 멤버
  	필드
  	객체의 데이터가 저장되는 곳
  	선언 형태는 변수와 비슷하나 변수라고 부르지 않음.
  	생성자와 메소드 전체에서 사용, 객체가 소멸되지 않는 한 객체와 함꼐 존재
  	
  	
  	생성자
  	new 연산자로 호출되는 {} 블록.
  	객체 생성 시 초기화 담당!
  	필드 초기화
  	메소드 호출해 객체 사용 준비 함
  	리턴 타입 x
  	
  	메소드
  	객체의 동작에 해당하는 {}블록
  	메소드 호출 시 중괄호 블록에 있는 코드를 일괄적으로 실행.
 */
	/*
	 Field
	필드 선언 타입 필드 [ = 초기값];
	필드 선은은 생성자 선언,메소드 선언 앞 뒤에서 가능
	생성자,메소드 안에 있는 변수 = > local variable.
	*/
	String comapny;
	String model;
	
	/*
	  생성자 Constructor)
	  메소드와 비슷한 모양이나 리턴타입이 없고 클래스 이름과 동일함.
	 */
	Edit3(){
		
	}
	
	/*
	  메소드
	  선언부(리턴타입,메소드이름,매개변수선언)과 실행블록으로 구성.
	  리턴타입 메소드이름([매개변수 선언...]){
	  실행코드
	  }
	  
	  리턴값이 있는 메소드. 리턴 타입이 있는 메소드는 만드시 리턴문ㅇ르 사용해서 리턴값 지정해야함.
	  return문이 실행되면 메소드는 즉시 종료됨.
	  
	 */
	double divide(int x ,int y) {
		double result  = (double)x/(double)y;
		return result;
	}
	
	int sum(int values[]) {
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum +=values[i];
			
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		Edit3 example = new Edit3();
		int result = example.sum(new int[] {1,2,3,4,5});
		System.out.println(result);
		
	}
}
