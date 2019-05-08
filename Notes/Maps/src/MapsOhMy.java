import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MapsOhMy {

    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        int method;

        System.out.println("Select method");
        System.out.println("1. comparisonMethod");
        System.out.println("2. indexMethod");
        method = choice.nextInt();
        switch(method){
            case 1 : comparisonMethod();
            break;
            case 2 : indexMethod();
            break;
            default : System.out.println("broke");
        }
    }

    public static void comparisonMethod() {
        ArrayList<Student> students = new ArrayList();
        students.add(new Student("John", "OConnor", 0, "K", 45));
        students.add(new Student("Larry", "Who", 1, "K", 20));
        students.add(new Student("Mario", "Mario", 2, "K", 35));
        students.add(new Student("Luigi", "Luigi", 3, "K", 70));
        students.add(new Student("Daenerys", "Stormborn", 4, "K", 28));
        students.add(new Student("Jon", "Snow", 5, "K", 32));

        System.out.println("Enter your first name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        boolean found = false;

        for (Student temp: students) {
            if (temp.getFirstName().equalsIgnoreCase(name)) {
                found = true;
                System.out.println("Found student " + name + " in the array");
            }
        }
        if (!found) {
            System.out.println("student with name " + name + " not found");
        }
    }

    public static void indexMethod() {
        HashMap<String, Student> firstNames = new HashMap();
        HashMap<String, Student> lastNames = new HashMap();
        ArrayList<Student> students = new ArrayList();
        students.add(new Student("John", "OConnor", 0, "K", 45));
        students.add(new Student("Larry", "Who", 1, "K", 20));
        students.add(new Student("Mario", "Mario", 2, "K", 35));
        students.add(new Student("Luigi", "Luigi", 3, "K", 70));
        students.add(new Student("Daenerys", "Stormborn", 4, "K", 28));
        students.add(new Student("Jon", "Snow", 5, "K", 32));

        for (Student s : students) {
            firstNames.put(s.getFirstName().toUpperCase(), s);
            lastNames.put(s.getLastName().toUpperCase(), s);
        }

        System.out.println("Enter your first name OR last name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        boolean found = false;
        Student myStudent = firstNames.get(name.toUpperCase());
        if (myStudent == null) {
            myStudent = lastNames.get(name.toUpperCase());
            if (myStudent == null) {
                System.out.println("Didn't find student with first name " + name);
            } else {
                System.out.println("Student with last name " + myStudent.getLastName() + "found");
            }
            } else {
                System.out.println("Student with first name " + myStudent.getFirstName() + " found");
            }
        }
        /*for (Student temp: students) {
            if (temp.getFirstName().equalsIgnoreCase(name)) {
                found = true;
                System.out.println("Found student " + name + " in the array");
            }
        }
        if (!found) {
            System.out.println("student with name " + name + " not found");
        }*/
    }
