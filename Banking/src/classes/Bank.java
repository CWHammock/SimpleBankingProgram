package classes;

import java.util.ArrayList;

public class Bank {
	
	String name;
	private ArrayList<Branch> branches;
	
	public Bank(String name) {
		branches = new ArrayList<Branch>();
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean addBranch(String branchName) {
		if((findBranch(branchName)) == null) {
			branches.add(new Branch(branchName));
			return true;
		}else {
			return false;
		}
	}
	
	public boolean addCustomer(String branchName, String customerName) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.addCustomer(customerName);
		}
		return false;
	}
	
	public boolean addCustomerDeposit(String branchName, String customerName, double amount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.addCustomerDeposit(customerName, amount);
		}
		return false;
	}
	
	public boolean addCustomerWithdraw(String branchName, String customerName, double amount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.addCustomerWithdraw(customerName, amount);
		}
		return false;
	}
	
	private Branch findBranch(String branchName) {
		for(int i = 0;i < this.branches.size();i++) {
			if (this.branches.get(i).getName().equals(branchName)) {
				return this.branches.get(i);
			}
		}
		return null;
	}
	
	public boolean customerLookup(String branchName, String customerName) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			branch.customerInfo(customerName);
			return true;
		}
		return false;
	}

}
