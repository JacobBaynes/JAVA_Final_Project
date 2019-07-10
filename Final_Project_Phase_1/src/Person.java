/**
 * Created by Jacob Baynes 05/01/2018
 */

public class Person {

    // Attributes
    private String firstName;
    private String lastName;
    private Address address;

    public  Person() {

    }
    // Constructor with two parameters
    public  Person(String firstName, String lastName) {
        this(firstName, lastName, new Address());
    }

    // Designated Constructor
    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Getter and Setter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // toString Override method
    @Override
    public String toString() {
        return "\n" + firstName + ' ' + lastName + "\nAddress: " + address + '\n';
    }
}
