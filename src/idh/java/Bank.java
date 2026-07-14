package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {
	private Map<String, Account> accounts = new HashMap<>();

	public Bank() {
		Random random = new Random();
		accounts.put("1234@5678", new Account("1234@5678", random.nextInt(1000)));
		accounts.put("cat_haz_cash", new Account("cat_haz_cash", random.nextInt(1000)));
		accounts.put("💸", new Account("💸", random.nextInt(1000)));
		for (int i = 3; i < 5; i++) {
			String id = "user-" + i;
			accounts.put(id, new Account(id, random.nextInt(1000)));
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return accounts.values().iterator();
	}
	
	public Account getAccount(String number) {
		return accounts.get(number);
	}

	public Account createAccount(String id, int balance) {
		if (accounts.containsKey(id)) return null;
		Account account = new Account(id, balance);
		accounts.put(id, account);
		return account;
	}

}
