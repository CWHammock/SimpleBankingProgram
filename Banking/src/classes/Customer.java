package classes;

import java.util.ArrayList;

public class Customer {
	private static int accountCounter = 1;
	private ArrayList<Double> transactions;
	private int accountNumber;
	private String name;
	private double accountBalance;
	
	public Customer(String name) {
		super();
		this.name = name;
		this.accountNumber = accountCounter;
		this.accountBalance = 0;
		transactions = new ArrayList<Double>();
		accountCounter++;
	}

	public String getName() {
		return name;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void depositMoney(double depositAmount) {
		this.accountBalance += depositAmount;
		transactions.add(new Double(depositAmount));
	}
	
	public void withdrawMoney(double withdrawAmount) {
		if ((this.accountBalance -= withdrawAmount) < 0.0) {
			System.out.println("Not enough money to withdraw...");
		}else {
			this.accountBalance -= withdrawAmount;
			transactions.add(new Double(-withdrawAmount));
		}
		
	}
	
	public void printCustomerStats() {
		System.out.println("---Customer Info---");
		System.out.println("Name: " + getName());
		System.out.println("Balance: " + getAccountBalance());
		System.out.println("Account #: " + getAccountNumber());
		System.out.print("Transactions: ");
		for(Double transaction: transactions) {
			System.out.print(transaction.toString() + " ");
		}
		System.out.print("\n");
	}
	

}
