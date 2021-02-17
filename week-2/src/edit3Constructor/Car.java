package edit3Constructor;

public class Car {

	/*
	  생성자 오버로딩이 많아질 수록 생성자 간의 중복된 코드 발생 가능
	  this 이용.
	 */
	String model;
	String color;
	int maxSpeed;
	
	Car(String model){
		this.model=model;
		this.color="은색";
		this.maxSpeed=250;
		
	}
	Car(String model, String color){
		this.model=model;
		this.color="은색";
		this.maxSpeed=250;
		
	}
	Car(String model, String color, int maxSpeed){
		this.model=model;
		this.color="은색";
		this.maxSpeed=250;
		
	}
}

