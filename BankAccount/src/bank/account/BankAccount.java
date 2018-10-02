package bank.account;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	private static double totalMoneySave = 0;
	private static int numberOfAccounts = 0;
	
	private void generateAccountNumber() {
		this.accountNumber = "";
		Random rand = new Random();
		for(int i = 1; i <= 10; i++) {
			this.accountNumber += rand.nextInt(9);
		}
		
		System.out.println("Your new Account Number: " + this.accountNumber);
	}
	
	public BankAccount() {
		this.generateAccountNumber();
		this.numberOfAccounts++;
	}
	
	public double getCheckingBalance() {
		return this.checkingBalance;
	}
	
	public double getSavingBalance() {
		return this.savingBalance;
	}
	
	public void deposit(String account, double amount) {
		if(account == "checking") {
			this.checkingBalance += amount;
			this.totalMoneySave += amount;
			System.out.println("You just deposit $"+amount + " into your Checking account ending #"+this.accountNumber);
			System.out.println("Your Checking Account Total Balance is now: $" + this.checkingBalance);
		}
		else if(account == "saving") {
			this.savingBalance += amount;
			this.totalMoneySave += amount;
			System.out.println("You just deposit $"+amount + " into your Saving account ending #"+this.accountNumber);
			System.out.println("Your Saving Account Total Balance is now: $" + this.savingBalance);
		}
		else {
			System.out.println("Wrong input; Please choose either your checking or saving!");
		}
	}
	
	
	public void withdraw(String account, double amount) {
		if(account == "checking") {
			if(this.checkingBalance > amount) {
				this.checkingBalance -= amount;
				this.totalMoneySave -= amount;
				System.out.println("You just withdraw $"+ amount + " from your Checking account ending #"+this.accountNumber);
				System.out.println("Your Checking Account Total Balance is now: $" + this.checkingBalance);
			}
			else {
				System.out.println("Your do not have sufficient balance for this withdraw transaction");
				System.out.println("Your Checking account current balance is: $" + this.checkingBalance);
			}
			
		}
		else if(account == "saving") {
			if(this.savingBalance > amount) {
				this.savingBalance -= amount;
				this.totalMoneySave -= amount;
				System.out.println("You just withdraw $"+ amount + " from your Saving account ending #"+this.accountNumber);
				System.out.println("Your Saving Account Total Balance is now: $" + this.savingBalance);
			}
			else {
				System.out.println("Your do not have sufficient balance for this withdraw transaction");
				System.out.println("Your Saving account current balance is: $" + this.savingBalance);
			}
		}
		else {
			System.out.println("Wrong input; Please choose either your checking or saving!");
		}
	}
	
	
	public void AccountInformation() {
		System.out.println("Account Number #" + this.accountNumber);
		System.out.println("Checking Account Balance $" + this.checkingBalance);
		System.out.println("Saving Account Balance  $" + this.savingBalance);
	}
	
	
	
	

	
	
}
