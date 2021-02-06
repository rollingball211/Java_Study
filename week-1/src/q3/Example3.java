package q3;

public class Example3 {
/*
 3.while문과 Math.random()을 이용해 두 개의 주사위를 던졋을떄 나오는 눈을 (눈1,눈2)형태로 출력하고, 눈의 합이 5이면 실행을 멈추는 코드를 출력해라.
 */
	public static void main(String[] args) {
		//Math.random()을 이욯한 주사위 구하기 (int)(Math.random()*6)+1
		
		while(true){
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			System.out.println("던져 나온 주사위의  값 (" + dice1+"," +dice2 +")");
			if(dice1+dice2==5)
				break;
			
		}
	}

}
