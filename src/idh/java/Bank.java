package idh.java;


import java.util.HashMap;

public class Bank{
	HashMap<String, Account> accounts = new HashMap<String, Account>();

	public Bank() {
		accounts.put("1234@5678", new Account("1234@5678", 300));
		accounts.put("cat_haz_cash", new Account("cat_haz_cash", 2000));
		accounts.put("💸", new Account("💸", 1000));
	} 
	
	
	public Account getAccount(String number) {
		return accounts.get(number);
	}

}