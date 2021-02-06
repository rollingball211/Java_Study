package q5;

public class Example5 {
	//5.for문을 이용하여 실행 결과와 같은 삼각형을 출력하는 코드를  작성해라
	/*
	 
	 * 
	 * *
	 * * *
	 
	 */
	public static void main(String[] args) {
	for(int i = 0; i<4; i++) {
		for(int j=0; j<i; j++) {
			System.out.print("*");
		}
		System.out.println("");

	}
    }

}
