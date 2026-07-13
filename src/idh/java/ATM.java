package idh.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ATM {

    // initial cash in the ATM
    int cash = 100;

    Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.print("Enter your account number: ");
                String accountNumber = br.readLine();

                System.out.print("Enter the amount to withdraw: ");
                int amount = Integer.parseInt(br.readLine());

                cashout(accountNumber, amount);
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public void cashout(String accountNumber, int amount) {

        if (amount > cash) {
            System.out.println("Sorry, not enough cash left.");
            return;
        }

        Account account = getAccount(accountNumber);
        if (account == null) {
            System.out.println("Sorry, this account doesn't exist.");
            return;
        }

        if (amount > account.getBalance()) {
            System.out.println("Sorry, you're out of money.");
            return;
        }

        account.withdraw(amount);
        cash += amount;
        System.out.println("Ok, here is your money, enjoy!");
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        ATM atm = new ATM(bank);
        atm.run();
    }

    protected Account getAccount(String id) {
        return bank.getAccount(id);
    }
}