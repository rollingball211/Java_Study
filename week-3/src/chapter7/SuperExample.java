package chapter7;

public class SuperExample {

	public static void main(String[] args) {
		SuperEx2 sa = new SuperEx2();
		sa.takeOff();
		sa.fly();
		sa.flyMode= SuperEx2.SUPERSONIC;
		sa.fly();
		sa.flyMode= SuperEx2.NORMAL;
		sa.fly();
		sa.land();
	}

}
