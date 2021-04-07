package chapter16;

import java.util.*;
import java.util.stream.*;

public class Practice2 {

	public static int sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = {"김진현","권순호","조원식","김형진"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(a->System.out.println(a+","));
		System.out.println();
		
		int intarray[] = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intarray);
		intStream.forEach(a-> System.out.println(a+","));
		System.out.println();
		
		/*
		 숫자 범위로부터 스트림 얻기.
		 IntStream의 rangedClosed() 사용.
		 */
		
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a->sum+=a);
		System.out.println("총합 :" + sum);

	}

}
