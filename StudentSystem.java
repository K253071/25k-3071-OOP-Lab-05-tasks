import java.util.ArrayList;

class Student {
    String name;
    double gpa;

    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
}

public class StudentSystem {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        // Add at least 5 students
        students.add(new Student("Ali", 3.85));
        students.add(new Student("Sara", 2.45));
        students.add(new Student("Ahmed", 1.62));
        students.add(new Student("Zara", 3.62));
        students.add(new Student("Usman", 3.21));

        // Remove students with GPA below 2.0
        students.removeIf(s -> s.gpa < 2.0);

        // Find topper student
        Student topper = students.get(0);
        for (Student s : students) {
            if (s.gpa > topper.gpa) {
                topper = s;
            }
        }
        
        int deanCount = 0;
        for (Student s : students) {
            if (s.gpa > 3.5) {
                deanCount++;
            }
        }

        // Output
        System.out.println("Topper Student: " + topper.name + " GPA: " + topper.gpa);
        System.out.println("Students eligible for Dean's List: " + deanCount);
    }
}