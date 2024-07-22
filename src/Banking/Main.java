package Banking;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount a = new BankAccount();
		a.setFirstName("Gary");
		a.setLastName("Shell");
		a.setAccountID(1050);
		a.deposit(50.35);
		
		a.accountSummary();
		System.out.println("");
		
		a.withdrawal(20);
		a.accountSummary();
		System.out.println("");
		
		CheckingAccount b = new CheckingAccount();
		b.setFirstName("Spongebob");
		b.setLastName("Square Pants");
		b.setAccountID(1051);
		b.displayAccount();
		b.withdrawal(20);
	}

}
