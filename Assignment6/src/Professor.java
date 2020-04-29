import java.util.ArrayList;

public class Professor {
    private String profName;
    private ArrayList<Course> courses = new ArrayList<Course>();
    private int numberOfCourses; // 0-3 courses

    public Professor(String name) {
        this.profName = name;
    }

    public void setProfName(String name) {
        this.profName = name;
    }

    public String getProfName() {
        return profName;
    }

    public void addCourse(Course course) {
        if (numberOfCourses >= 3)
            System.out.println("Cannot add course; max course allotment reached");
        else {
            courses.add(course);
            numberOfCourses++;
        }
    }

    public void removeCourse(Course course) {
        if (numberOfCourses == 0)
            System.out.println("Course count cannot be less than zero");
        else {
            courses.remove(course);
            numberOfCourses--;
        }
    }
}
