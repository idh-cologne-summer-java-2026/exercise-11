package idh.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ATM  {
	
	// initial cash in the ATM (Ich habe es auf 10000 erhöht, damit wir das 💸-Konto testen können!)
	int cash = 10000;

	Bank bank;
	
	public ATM(Bank bank) {
		this.bank = bank;
	}
	
	/**
	 * Main command loop of the ATM.
	 */
	public void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			try {
				System.out.print("Enter your account number: ");
				// Aufgabe 2: Wir lesen die Kontonummer als String ein!
				String accountNumber = br.readLine();
				
				System.out.print("Enter the amount to withdraw: ");
				// Der Betrag bleibt eine Zahl
				int amount = Integer.parseInt(br.readLine());
				
				cashout(accountNumber, amount);
			} catch (Exception e) {
				System.out.println("Invalid input. System shutting down.");
				break;
			}
		}
	}

	public void cashout(String accountNumber, int amount) {
		// check for cash in the ATM
		if (amount > cash) {
			System.out.println("Sorry, not enough cash left in the ATM.");
			return;
		}
		
		// check for existence of the account
		Account account = getAccount(accountNumber);
		if (account == null) {
			System.out.println("Sorry, this account doesn't exist.");
			return;
		}
		
		// check for balance of the account
		if (amount > account.getBalance()) {
			System.out.println("Sorry, you're out of money.");
			return;
		}
		
		// withdraw
		account.withdraw(amount);
		
		// Bugfix: Der Geldautomat verliert Geld, er bekommt keins dazu ;)
		cash -= amount; 
		System.out.println("Ok, here is your money, enjoy!");
	}

	/**
	 * Launches the ATM
	 */
	public static void main(String[] args) {
		Bank bank = new Bank();
		ATM atm = new ATM(bank);
		atm.run();
	}
	
	/**
	 * Retrieves the account given an id.
	 * * @param id
	 * @return
	 */
	protected Account getAccount(String id) {
		// Wir können jetzt ganz elegant die neue Methode der Bank nutzen!
		return bank.getAccount(id);
	}
}