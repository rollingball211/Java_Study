package chapter16;
import java.util.Arrays;

import java.util.List;
import java.util.stream.*;

public class Practice1 {
/*
 컬렉션으로부터 스트림 얻기
 */
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
		new Student("김진현",10),
		new Student("권순호",20),
		new Student("조원식",30)
		);
	
	Stream<Student> stream = studentList.stream();
	stream.forEach(s->System.out.println(s.getName()));

	}
}