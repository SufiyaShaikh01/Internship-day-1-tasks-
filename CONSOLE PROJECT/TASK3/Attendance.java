package Task_3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AttendanceSystem {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> attendance = new LinkedHashMap<>();

        addStudent(attendance, 10, "Sufiya");
        addStudent(attendance, 11, "Hajra");
        addStudent(attendance, 12, "Fatima");
        addStudent(attendance, 14, "Ayesha");
        addStudent(attendance, 15, "Rabia");

        addStudent(attendance, 12, "Duplicate");

        System.out.println("\n--- Attendance List (Order of Arrival) ---");
        for (Map.Entry<Integer, String> entry : attendance.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter roll number to search: ");
        int roll = sc.nextInt();

        if (attendance.containsKey(roll)) {
            System.out.println("Student Found: " + attendance.get(roll));
        } else {
            System.out.println(" not found!");
        }
    }
    static void addStudent(LinkedHashMap<Integer, String> map, int roll, String name) {
        if (map.containsKey(roll)) {
            System.out.println("Duplicate ignored: " + roll);
        } else {
            map.put(roll, name);
        }
    }
}
