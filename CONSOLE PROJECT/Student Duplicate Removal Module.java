package Task_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student {
    private int id;
    private String name;
    private String course;

    // Constructor
    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', course='" + course + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student other = (Student) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
public class StudentDuplicateRemoval {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Sufiya", "Java"));
        students.add(new Student(2, "Hajra", "Python"));
        students.add(new Student(3, "Maaz", "Java"));
        students.add(new Student(1, "Sufiya", "Java"));
        students.add(new Student(2, "Hajra", "Python"));
        students.add(new Student(4, "Farzaan", "C++"));
        students.add(new Student(1, "Sufiya", "Java"));

        System.out.println("Original Student List:");
        for (Student s : students) {
            System.out.println(s);
        }

        Set<Student> uniqueStudents = new HashSet<>(students);

        System.out.println("\nUnique Students (After Removing Duplicates):");
        for (Student s : uniqueStudents) {
            System.out.println(s);
        }
    }
}