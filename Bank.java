/**
 * 
 * Christopher Shenton
 * Professor Tankeh
 * CPS III
 * This class extends the Employee class and has a BankAccount field 
 * which allows us to call the deposit and withdraw methods
 *
 */
public class Bank extends Employee {

	private BankAccount bankAccount;

	/**
	 * Gets the instance of the BankAccount.
	 * @return - an instance of the BankAccount.
	 */
	public BankAccount getBankAccount() {
		return bankAccount;
	}

	/**
	 * Sets the instance of the BankAccount.
	 * @param bankAccount - The instance of the BankAccount to set.
	 */
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public double getBalance() {
		return this.bankAccount.getBalance();
	}

	public Bank() {
		super();
		this.bankAccount = new BankAccount(0);
	}

	public Bank(int employeeNumber, int accountNumber, String firstName,
			String lastName, String emailAddress, double initialCapital) {
		super(employeeNumber, accountNumber, firstName, lastName, emailAddress,
				initialCapital);
		this.bankAccount = new BankAccount(initialCapital);
	}

	public Bank(int employeeNumber, int accountNumber, String firstName,
			String lastName, String emailAddress) {
		super(employeeNumber, accountNumber, firstName, lastName, emailAddress);
		this.bankAccount = new BankAccount(this.getInitialCapital());
	}

	public Bank(String s) {
		super(s);
		this.bankAccount = new BankAccount(this.getInitialCapital());
	}

	/**
	 * This method deposits money from the employeeBank's BankAccount.
	 * 
	 * @param amount
	 *            - The amount to withdraw.
	 */
	public void deposit(double amount) {
		System.out.println(String.format("Depositing $%.2f to Act# %d\n",
				amount, this.getAccountNo()));
		this.bankAccount.deposit(amount);
	}

	/**
	 * This method deposits money from the employeeBank's BankAccount.
	 * 
	 * @param amount
	 *            - The amount to withdraw.
	 */
	public void deposit(String amount) {
		System.out.println(String.format("Depositing $%.2f to Act# %d\n",
				amount, this.getAccountNo()));
		this.bankAccount.deposit(amount);
	}

	/**
	 * This method withdraws money from the employeeBank's BankAccount.
	 * 
	 * @param amount
	 *            - The amount to withdraw.
	 */
	public void withdraw(double amount) {
		System.out.println(String.format("Withdrawing $%.2f from Act# %d\n",
				amount, this.getAccountNo()));
		this.bankAccount.withdraw(amount);
	}

	/**
	 * This method withdraws money from the employeeBank's BankAccount.
	 * 
	 * @param amount
	 *            - The amount to withdraw.
	 */
	public void withdraw(String amount) {
		System.out.println(String.format("Withdrawing $%.2f from Act# %d\n",
				amount, this.getAccountNo()));
		this.bankAccount.withdraw(amount);
	}

	@Override
	public String toString() {
		return String.format(
				"Employee#: %d, Account#: %d, Name: %s %s, Email: %s, Balance: $%.2f",
				this.getEmployeeNo(), this.getAccountNo(), this.getFirstName(),
				this.getLastName(), this.getEmailAddress(),
				this.bankAccount.getBalance()) + "\n";
	}
}
