package edit3Constructor;

public class Car2 {
//field
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car2(){
		
	}
	Car2(String model){
		this(model,"은색",250);
	}
	Car2(String model,String color){
		this(model,color,250);
	}
	Car2(String model, String color,int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
}
