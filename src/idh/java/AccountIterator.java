package idh.java;

import java.util.HashMap;
import java.util.Iterator;

class AccountIterator implements Iterator<Account> {

    private Iterator<Account> iterator;

    public AccountIterator(HashMap<Integer, Account> accounts) {
        this.iterator = accounts.values().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Account next() {
        return iterator.next();
    }

}