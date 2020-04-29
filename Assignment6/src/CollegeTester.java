public class CollegeTester {
    public static void main(String[] args) {
        Professor teseo = new Professor("Teseo Schneider");
        Course introCS = new Course("Intro to CS");
        Student netid_0 = new Student("Matthew Apuya");
        Student netid_1 = new Student("Andrea");

        System.out.println("Created Profesor: " + teseo.getProfName());
        System.out.println("Created Course: " + introCS.getCourseName());
        System.out.println("Created student: " + netid_0.getStudentName());
        System.out.println();

        // Assign professor and course
        introCS.assignProfessor(teseo);
        teseo.addCourse(introCS);
        System.out.println("Assigned Professor Schneider to Intro to CS course");
        System.out.println();

        // Add student
        introCS.addStudent(netid_0);
        introCS.addStudent(netid_1);
        System.out.println("Enrolled Matthew Apuya in Intro to CS");
        System.out.println("Enrolled Andrea in Intro to CS");
        System.out.println("All students in Intro to CS: " + introCS.getStudents());
        System.out.println();

        // Remove student
        introCS.removeStudent(netid_0);
        System.out.println("Removed Matthew Apuya from Intro to CS");
        System.out.println("All students in Intro to CS: " + introCS.getStudents());
    }
}