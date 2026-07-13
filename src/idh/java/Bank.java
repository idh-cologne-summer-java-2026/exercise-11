package idh.java;


import java.util.Iterator;
import java.util.HashMap;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	private HashMap<String, Account> accountsMap = new HashMap<>();

	public Bank() {
		// create accounts with varying balances
		String[] accountIDs = {"test1", "test2", "test3", "hdjsc", "shdcjsc"};
		Random random = new Random();
		
		for (int i = 0; i < accounts.length; i++) {
			String account1= accountIDs[i];

			Account newAccount = new Account(account1, random.nextInt(1000));
			
			accounts[i] = newAccount;
			accountsMap.put(account1, newAccount);
			
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(String number) {
		return accountsMap.get(number);
	}

}
