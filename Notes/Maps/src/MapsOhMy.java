import java.util.ArrayList;

public class MapsOhMy {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList();
        students.add(new Student("John", "OConnor", 0, "K", 45));
        students.add(new Student("Larry", "Who", 1, "K", 20));
        students.add(new Student("Mario", "Mario", 2, "K", 35));
        students.add(new Student("Luigi", "Luigi", 3, "K", 70));
        students.add(new Student("Daenerys", "Stormborn", 4, "K", 28));
        students.add(new Student("Jon", "Snow", 5, "K", 32));
    }
}
