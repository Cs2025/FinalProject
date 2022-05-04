
public class ExampleEmployees3 {

	public static void main(String[] args) {
		// This is the data that we are using for employees.
		// Index Account_no First_Name Last_Name Email Address
		// 1 10000 Peter Esposito peter.esposito@sunydutchess.edu
		// 2 10001 Akram Gafur akram.gafur@sunydutchess.edu
		// 3 10010 Caleb Herrera caleb.herrera@sunydutchess.edu
		// 4 10011 John Maksuta john.maksuta@sunydutchess.edu
		// 5 10100 Viridiana Marin Herrera viridiana.herrera@sunydutchess.edu
		// 6 10101 Brandon Mohammed brandon.mohammed@sunydutchess.edu
		// 7 10111 Christopher Shenton christopher.shenton@sunydutchess.edu
		// 8 11000 Lucas Stoffel lucas.stoffel@sunydutchess.edu
		// 9 11001 Appolo Tankeh appolo.tankeh@sunydutchess.edu
		Employee emp1, emp2;

		emp1 = new Employee(1, 10000, "Peter", "Esposito",
				"peter.esposito@sunydutchess.edu");
		System.out.println(String.format(
				"Employee#: %d, Account#: %d, Name: %s %s, Email: %s",
				emp1.getEmployeeNo(), emp1.getAccountNo(), emp1.getFirstName(),
				emp1.getLastName(), emp1.getEmailAddress()));

		emp2 = new Employee(2, 10001, "Akram", "Gafur",
				"akram.gafur@sunydutchess.edu");

		System.out.println(String.format(
				"Employee#: %d, Account#: %d, Name: %s %s, Email: %s",
				emp2.getEmployeeNo(), emp2.getAccountNo(), emp2.getFirstName(),
				emp2.getLastName(), emp2.getEmailAddress()));

	}

}
