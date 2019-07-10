/**
 * Created by Jacob Baynes 05/01/2018
 */

// Custom Exception
import java.security.PublicKey;

public class DuplicateCourseException extends Exception {
    public DuplicateCourseException() {
        this ("You've already enrolled in this course", new CourseSection());
    }
    public DuplicateCourseException(String message, CourseSection c) {
        super(message + " " + c.getSubject() + " " + c.getNumber());
    }
}
