/**
 * Created by Jacob Baynes 05/01/2018
 */
// Custom exception
public class TooManyCoursesException extends Exception {

    public TooManyCoursesException() {
        this ("You're trying to enroll in too many sections");

    }
    public TooManyCoursesException(String message) {
        super(message);
    }
}
