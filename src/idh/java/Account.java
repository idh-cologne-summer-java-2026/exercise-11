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
	String idC;  //for starters, turn all int ids into Strings
	int id;

	public Account(int id, int status) {
		this.id = id;
		this.balance = status;
	}
	//Overloaded Constructor allowing Strings as accountIds
	public Account(String idC, int status) {
		this.idC = idC;
		this.balance = status;
	}
	public int getId() {
		return id;
	}
	
	public String getIdC() {
		return idC;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setIdC(String idC) {
		this.idC = idC;
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
