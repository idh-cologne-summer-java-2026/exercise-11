package idh.java;

import java.util.HashMap;
import java.util.Map;

import java.util.Random;

public class Bank {
	
	Map<Integer, Account> accounts = new HashMap<>();
	int numberOfAccounts = 1000;
	
	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < numberOfAccounts; i++) {
			/* nextInt(Grenzwert)
			 * Gibt einen Zufallswert von 0 (inklusive) bis zum angegebenen Grenzwert (ausschließlich) zurück.
			 */
			int balance = random.nextInt(1000);
			Account value = new Account(i, balance);
			
			Integer key;
			if( i == 0) {
				key = 123456;	// Konto zum Testen
			} else {
				key = random.nextInt(10000000);
				while(accounts.containsKey(key)) {	// Falls der key schon vorhanden ist
					key = random.nextInt(10000000); 
				}
			}				

			accounts.put(key, value);
		}
	}
	
	public Account getAccount(int number) {
		return accounts.get(number);
	}

}