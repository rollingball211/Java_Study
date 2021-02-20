package chapter7;

public class PhoneExample {

	public static void main(String[] args) {
		PDmbCellPhone dmbCellPhone = new PDmbCellPhone("자바폰","검정",10);
		
		//Phone으로부터 상속받은 필드
		System.out.println("모델" + dmbCellPhone.model);
		System.out.println("색상" + dmbCellPhone.color);
		
		//dmbcellphone의 필드
		System.out.println("채널" + dmbCellPhone.channel);
		//Phone 메소드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("ㅎㅇ");
		dmbCellPhone.sendVoice("ㅇㅇㅎㅇ");
		dmbCellPhone.hangUp();
		
		//dmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.ChangeChannel(15);
		dmbCellPhone.turnOffDmb();
	}
	

}
