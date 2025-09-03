import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        Student student1 = new Student("Jake", 30, 1);
        Student student2 = new Student("Jamie", 31, 1);
        Student student3 = new Student("Jason", 33, 2);
        Student student4 = new Student("Jack", 34, 2);
        Student student5 = new Student("Jacob", 35, 3);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for (Student student : students) {
            student.output();
        }
    }
}
