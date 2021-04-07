package chapter16;

public class Edit2 {
/*
	필터링
	distinct(),filter()
	중복 제거 Stream의 경우 Object.equals(Object)가 true면 제거
	나머지는 동일값일때 제거.
	
	filter()메소드는 매개값으로 주어진 predicate가 true를 리턴하는 요소만 필터링.
	
	Mapping
	중간 처리 기능. 스ㅡ트림의 요소를 다른 요소로 대체하는 작업
	1.flatXXX(),
	2.mapXXX(),
	3.asDoubleStream(),
	4.asLongStream(),
	5.boxed()
	
	1.요소를 대체하는 복수개의 요소들로 구성된 새로운 스트림을 리턴.
	2.요소를 대체하는 요소로 구성된 새로운 스트림을 리턴. a=>c b=>d면 cd 요소로 바뀜
	3,4,5
	3은 int,longStream의 요소를 dobule로 타입변환
	4는 나머지 두개의 타입을 Long으로 타입변환.
	5는 int,long,double을 Integer,Long,Double 요소로 박싱해 스트림 생성
	
	루핑 
	peek()
	중간처리 단계에서 전체 요소를 루핑하면서 추가적인 작업을 하기 위해 사용됨.
	
	forEach()
	최종 처리 메소드, 이후에 sum과 같은 메소드를 호출하면 안됨.
	
	매칭
	AllMatch
	모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하는지 조사
	anyMatch
	모든 요소들 중 하나만이 Predicate의 조건을 만족하는지 조사
	noneMatch()
	모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하지 않는지 조사.
	
	집계함수 
	sum(),count(),average(),max(),min()
	
	병렬 처리
	동시성 (Concurrency)
	멀티 작업을 위해 멀티 스레드가 번갈아가면서 실행하는 성질
	병렬성(Parallelism)
	멀티 코어를 이용해 동시에 실행하는 성질을 말함.
	
	데이터 병렬성
	전체 데이터를 쪼개어 서브 데이터들로 만들고 서브 데이터들을 병렬 처리해서 작업을 빨리 끝내는것을 말함.
	
	작업 병렬성
	서로 다른 작업을 병렬 처리하는것을 말함.
	
	UDP NETWORKING
	
 */
}
