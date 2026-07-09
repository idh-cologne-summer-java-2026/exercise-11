package idh.java;

public class Account {
    int balance;
    // id ist jetzt ein string wegen der neuen text-kontonummern
    String id; 

    public Account(String id, int status) {
        this.id = id;
        this.balance = status;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int status) {
        this.balance = status;
    }
    
    public void withdraw(int sum) {
        this.balance = balance - sum;
    }
}