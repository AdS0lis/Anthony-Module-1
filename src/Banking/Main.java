package Banking;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount a = new BankAccount();
		a.setFirstName("Gary");
		a.setLastName("Shell");
		a.setAccountID(1050);
		a.deposit(50.35);
		
		BankAccount b = new BankAccount();
		b.setFirstName(a.getFirstName());
		
		a.accountSummary();
		
		a.withdraw(20);
		a.accountSummary();
		System.out.println("b: " + b.getFirstName());
	}

}
