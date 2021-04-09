package chapter15;

public class Edit1 {
/*
 	List collection
 	객체를 일렬로 늘어놓은 구조를 가짐. 개게를 인덱스로 관리하기 때문에 객체를 저장하면 자동인덱스가 부여
 	인덱스로 객체 검색,삭제할수 있는 기능 제공.
 	ArrayList, LinkedList,Vector
 	동일한 객체 중복 저장한다면 동일한 번지가 참조됨.
 	
 	ArrayList
 	 저장용량 초과한 객체들이 들어오면 자동적으로 용량이 늘어남.
 	 List<String> list = new ArrayList<String>() 기본 용량 10 (30): 기본용량 30
 	 빈번한 객체 삽입이나 삭제가 일어나는 곳은 LinkedList가 더 좋음
 	 마지막 객체 추가는 ArrayList가 더 좋음.
 	 
 	 
 	Vector
 	List<E> list = new Vector<E>();
 	벡터는 동기화된 메소드로 구성되어있기 때문에 스레드가 하나를 완료해야 그 다음걸 완료 가능.
 	
 	LinkedList
 	인접 참조를 링크해 체인처럼 관리함.
 	List<E> list = new LinkedList<E>();
 	
 	
 	Set 컬렉션
 	저장 순서 유지 x
 	객체 중복해서 저장 x
 	하나의 null만 저장가능
 	
 	반복자 Iterator<String> iterator = set.iterator();
 	
 	
 	HashSet
 	Set<E> set = new HashSet<E>();
 	객체들을 순서 없이 저장하고 동일한 객체 중복 저장x 
 	
 	Map 컬렉션
 	키와 값으로 구성된 Entry 객체를 저장하는 구조를 가짐. 키,값 모두 객체
	객체 추가 put() 객체 찾아올때는 get() 삭제는 remove() 사용
	
	HashMap
	키로 사용될 객체는 hashCode()와 equals() 메소드를 재정의해서 동등 객체가 될 조건을 정해야함.
	hashCode()의 리턴값이 같아야하고, equals()메소드가 true 반환해야함.
	Map<K,V>map = new HashMap<K,V>();
	
	HashTable
	HashMap과 같으나 동기화된 메소드로 구성되있어서 스레드가 안전함.
	Map<K,V> map = new HashTable<String,Integer>();
		
	Properties 
	HashTable의 하위 클래스이기 대문에 모든 특징을 그대로 갖고 있음.
	key,value를 String 타입으로 제한
	한글은 유니코드로 변환됨.
	
	TreeSet
	이진트리를 기반으로 한 set 컬렉션
	부모값과 비교해서 낮은건 왼쪽, 큰건 오르녹으로 저장.
	TreeSet<String> treeSet = new TreeSet<String>();
	
	TreeMap 
	TreeSet 과의 차이점은 키와 값이 저장된 Map,Entry를 저장함.
 */
}
