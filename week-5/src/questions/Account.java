package questions;

public class Account {
	static final int MIN_BALACE = 0;
	static final int MAX_BALANCE =1000000;
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>= MIN_BALACE && balance<=MAX_BALANCE) {
		this.balance = balance;
		}
	}
}
