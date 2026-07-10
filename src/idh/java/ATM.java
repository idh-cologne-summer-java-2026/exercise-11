package idh.java;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Note: Data type of account identifier changed from int to String
 * throughout this class [Exercise 2]  
 */
public class ATM  {
	
	// initial cash in the ATM
	int cash = 2000;

	Bank bank;
	
	public ATM(Bank bank) {
		this.bank = bank;
	}
	
	/**
	 * Main command loop of the ATM Asks the user to enter a number, and passes this
	 * number to the function cashout(...) which actually does the calculation and
	 * produces money.  If the user enters anything else than an integer number, the
	 * loop breaks and the program exits */ 
	/* Note that 
	 * 1. with the changes applied in order to allow for ("weird") String account 
	 * identifiers the loop does of course no longer break, when non-integer values
	 * are entered [Excercise 2].
	 * 2. it has however been changed to break as soon as the ATM is empty; a solution
	 * suggesting itself as a consequence of the conversion of the original additive 
	 * refill logic of the main loop int a more natural subtractive logic (see below).     
	 */
	public void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			while (cash > 0) {
			try {
				System.out.print("Enter your account number: ");
				String accountNumber = br.readLine(); 
				// integer parser deleted in order to allow for ("weird") String account identifiers 
				System.out.print("Enter the amount to withdraw: ");
				int amount = Integer.parseInt(br.readLine()); 
				cashout(accountNumber, amount);
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		} System.out.println("ATM out of cash. Please try again later!");
			break;
	}
	}
		
	public void cashout(String id, int amount) {
		// check for cash in the ATM
		if (amount > cash) {
			System.out.println("Sorry, not enough cash left.");
			return;
		}
		
		// check for existence of the account	
		Account account = getAccount(id);
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
		/* loop logic changed from a magic refill procedure (+=)
		 * to a more realistic subtraction procedure (-=) */
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
	 * 
	 * @param id
	 * @return
	 */
	/* 
	 * Iterator deleted, since the structure of a hash map and the
	 * methods of its respective interface render iteration unnecessary.
	 * 
	 * Note that, contrary to what one might think, it does not seem to be necessary 
	 * to previously check by means of containsKey, whether the key is actually an element
	 * of the map to prevent null-pointer exceptions, since the hash-map-getter 
	 * called by this getAccount method automatically returns null in those cases. 
	 * Thus non-existence of the key doesn't pose a problem, as long as the null case 
	 * gets handled further on in the statement chain (as it does here, in effect, by the 
	 * cashout method).   
	 */
	protected Account getAccount(String id) {
		return bank.getAccount(id);
	}
}
