import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Course> courses = new ArrayList<Course>();
    private int numberOfCourses; // max 10 courses

    public Student(String name) {
        this.studentName = name;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public String getStudentName() {
        return studentName;
    }

    public void addCourse(Course course) {
        if (numberOfCourses >= 10)
            System.out.println("Cannot add course; max course-load reached");
        else {
            courses.add(course);
            numberOfCourses++;
        }
    }

    public void removeCourse(Course course) {
        courses.remove(course);
        numberOfCourses--;
    }
}
