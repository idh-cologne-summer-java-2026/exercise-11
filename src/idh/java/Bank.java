package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	HashMap<String, Account> accounts = new HashMap<String, Account>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			accounts.put(String.valueOf(i), new Account(String.valueOf(i), random.nextInt(1000)));
		}
		// accounts with custom account numbers
		accounts.put("1234@5678", new Account("1234@5678", random.nextInt(1000)));
		accounts.put("cat_haz_cash", new Account("cat_haz_cash", random.nextInt(1000)));
		accounts.put("💸", new Account("💸", random.nextInt(1000)));
	}

	@Override
	public Iterator<Account> iterator() {
		return accounts.values().iterator();
	}

	public Account getAccount(String number) {
		return accounts.get(number);
	}

}
