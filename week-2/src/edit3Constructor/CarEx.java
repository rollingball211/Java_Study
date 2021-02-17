package edit3Constructor;

public class CarEx {

	public static void main(String[] args) {
		Car2 car1 = new Car2();
		System.out.println("CAR1 COMPANY: " + car1.company);
		
		Car2 car2 = new Car2("자가용");
		System.out.println("CAR2 COMPANY: " + car2.company);
		System.out.println("car2 model: " + car2.model);
		
		Car2 car3 = new Car2("자가용","빨강");
		System.out.println("CAR3 COMPANY: " + car3.company);
		System.out.println("car3 model: " + car3.model);
		System.out.println("Car3 color: " + car3.color);
		
		Car2 car4 = new Car2("자가용","빨강",120);
		System.out.println("CAR4 COMPANY: " + car4.company);
		System.out.println("car4 model: " + car4.model);
		System.out.println("Car4 color: " + car4.color);
		System.out.println("Car4 maxspeed: " + car4.maxSpeed);
		
	}

}
