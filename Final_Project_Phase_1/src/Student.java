/**
 * Created by Jacob Baynes 05/01/2018
 */

import java.util.Arrays;

public class Student extends Person {

    // Attributes
    String id;
    CourseSection [] sections = new CourseSection[5];

    int numberEnrolled = 0;

    public Student() {
        this("0000");
    }
    // Designated Constructor
    public Student (String id) {
        this.id = id;
        for (int i = 0; i < sections.length; i++) {
            sections[i] = new CourseSection();
        }
    }


    // Getter and Setter methods
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Add course method
    public void addCourse(CourseSection cs) throws TooManyCoursesException, DuplicateCourseException {

        try {
            for (int i = 0; i < numberEnrolled; i++) {
                if (sections[i].getSubject().equals(cs.getSubject()) &&
                        sections[i].getNumber().equals(cs.getNumber())) {
                    throw new DuplicateCourseException("Duplicate Course Enrollment: ", cs);
                }
            }
            sections[numberEnrolled] = cs;
            numberEnrolled++;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new TooManyCoursesException();
        }
    }

    // toString Override method
    @Override
    public String toString() {
        return  super.toString() +
                "Student ID: " + id + '\n' + '\n' +
                "Course 1: " + sections[0] + '\n' +
                "Course 2: " + sections[1] + '\n' +
                "Course 3: " + sections[2] + '\n' +
                "Course 4: " + sections[3] + '\n' +
                "Course 5: " + sections[4] + '\n' +
                "\n";
    }
}
