package classes;

import java.util.ArrayList;

public class Branch {
	String name;
	private ArrayList<Customer> customers;
	
	public Branch(String branchName) {
		this.name = branchName;
		customers = new ArrayList<Customer>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void printCustomers() {
		for(Customer customer: customers) {
			System.out.println(customer.getName());
		}
	}
	
	public boolean addCustomer(String customerName) {
		if(findCustomer(customerName) == null) {
			this.customers.add(new Customer(customerName));
			return true;
		}
		return false;
	}
	
	public boolean addCustomerDeposit(String customerName, double amount) {
		Customer existingCustomer = findCustomer(customerName);
		if(existingCustomer != null) {
			existingCustomer.depositMoney(amount);
			return true;
		}
		return false;
	}
	
	public boolean addCustomerWithdraw(String customerName, double amount) {
		Customer existingCustomer = findCustomer(customerName);
		if(existingCustomer != null) {
			existingCustomer.withdrawMoney(amount);
			return true;
		}
		return false;
	}
	
	private Customer findCustomer(String customerName) {
		for(int i = 0; i < this.customers.size(); i++) {
			if(this.customers.get(i).getName().equals(customerName)) {
				return this.customers.get(i);
			}
		}
		return null;
	}
	
	public boolean customerInfo(String customerName) {
		Customer customer = findCustomer(customerName);
		if(customer != null) {
			customer.printCustomerStats();
			return true;
		}
		return false;
	}
	

}
