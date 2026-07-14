package idh.java;


/**
 * This class represents an account in our bank.
 * @author reiterns
 *
 */
public class Account {
	// the balance of the account
	int balance;
	
	// the id of the account
	String id;

	public Account(int id, int status) {
		this(String.valueOf(id), status);
	}
	public Account(String id, int status) {
		this.id = id;
		this.balance = status;
	}
	
	public String getId() {
		return id;
	}

	public void setId(int id) {
		this.id = String.valueOf(id);
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int status) {
		this.balance = status;
	}
	
	/**
	 * Withdraws a sum of money from the account
	 * @param sum
	 */
	public void withdraw(int sum) {
		this.balance = balance - sum;
	}
	
	
}
