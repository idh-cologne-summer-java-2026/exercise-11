package idh.java;


import java.util.Iterator;
import java.util.HashMap; 

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	private HashMap<String, Account> accountList = new HashMap<>(); 

	public Bank() {
		// create accounts with varying balances
	   accountList.put("1234@5678", new Account("1234@5678",1000)); 
	   accountList.put("cat_haz_map", new Account("cat_haz_map",5000)); 
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(String number) {
		// TODO: Implement
		return accountList.get(number); 
	}
	
	

}
