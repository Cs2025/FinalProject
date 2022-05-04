
public class ExampleEmployees5 {

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
		Employee[] e = new Employee[3];
		e[0] = new Employee(1, 10000, "Peter", "Esposito",
				"peter.esposito@sunydutchess.edu");
		e[1] = new Employee(2, 10001, "Akram", "Gafur",
				"akram.gafur@sunydutchess.edu");
		e[2] = new Employee(3, 10010, "Caleb", "Herrera",
				"caleb.herrera@sunydutchess.edu");

		for (int n = 0; n < e.length; n++) {
			System.out.println("Initials: " + e[n].getInitials());
		}

	}

}
