package Banking;

public class CheckingAccount extends BankAccount{
//	Interest Rate attribute
	
	double interestRate = 0.05;
	
	public void displayAccount() {
		super.accountSummary();
		System.out.println("Interest Rate: " + interestRate + "\n");
	}
	
	public void processWithdrawal() { 
		balance -= 30;
		System.out.println(balance + " An overdraft fee has been accessed.");
	}
	
	public void withdrawal(double w) {
		balance -= w;
		if (balance < 0) {
			processWithdrawal();
		}
	}
}
