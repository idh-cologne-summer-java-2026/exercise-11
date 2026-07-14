package idh.java;

/**
 * This class represents an account in our bank.
 * @author reiterns
 *
 */
public class Account {
	// the balance of the account
	private int balance;
	
	// the id of the account
	private String id;

	public Account(String id, int balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		this.balance -= amount;
	}
}
