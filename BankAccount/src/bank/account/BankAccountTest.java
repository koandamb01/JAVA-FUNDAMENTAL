package bank.account;

public class BankAccountTest {
	public static void main(String[] args) {
		
		BankAccount mybank = new BankAccount();
		
		
		mybank.AccountInformation();
		System.out.println("-------------------");
		mybank.deposit("checking", 300);
		System.out.println("-------------------");
		mybank.deposit("saving", 500);
		System.out.println("-------------------");
		mybank.withdraw("checking", 150);
		
		mybank.AccountInformation();
		
	}
}
