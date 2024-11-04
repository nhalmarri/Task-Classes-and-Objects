
public class Course {

    public String courseName;
    public String instructor;
    public int enrolledStudents;


    //Setting the constructor
    public Course( String courseName, String instructor, int enrolledStudents) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    //Setting the setter
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }


    //Setting getters
    public String getCourseName () {
        return courseName;
    }
    public String getInstructor () {
        return instructor;
    }
    public int getEnrolledStudents () {
        return enrolledStudents;
    }


    @Override
    public String toString() {
        return "Course Name= " + courseName + "\n" +
                "Instructor= " + instructor + "\n" +
                "Enrolled Students= " + enrolledStudents;
    }
}//end of class