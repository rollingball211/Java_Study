package chapter9;

public class Edit1 {
	/*
	 인스턴스 멤버 클래스 
	 static 키워드 없이 선언된 클래스.
	 인스턴스 필드와 메소드만 선언이 가능하고 정적 필드와 메소드는 선언 불가.
	 
	 */
	class B{
		B(){}
		int field1;
		void method1() {}
	}
	/*
	  Edit(A)클래스 외부에서 인스턴스 멤버 클래스 b의 객체를 생성하려면 A객체를 생성하고 B객체를 생성해야 함.
	  
	  정적 멤버 클래스
	  static 키워드로 선언된 클래스. 정적멤버클래스는 모든 종류의 필드와 메소드를 선언할수 있음.
	 */
	static class C{
		C(){} //생성자
		int field1;//인스턴스 필드
		static int field2;//정적 필드
		void method1() {}//인스턴스 메소드
		static void method() {}//정적 메소드
	}
	/*
	 Edit(A)클래스 외부에서 정적 멤버 클래스 C의 객체를 생성하기 위해서는 A객체를 생성할 필요 X 
	 C 객체만 생성하면 됨.
	 */
	/*
	 메소드 안에서 선언한 클래스: 로컬 클래스.
	 로컬클래스는 접근제한자 및 static을 붙일 수 없음.
	 로컬클래스 내부에는 인스턴스 필드와 메소드만 선언 가능.
	 */
	void method() {
		class D{
			D(){}
			int field1;
			void method1() {}
			
		}
		D d = new D();
		d.field1=3;
		d.method1();
	}
	/*
	 로컬 클래스는 메소드가 실행될 떄 메소드 내에서 객체를 생성하고 사용해야 함.
	 비동기 처리를 위해 스레드 객체를 만들때 사용.
	 */
}
