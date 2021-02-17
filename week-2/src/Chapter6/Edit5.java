package Chapter6;
import Chapter5.*;
public class Edit5 {
/*
  	final 필드와 상수
  	final 타입 필드 [=초기값];
  	
  	static final(상수)
  	불변의 값
  	static final 타입 상수;
 */
	final String nation ="KOREA";
	final String ssn;
	String name;
	
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS;
	
	
	public Edit5(String ssn,String name) {
		this.ssn=ssn;
		this.name=name;
	}
}
