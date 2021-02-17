package Chapter6;

public class Edit5Example {

	public static void main(String[] args) {
		Edit5 p1 = new Edit5("1234567", "밍");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		System.out.println("지구의 표면적" + Edit5.EARTH_SURFACE_AREA);
	}

	
}
