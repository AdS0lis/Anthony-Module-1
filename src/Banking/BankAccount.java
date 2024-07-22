package Banking;

public class BankAccount {
//	Instance fields
	String firstName;
	String lastName;
	int accountID;
	double balance;
	
//	constructor
	public BankAccount() {
		balance = 0;
	}
	
//	Deposit method
	public void deposit(double d) { 
		balance += d;
	}
	
//	Withdraw method
	public void withdrawal(double w) {
		balance -= w;
	}
	
//	Setters and Getters
	public void setFirstName(String f) {
		firstName = f;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String l) {
		lastName = l;
	}
	public String getLastName() {
		return lastName;
	}
	public void setAccountID(int ID) {
		accountID = ID;
	}
	public int getAccountID() {
		return accountID;
	}
	public double getBalance() {
		return balance;
	}
	
	public void accountSummary() {
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Account ID: " + accountID);
		System.out.println("Balance: $" + balance);
	}
	
	

}
