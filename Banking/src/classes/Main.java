package classes;

public class Main {

	public static void main(String[] args) {
		Bank newBank = new Bank("New Bank");
		newBank.addBranch("Frederick");
		newBank.addCustomer("Frederick", "James Pell");
		newBank.addCustomerDeposit("Frederick", "James Pell", 25.00);
		newBank.customerLookup("Frederick", "James Pell");
		newBank.addCustomer("Frederick", "Warren Smith");
		newBank.addCustomerDeposit("Frederick", "Warren Smith", 53.00);
		newBank.addCustomerDeposit("Frederick", "Warren Smith", 64.00);
		newBank.addCustomerWithdraw("Frederick", "Warren Smith", 22.00);
		newBank.customerLookup("Frederick", "Warren Smith");
		

	}


}
