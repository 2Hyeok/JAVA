package account;
public class Account {
	private long balance;

	public Account() { }	

	public long getBalance() {
		return balance;
	}	
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("ÀÜ°íºÎÁ·:"+(money-balance)+" ¸ðÀÚ¶÷");
		}
		balance -= money;
	}
}
