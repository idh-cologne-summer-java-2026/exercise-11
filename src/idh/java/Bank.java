package idh.java;


import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	public static HashMap<String, Account> accountmap = new HashMap<String, Account>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
			accountmap.put("N"+ i, accounts[i]);
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		for(String s : accountmap.keySet())
		{
			Account a = accountmap.get(s);
			if(number == a.getId())
				return a;
		}
		return null;
	}

}
