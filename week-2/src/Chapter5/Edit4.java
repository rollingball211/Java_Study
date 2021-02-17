package Chapter5;

public class Edit4 {
/*
  향상 for문
  배열 및 컬렉션 항목의 개수만큼 반복, 자동적으로 for문 빠져나감
  for(타입변수:배열)
   실행문
   
   
 */
	public static void main(String[] args) {
		int scores[] = {95,71,84,93,87};
		int sum =0;
		
		for(int score:scores) {
			sum = sum +score;
		}
		System.out.println("점수 총합 " + sum);
		
	}

}
