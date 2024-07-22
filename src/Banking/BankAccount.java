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
	public void withdraw(double w) {
		balance -= w;
	}
//	Setters and Getters
	public void setFirstName(String f) {
		firstName = f;
	}
	public String getFirstName() {
		return firstName;
	}

}
