package idh.java;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.List;
import java.util.HashMap;



public class Bank implements Iterable<Account> {
	
	HashMap<String, Account> accounts = new HashMap<>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();

		accounts.put("46890",new Account("Mark", random.nextInt(1000)));
		accounts.put("306587",new Account("Peter", random.nextInt(1000)));
		accounts.put("05352",new Account("Lisa", random.nextInt(1000)));
		accounts.put("236272", new Account("cat_loves_💸", random.nextInt(1000)));
		accounts.put("i´m@🏠", new Account("i´m@🏠", random.nextInt(1000)));
	}
	
	@Override
	public Iterator<Account> iterator() {
		return accounts.values().iterator();
	}
	
	//gibt durch eingabe der Kontonummer Account aus der Hashmap zurück 
		public Account getAccount(String accNumber) {
			return accounts.get(accNumber);		
	}
		
		
}
