package Chapter5;

public class Edit1 {
/* 	
    데이터 타입 분류.
    1.원시(기본) 데이터 타입 (primitive type)
    =>정수,실수,문자,논리형 타입을 저장하는 변수
    =>원시 데이터 타입을 이용해 선언된 변수는 실제 값을 변수 안에 저장.
    
    2.참조 타입(reference type)
    =>객체(Object)의 번지를 참조하는 타입으로 배열,열거,클래스,인터페이스 타입을 말함.(String)은 클래스 변수.
    =>참조 타입을 이용해 선언된 변수는 메모리의 번지를 값으로 가짐. 번지를 통해 객체를 참조한다는 뜻에서 참조 타입이라고 불림.
 	
  	3.JVM(Java Virtual Machine)
  	1.메소드 영역
  	=>JVM이 시작할떄 생성되고 모든 스레드가 공유하는 영역, 클래스별로 필드 데이터,메소드,데이터,...등등으로 분류해서 저장
  	
  	2.힙 영역(Heap) 
  	=>객체와 배열이 생성되는 영역,스택 영역의 변수나 다른 객체의 피드에서 참조함.
  	=>참조하는 변수가 없다면 JVM은 garbage collector을 실행시켜 힙 영역에서 자동적으로 제거.
  	
  	3.스택 영역
	=>메소드를 호출할 때마다 프레임 추가(push)하고 메소드가 종료되면 해당 프레임을 제거(pop)함.
	=>변수는 선언된 블록 안에서만 스택에 존재하고 블록을 벗어나면 스택에서 제거된다.
	
 */
	
/*
 	참조 변수의 ==,!== 연산.
 	1.참조 변수간의 ==, !== 연산은 동일한 객체를 참조하는지 , 아닌지를 비교함 = 힙 영역의 객체 주소이므로 주소값을 비교하는것이 됨.
 	
 	2.null&NullPointerException
 	Null
 	참조 타입 변수는 힙 영역의 객체를 참조하지 않는다는 뜻으로 null값을 가질 수 있음.
 	null로 초기화된 참조 변수는 스택 영역에 생성됨.
 	
 	NullpointerException
 	참조 타입 변수를 사용하는 것은 객체를 사용하는것을 의미.
 	참조할 객체가 없으므로 예외 발생.
 	
 	name1과 name2는 동일한 문자열 리터럴 객체 참조 = true
 	name1,2와 name3는 String객체를 별도로 생성했기 때문에 false.
 	문자열만을 비교할 떄에는 equals method 사용.
 
 */
	public static void main(String[] args) {
		String name1= "신민철";
		String name2= "신민철";
		String name3= new String("신민철");
	  System.out.println(name1==name2);
	  System.out.println(name2==name3);
	}
}
