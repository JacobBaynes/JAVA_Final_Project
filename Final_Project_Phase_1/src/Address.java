/**
 * Created by Jacob Baynes 05/01/2018
 */

public class Address {

    // attributes
    private String street;
    private String city;
    private String state;
    private String zip;

    // Designated Constructor
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // Constructor that takes two parameters
    public Address(String state, String zip) {
        this (" ", "", state, zip);
    }

    // Default Constructor
    public Address(){
        this (" ", " ", "NC", "27282");
    }

    // Getter and Setter Methods
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    // toString Override method
    @Override
    public String toString() {
        return street + ' ' + city + ", " + state + ' ' + zip;
    }
}
