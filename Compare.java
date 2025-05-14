import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String toString() {
        return "Name: " + name + "Marks: " + marks;
    }
}

public class Compare {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 93));
        students.add(new Student("Bob", 81));
        students.add(new Student("Charlie", 74));
        students.add(new Student("David", 99));

        // sorting by name

        students.sort(Comparator.comparing(Student::getName));
        System.out.println("Sorted by name");
        students.forEach(System.out::println);

        // sorting by marks ascending

        students.sort(Comparator.comparingInt(Student::getMarks));
        System.out.println("\nSorted by marks in ascending order");
        students.forEach(System.out::println);

        // sorting by marks descending

        students.sort(Comparator.comparingInt(Student::getMarks).reversed());
        System.out.println("\nSorted by marks in descending order");
        students.forEach(System.out::println);
    }
}