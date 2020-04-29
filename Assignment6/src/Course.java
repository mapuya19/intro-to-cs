import java.util.ArrayList;

public class Course {
    private String courseName;
    private Professor professor;
    private int numberOfStudents; // max 60 students
    private ArrayList<Student> students = new ArrayList<Student>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getProfessor(Professor profName) {
        return professor.getProfName();
    }

    public void addStudent(Student student) {
        if (numberOfStudents >= 60)
            System.out.println("Cannot add student; max course enrollment reached");
        else {
            students.add(student);
            numberOfStudents++;
        }
    }

    public void removeStudent(Student student) {
        students.remove(student);
        numberOfStudents--;
    }

    public String getStudents() {
        StringBuilder allStudents = new StringBuilder();
        int counter = 0;

        for (Student student : students) {
            allStudents.append(student.getStudentName());
            counter++;
            if (counter < numberOfStudents)
                allStudents.append(", ");
        }

        return allStudents.toString();
    }
}
