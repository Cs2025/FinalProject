import java.util.ArrayList;

/**
 * 
 * Christopher Shenton
 * Professor Tankeh
 * CPS III
 * This is the main class to demonstrate the Bank class
 * using the nine examples from class.
 *
 */
public class Test {

	public static void main(String[] args) {

	//Run the nine examples from class, demonstrating deposit, withdraw, etc. methods
		
	example1();
	example2();
	example3();
	example4();
	example5();
	example6();
	example7();
	example8();
	example9();
	
	}

	private static void example1() {

		//Example 1

		Bank emp = new Bank();
		emp.setEmployeeNo(4);
		emp.setAccountNo(10010);
		emp.setFirstName("Christopher");
		emp.setLastName("Shenton");
		emp.setEmailAddress("christopher.shenton@sunydutchess.edu");

		System.out.println(String.format(
				"Employee#: %d, Account#: %d, Name: %s %s, Email: %s",
				emp.getEmployeeNo(), emp.getAccountNo(), emp.getFirstName(),
				emp.getLastName(), emp.getEmailAddress()));
	}

	private static void example2() {
		
		//Example 2
		
		Bank emp = new Bank(4, 10111, "Christopher", "Shenton",
				"christopher.shenton@sunydutchess.edu");

		System.out.println(String.format(
				"Employee#: %d, Account#: %d, Name: %s %s, Email: %s",
				emp.getEmployeeNo(), emp.getAccountNo(), emp.getFirstName(),
				emp.getLastName(), emp.getEmailAddress()));

	}

	private static void example3() {
		
		//Example 3
		
		Bank emp1, emp2;

		emp1 = new Bank(4, 10111, "Christopher", "Shenton",
				"christopher.shenton@sunydutchess.edu");
		System.out.println(String.format(
				"Employee#: %d, Account#: %d, Name: %s %s, Email: %s",
				emp1.getEmployeeNo(), emp1.getAccountNo(), emp1.getFirstName(),
				emp1.getLastName(), emp1.getEmailAddress()));

		emp2 = new Bank(2, 10001, "Akram", "Gafur",
				"akram.gafur@sunydutchess.edu");

		System.out.println(String.format(
				"Employee#: %d, Account#: %d, Name: %s %s, Email: %s",
				emp2.getEmployeeNo(), emp2.getAccountNo(), emp2.getFirstName(),
				emp2.getLastName(), emp2.getEmailAddress()));

	}

	private static void example4() {

		//Example 4
		
		Bank emp1;

		emp1 = new Bank(4, 10111, "Christopher", "Shenton",
				"christopher.shenton@sunydutchess.edu");
		System.out.println("Initials: " + emp1.getInitials());

	}

	private static void example5() {
	
		//Example 5
		
		Bank[] e = new Bank[3];
		e[0] = new Bank(4, 10111, "Christopher", "Shenton",
				"christopher.shenton@sunydutchess.edu");
		e[1] = new Bank(2, 10001, "Akram", "Gafur",
				"akram.gafur@sunydutchess.edu");
		e[2] = new Bank(3, 10010, "Caleb", "Herrera",
				"caleb.herrera@sunydutchess.edu");

		for (int n = 0; n < e.length; n++) {
			System.out.println("Initials: " + e[n].getInitials());
		}

	}

	private static void example6() {

		//Example 6
		
		Bank e1, e2;
		e1 = new Bank(4, 10111, "Christopher", "Shenton",
				"christopher.shenton@sunydutchess.edu");
		e2 = new Bank(1, 10000, "Peter", "Esposito",
				"peter.esposito@sunydutchess.edu");

		if (e1 == e2) {
			System.out.println("The two employees are the same.");
		} else {
			System.out.println("The two employees are different.");
		}

	}

	private static void example7() {
	
		//Example 7
		
		Bank e1, e2;
		e1 = new Bank(4, 10111, "Christopher", "Shenton",
				"christopher.shenton@sunydutchess.edu");
		e2 = new Bank(1, 10000, "Peter", "Esposito",
				"peter.esposito@sunydutchess.edu");

		if (e1.equals(e2)) {
			System.out.println("The two employees are the same.");
		} else {
			System.out.println("The two employees are different.");
		}

	}

	private static void example8() {
		
		//Example 8
		
		Bank e1, e2;
		e1 = new Bank(4, 10111, "Christopher", "Shenton",
				"christopher.shenton@sunydutchess.edu");
		e2 = new Bank(2, 10001, "Akram", "Gafur",
				"akram.gafur@sunydutchess.edu");
		e1.setEmployer("Dutchess Community College");

		System.out.println("The Employer of " + e1.getFirstName() + " "
				+ e1.getLastName() + " is " + e1.getEmployer());
		System.out.println("The Employer of " + e2.getFirstName() + " "
				+ e2.getLastName() + " is " + e2.getEmployer());
	}

	private static void example9() {
		
		//Example 9
		
		ArrayList<Bank> employees = new ArrayList<Bank>();
		// Employee info below;
		employees.add(new Bank(employees.size() + 1, 10000, "Peter",
				"Esposito", "peter.esposito@sunydutchess.edu", 200.25));
		employees.add(new Bank(employees.size() + 1, 10001, "Akram",
				"Gafur", "akram.gafur@sunydutchess.edu", 300.23));
		employees.add(new Bank(employees.size() + 1, 10010, "Caleb",
				"Herrera", "caleb.herrera@sunydutchess.edu", 1000.3));
		employees.add(new Bank(employees.size() + 1, 10100, "Viridiana",
				"Marin Herrera", "viridiana.herrera@sunydutchess.edu", 1200.4));
		employees.add(new Bank(employees.size() + 1, 10101, "Brandon",
				"Mohammed", "brandon.mohammed@sunydutchess.edu", 674.32));
		employees.add(new Bank(employees.size() + 1, 10111,
				"Christopher", "Shenton",
				"christopher.shenton@sunydutchess.edu", 934.2));
		employees.add(new Bank(employees.size() + 1, 11000, "Lucas",
				"Stoffel", "lucas.stoffel@sunydutchess.edu", 154.32));
		employees.add(new Bank(employees.size() + 1, 11001, "Appolo",
				"Tankeh", "appolo.tankeh@sunydutchess.edu", 500.32));

		// Print employee info
		System.out.println("Employee List:\n" + employees);

		// Create a new employee
		Bank newEmployee = new Bank(employees.size() + 1, 10111,
				"Christopher", "Shenton", "christopher.shenton@sunydutchess.edu", 100);
		employees.add(newEmployee);
		System.out.println("New Employee:\n" + newEmployee);

		// Print the list of employees, the highest and second highest balances.
		System.out.println("Employee List:\n" + employees);
		System.out.println("Highest Balance:\n"
				+ employees.get(getHighestBalanceIndex(employees)));
		System.out.println("Second Highest Balance:\n"
				+ employees.get(getSecondHighestBalanceIndex(employees)));

		// deposit $500 to the account at index 1.
		employees.get(1).deposit(500.0);

		// print the list of employees, the highest and second highest balances.
		System.out.println("Employee List:\n" + employees);
		System.out.println("Highest Balance:\n"
				+ employees.get(getHighestBalanceIndex(employees)));
		System.out.println("Second Highest Balance:\n"
				+ employees.get(getSecondHighestBalanceIndex(employees)));

		employees.get(3).withdraw(300.0);

		// print the list of employees, the highest and second highest balances.
		System.out.println("Employee List:\n" + employees);
		System.out.println("Highest Balance:\n"
				+ employees.get(getHighestBalanceIndex(employees)));
		System.out.println("Second Highest Balance:\n"
				+ employees.get(getSecondHighestBalanceIndex(employees)));
	}

	/**
	 * This searches the input array for the highest value, then returns the
	 * index of the value in the array.
	 * 
	 */
	private static int getHighestBalanceIndex(Bank[] balances) {
		double bal = 0;
		int index = -1;
		for (int n = 0; n < balances.length; n++) {
			if (balances[n].getBalance() > bal) {
				bal = balances[n].getBalance();
				index = n;
			}
		}
		return index;
	}

	/**
	 * This searches the input array for the second highest value, then returns
	 * the index of the value in the array.
	 * 
	 */
	
	private static int getSecondHighestBalanceIndex(Bank[] balances) {
		int highestBalance = getHighestBalanceIndex(balances);
		double bal = 0;
		int index = -1;
		for (int n = 0; n < balances.length; n++) {
			if (balances[n].getBalance() > bal && n != highestBalance) {
				bal = balances[n].getBalance();
				index = n;
			}
		}
		return index;
	}

	/**
	 * This searches the input ArrayList for the highest value, then returns the
	 * index of the value in the ArrayList.
	 * 
	 */
	private static int getHighestBalanceIndex(
			ArrayList<Bank> balances) {
		double bal = 0;
		int index = -1;
		for (int n = 0; n < balances.size(); n++) {
			if (balances.get(n).getBalance() > bal) {
				bal = balances.get(n).getBalance();
				index = n;
			}
		}
		return index;
	}

	/**
	 * This searches the input ArrayList for the second highest value, then
	 * returns the index of the value in the ArrayList.
	 * 
	 */
	private static int getSecondHighestBalanceIndex(
			ArrayList<Bank> balances) {
		int highestBalance = getHighestBalanceIndex(balances);
		double bal = 0;
		int index = -1;
		for (int n = 0; n < balances.size(); n++) {
			if (balances.get(n).getBalance() > bal && n != highestBalance) {
				bal = balances.get(n).getBalance();
				index = n;
			}
		}
		return index;
	}

}
