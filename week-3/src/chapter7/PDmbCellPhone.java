package chapter7;

public class PDmbCellPhone extends Phone {
	//필드
	int channel;
	
	//생성자
	PDmbCellPhone(String model, String color,int channel){
		this.model=model;
		this.color=color;  //위에 두개는 Phone으로부터 상속받은 필드
		this.channel=channel;
	}
	
	void turnOnDmb() {
		System.out.println("dmb를 켭니다.");
	}
	void ChangeChannel(int channel) {
		this.channel=channel;
		System.out.println("채널" + channel +"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("dmb를 끕니다.");
	}
}
