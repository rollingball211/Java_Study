package edit3Field;

public class CarExample {

	public static void main(String[] args) {
		 Car myCar = new Car(); //앞의 car을 이용한 객체 생성.
		 
		 //필드값 읽기
		 System.out.println("회사: "  + myCar.company);
		 System.out.println("차종류: " +myCar.model);
		 System.out.println("최대속도" + myCar.maxSpeed);
		 System.out.println("현재속도" + myCar.speed);
		 
		 //필드값 변경
		 myCar.speed = 60;
		 System.out.println("바뀐 속도" + myCar.speed);
	}

}
