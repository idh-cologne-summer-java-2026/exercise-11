package idh.java;

import java.util.HashMap;
import java.util.Map;

import java.util.Random;

public class Bank {
	
	//	Map<Integer, Account> accounts = new HashMap<>();
	Map<String, Account> accounts = new HashMap<>();
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
			
			String key;
			switch (i) {
				case 0:
					key = "123456";	// Konto zum Testen
					break;
				case 1:
					key =  "1234@5678";
					break;
				case 2:
					key = "cat_haz_cash";
					break;
				case 3:
					key = "💸" ;	
					break;
				case 4:
					key = "🚀";
					break;
				case 6:
					key = "😀";	
					break;
				case 7:
					key = "🍕";	
					break;
				case 8:
					key = "🙈";	
					break;
				case 9:
					key = "💜";	
					break;
				default:
					key = Integer.toString(random.nextInt(10000000));
					while(accounts.containsKey(key)) {	// Falls der key schon vorhanden ist
						key = Integer.toString(random.nextInt(10000000)); 
					};
					break;
			};
			
			accounts.put(key, value);
		}
	}
	
	//public Account getAccount(int number) {
	public Account getAccount(String number) {
		return accounts.get(number);
	}

}