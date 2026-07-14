package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	HashMap<String, Account> accountsById = new HashMap <String, Account>(); 

	
	
	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		String[] accountNumbers = {"1234@5678\","cat_haz_cash", "💸"", "45674", "jdgenrj"};
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(accountNumbers[i], random.nextInt(1000));
			accountsById.put(accounts[i].getId(), accounts[i]);
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(String id) {
		// TODO: Implement
		return accountsById.get(id);
	}

	

}
