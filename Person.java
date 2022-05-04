/**
 * 
 * Christopher Shenton
 * Professor Tankeh
 * CPS III
 * This is the base (parent) class for the Employee class.
 *
 */
public class Person {

	/**
	 * This is the first name of the person.
	 */
	private String firstName;

	/**
	 * This is the last name of the person.
	 */
	private String lastName;

	/**
	 * Gets the first name.
	 * 
	 */
	
	/**
	 * 
	 *Below are the getters and setters for firstName and lastName fields
	 *
	 */
	
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 * 
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 * 
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 * 
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * This is the default constructor for the Person class.
	 */
	public Person() {
		super();
		this.firstName = "";
		this.lastName = "";
		// System.out.println("(1) Person's no arg constructor is invoked");
	}

}
