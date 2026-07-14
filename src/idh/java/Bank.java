package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	private final Account[] accounts = new Account[5];
	private final HashMap<String, Account> accountsByNumber = new HashMap<>();

	public Bank() {
		// create accounts with varying balances and allow symbolic account numbers
		Random random = new Random();
		String[] initialAccountNumbers = {"0", "1234@5678", "cat_haz_cash", "💸", "4"};
		for (int i = 0; i < accounts.length; i++) {
			String accountNumber = initialAccountNumbers[i];
			Account account = new Account(accountNumber, random.nextInt(1000));
			accounts[i] = account;
			accountsByNumber.put(account.getId(), account);
		}
	}

	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}

	public Account getAccount(String number) {
		return accountsByNumber.get(number);
	}

	public Account getAccount(int number) {
		return getAccount(Integer.toString(number));
	}
}
