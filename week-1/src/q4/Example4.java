package q4;

public class Example4 {

	public static void main(String[] args) {
		//4.중첩 for문을 사용하여 방정식 4x+5y=60의 모든 해를 구해서 (x,y) 형태를 출력해라 . x와y는 10 이하의 자연수이다>
	
		for(int i=1;i<11;i++) {
			for(int j=1;j<11;j++) {
				if((4*i)+(5*j)==60) {
					System.out.println("방정식의 해 : (" + i + "," + j +")");
			}
				
			
			}
		}
	
	}

}
