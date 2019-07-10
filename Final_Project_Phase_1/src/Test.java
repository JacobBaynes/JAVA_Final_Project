import javax.xml.crypto.Data;
import java.util.Scanner;

/**
 *  Program:    Final Project
 *  Author:     Jacob Baynes
 *  Date:       April 16, 2018
 *  Purpose:    This test program instantiates a Student and allows them to enroll in 5 courses.
 */

public class Test {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        // Instantiate student and assign user input to attributes
        Student s1 = new Student();

        System.out.print("Enter your first name: ");
        s1.setFirstName(input.nextLine());
        System.out.print("Enter your last name: ");
        s1.setLastName(input.nextLine());
        System.out.print("Enter student ID: ");
        s1.setId(input.nextLine());
        System.out.print("Enter street address: ");
        String street = input.nextLine();
        System.out.print("Enter city of address: ");
        String city = input.nextLine();
        System.out.print("Enter state of address: ");
        String state = input.nextLine();
        System.out.print("Enter zip code of address: ");
        String zip = input.nextLine();

        s1.setAddress(new Address(street, city, state, zip));

        // Create array and call getSections from Singleton to load it.
        DataStore dataStore = DataStore.getInstance();
        CourseSection[] courseMenu = DataStore.getSections();

        // While choice is not "0" a for loop displays each course as a menu for the user
        int choice = 1;
        while (choice > 0) {
            System.out.print("\n");
            for (int i = 0; i < courseMenu.length; i++) {
                System.out.println("(" + (i + 1) + "): " + courseMenu[i]);
            }
            // Prompt user to enter a number corresponding to the number for a course in the menu.
            System.out.print("\nEnter the number for the course you would like to enroll or enter '0' to quit: ");
            choice = Integer.parseInt(input.next());
            if (choice == 0) {
                break;  // Break from loop if user enters "0"
            }
            // Try adding chosen course to Student s1 courses.
            try {
                s1.addCourse(courseMenu[choice - 1]);
            } catch (TooManyCoursesException tm) {
                System.out.println(tm.getMessage());
            } catch (DuplicateCourseException tm) {
                System.out.println(tm.getMessage());
            }
        }
        // Display student information
        System.out.println(s1.toString());
    }

    }

