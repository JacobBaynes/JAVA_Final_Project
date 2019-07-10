/**
 * Created by Jacob Baynes 05/01/2018
 */

public class Course {

    // Attributes
    String subject;
    String number;
    String name;

    // Designated Constructor
    Course(String subject, String number, String name) {
        this.subject = subject;
        this.number = number;
        this.name = name;

    }

    // Default Constructor
    Course() {
    }


    // Getter and Setter methods
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString Override method
    @Override
    public String toString() {
        return  name + ' ' + subject + '_' + number + ' ';
    }
}
