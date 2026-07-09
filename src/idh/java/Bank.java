package idh.java;
import java.util.HashMap;

import java.util.Iterator;
import java.util.Random;

public class Bank  {
	HashMap<String, Account> accounts = new HashMap<String, Account>();

	public Bank() {
		accounts.put("1234@5678", new Account ("1234@5678",555));
		accounts.put("cat_haz_cash", new Account ("cat_haz_cash",50));
		accounts.put("💸",new Account ("💸", 1000));
	}

	public Account getAccount(String number) {
		return accounts.get(number);
	}

}
