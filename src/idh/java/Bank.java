package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
    
    // aufgabe 1: hashmap statt array
    HashMap<String, Account> accounts = new HashMap<>();

    public Bank() {
        Random random = new Random();
        
        // aufgabe 2: konten direkt mit den neuen werbekampagnen-ids anlegen
        accounts.put("1234@5678", new Account("1234@5678", random.nextInt(1000)));
        accounts.put("cat_haz_cash", new Account("cat_haz_cash", random.nextInt(1000)));
        accounts.put("💸", new Account("💸", random.nextInt(1000)));
    }
    
    @Override
    public Iterator<Account> iterator() {
        // hashmap hat eh einen eigenen iterator, spart uns die extra klasse
        return accounts.values().iterator();
    }
    
    public Account getAccount(String number) {
        // direkt über den key ziehen
        return accounts.get(number);
    }
}