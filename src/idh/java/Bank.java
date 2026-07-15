package idh.java;


import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;

public class Bank implements Iterable<Account> {
	//to maintain the fixed size of 5 even though we now use a dynamic data structure
	int placeHolderSize = 5;
	Account[] accts = new Account[placeHolderSize];
	HashMap<String, Account> accounts = new HashMap<>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < placeHolderSize; i++) {
			accounts.put(Integer.toString(i), new Account(Integer.toString(i), random.nextInt(1000)));
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accts);
	}
	
	public Account getAccount(String number) {
		return accounts.get(number);
	}
}
