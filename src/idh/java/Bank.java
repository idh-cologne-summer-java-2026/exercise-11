package idh.java;
import java.util.HashMap;

/* 	1. 	Array substituted with HashMap [Exercise 1]
	2. 	Key data type String instead of int in order
		to provide for weird account identifiers [Exercise 2]*/
public class Bank {	
	
	HashMap<String, Account> accounts = new HashMap<>();

	/* Creation of weird (= non integer) account identifiers by means of 
	 * the put method (i.e. the setter equivalent for hash maps) [Exercise 2] 
	 * */
	public Bank() {
		accounts.put("1234@5678", new Account("1234@5678", 1000));
		accounts.put("cat_haz_cash", new Account("cat_haz_cash", 500));
		accounts.put("💸", new Account("💸", 777));
	}
	
	/* Method for the retrieval of the account identifier (= hash key) [Excercise 1] 
	 * Note that: 
	 * 1. no iterator is necessary when using the get method of the hash map interface
	 * 2. no explicit null-pointer exception handling is necessary (as far as the getter 
	 * method itself is concerned), since hash-map-get automatically returns null, if 
	 * the map does not contain the specified key  */
	public Account getAccount(String number) {
		return accounts.get(number);
	}
}
	

