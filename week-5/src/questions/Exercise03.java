package questions;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("------------------------");
			System.out.println("선택>");
			
			int number = sc.nextInt();
			switch(number) {
			case 1: 
				System.out.println("예금할 금액을 입력하세요.");
				int deposit = sc.nextInt();
				balance +=deposit;
				System.out.println("현재 잔액은 " + balance + "원 입니다 ");
				break;
				
			case 2:
				System.out.println("출금할 금액을 입력하세요.");
				int withdraw = sc.nextInt();
				if(withdraw>balance) {
					System.out.println("잔고가 부족합니다.");
				}else {
					balance -=withdraw;
					System.out.println("남은 잔고  " + balance + "원 입니다.");
				}
				break;
			case 3:
				System.out.println("남은 잔고는 " + balance + "원 입니다.");
				break;
			case 4:
				System.out.println("프로그램 종료");
				System.exit(0);
				
			}
			
		}
		
		
		
		
		
		
	}

}
