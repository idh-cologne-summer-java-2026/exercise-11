package idh.java;


import java.util.Iterator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	
	Map<String, Account> accountsByNumber = new HashMap<>();

	public Bank() {
		// create accounts with varying balances
		String [] accountNumbers = {
				"0",
			    "1",
			    "1234@5678",
			    "cat_haz_cash",
			    "💸"	
		};
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			String accountNumber = accountNumbers[i];
			
			accounts[i] = new Account(accountNumber, random.nextInt(1000));
			accountsByNumber.put(accountNumber,  accounts[i]);
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(String number) {
		return accountsByNumber.get(number);
	}

}
