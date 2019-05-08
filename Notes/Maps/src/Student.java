public class Student {
    private String firstName;
    private String lastName;
    private String gradeLevel;
    private Integer age;
    private Integer studentID;

    public Student(String firstName, String lastName, Integer studentID, String gradelevel, Integer age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.gradeLevel = gradeLevel;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }
}
