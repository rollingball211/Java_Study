package chapter7;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator c = new Calculator();
		System.out.println("원 면적" + c.areaCircle(r));
		System.out.println();
		
		Computer c1 = new Computer();
		System.out.println("원 면적" + c1.areaCricle(r));
	}

}
