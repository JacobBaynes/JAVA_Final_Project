/**
 * Created by Jacob Baynes on 05/01/2018
 */

public class CourseSection extends Course {
    String id; // e.g. FJT01
    String days; // e.g. "MW" for Monday Wednesday or "TTH" for Tuesday Thursday
    String startTime; // e.g. 10AM
    String building; // e.g. AT
    String room; // e.g. 226

    // Default Constructor
    public CourseSection () {

    }

    // All attribute Constructors
    public CourseSection (String subject, String number, String name, String id, String days, String startTime, String building, String room) {
        super(subject, number, name);
        this.id = id;
        this.days = days;
        this.startTime = startTime;
        this.building = building;
        this.room = room;
    }

    public CourseSection(Course c, String id, String days, String startTime, String building, String room) {
        super(c.getSubject(), c.getNumber(), c.getName());
        this.id = id;
        this.days = days;
        this.startTime = startTime;
        this.building = building;
        this.room = room;
    }

    // Getter and Setter methods
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    // toString Override method
    @Override
    public String toString() {
        return  super.toString() + id + ' ' + days + ' ' + startTime + ' ' + building + ' ' +
                room;
    }
}
