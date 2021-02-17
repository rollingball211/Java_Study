package Chapter5;

public class Edit2 {
/*
 배열은 같은 타입의 데이터만 저장가능.
 
 배열 선언:
 타입[] 변수;
 타입 변수 [];
 null값으로 초기화 가능(참조 변수)
 */
	public static void main(String[] args) {
		int intArray[];
		String names[] = {"김매기","김공지","제스"};
		
		System.out.println("name1 :" + names[0]);
		System.out.println("name2 :" + names[1]);
		System.out.println("name3 :" + names[2]);
		
		for(int i=0;i<names.length;i++) {
			System.out.println("name: " + names[i]);
		}
	
		System.out.println(names[4]);

	}

}
