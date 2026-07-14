package idh.java;


import java.util.Iterator;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	Map<String, Account> accountMap = new HashMap<>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		String[] accountNames = {"0","1", "1234@5678", "cat_haz_cash", "👀​"};
				for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new
					Account(accountNames[i], random.nextInt(1000));
			
			accountMap.put(accounts[i].getId(), accounts[i]);
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		return getAccount(String.valueOf(number));
	}
	public Account getAccount(String number) {
		return accountMap.get(number);
	}

}
