package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	HashMap<String, Account> map = new HashMap<String, Account>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();

		accounts[0] = new Account("1234@5678", random.nextInt(1000));
        accounts[1] = new Account("cat_haz_cash", random.nextInt(1000));
        accounts[2] = new Account("💸", random.nextInt(1000));
       


		for (int i = 0; i < accounts.length; i++) {
			
			 map.put(accounts[i].getId(), accounts[i]);
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(String number) {
		
		return map.get(number);
	}

}
