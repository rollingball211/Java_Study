package chapter7;

public class Computer extends Calculator{

	double areaCricle(double r) {
		System.out.println("Computer 객체의 areaCircle()실행");
		return Math.PI*r*r;
	}
}
