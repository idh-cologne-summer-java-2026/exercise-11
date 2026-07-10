package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	
	// Aufgabe 1: HashMap nutzen, um Accounts über ihre ID (String) schnell zu finden
	private HashMap<String, Account> accounts = new HashMap<>();

	public Bank() {
		Random random = new Random();
		
		// Generiere 5 Standard-Konten (IDs "0" bis "4")
		for (int i = 0; i < 5; i++) {
			String id = String.valueOf(i);
			accounts.put(id, new Account(id, random.nextInt(1000)));
		}
		
		// Aufgabe 2: Die neuen, verrückten Kontonummern für die Werbekampagne!
		accounts.put("1234@5678", new Account("1234@5678", 500));
		accounts.put("cat_haz_cash", new Account("cat_haz_cash", 1500));
		accounts.put("💸", new Account("💸", 9999)); // Jackpot!
	}
	
	@Override
	public Iterator<Account> iterator() {
		// Wir geben einfach den Iterator der HashMap-Werte zurück
		return accounts.values().iterator();
	}
	
	// Aufgabe 1 & 2: Account anhand des Strings in der HashMap finden
	public Account getAccount(String number) {
		return accounts.get(number);
	}
}