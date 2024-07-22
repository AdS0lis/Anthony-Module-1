package Banking;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount a = new BankAccount();
		a.setFirstName("Gary");
		
		BankAccount b = new BankAccount();
		b.setFirstName(a.getFirstName());
		
		System.out.println("a: " + a.getFirstName());
		System.out.println("b: " + b.getFirstName());
	}

}
