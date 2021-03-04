package questions2;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("----------------");
			System.out.println("선택>");
			
			int selectno = sc.nextInt();
			
			if(selectno==1) {
				createAccount();
			}else if(selectno==2) {
				accountList();
			}else if(selectno==3) {
				deposit();
			}else if(selectno==4) {
				withdraw();
			}else if(selectno==5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("계좌번호");
		String ano = sc.next();
		System.out.println("계좌주");
		String owner = sc.next();
		System.out.println("초기입금액");
		int balance = sc.nextInt();
		
		Account account = new Account(ano,owner,balance); //생성자 호출해서 필드 초기화
		
		for(int i=0; i<accountArray.length;i++) {
		if(accountArray[i]==null) {
			accountArray[i] = account;
			System.out.println("계좌 생성 완료!");
			break;
 		}
	  }
	}
	private static void accountList() {
		for(int i = 0 ; i<accountArray.length; i++) {
			if(accountArray[i]==null)
				break;
			System.out.println(accountArray[i].getAno() + "\t"+ accountArray[i].getOwner() + "\t"+ accountArray[i].getBalance());
		}
	}
	private static void deposit() {
		System.out.println("입금");
		System.out.println("계좌번호");
		String ano = sc.next();
		
		System.out.println("입금액");
		int balance = sc.nextInt();
		
		Account account  = findAccount(ano);
		
		if(account == null) {
			System.out.println("결과가 존재하지 않습니다.");
			return;
		}
		
		account.setBalance(account.getBalance()+balance);
		System.out.println("예금 성공!");
	}

	private static void withdraw() {
		System.out.println("출금");		
		System.out.println("계좌번호");
		String ano = sc.next();
		
		System.out.println("출금액");
		int balance = sc.nextInt();
		
		Account account  = findAccount(ano);
		if(account==null) {
			System.out.println("결과가 존재하지 않ㅎ습니다.");
			return;
		}
		if(account.getBalance()<balance) {
			System.out.println("예금액보다 많이 더 출급할수 없습니다.");
			return;
		}
		
		account.setBalance(account.getBalance()-balance);
		System.out.println("출금 성공!");
	}



private static Account findAccount(String ano) {
		Account account = null;
		for(int i= 0; i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				if(accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}

}


