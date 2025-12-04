package Task_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMarks{

    public static void main(String[] args) {

        Map<Integer, Integer> studentMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println("---------- Add Marks ----------");
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            studentMap.put(roll, marks);
        }
        // Update Marks
        System.out.println("\n----- UpdateMarks -----");
        System.out.print("Enter roll number to update marks: ");
        int updateRoll = sc.nextInt();

        if (studentMap.containsKey(updateRoll)) {
            System.out.print("Enter new marks: ");
            int newMarks = sc.nextInt();
            studentMap.put(updateRoll, newMarks); // update
            System.out.println("Marks updated!");
        } else {
            System.out.println("not found!");
        }

        System.out.println("\n---------- Search Student ----------");
        System.out.print("Enter roll number to search: ");
        int searchRoll = sc.nextInt();

        if (studentMap.containsKey(searchRoll)) {
            System.out.println("Marks: " + studentMap.get(searchRoll));
        } else {
            System.out.println("Roll number not found!");
        }
        System.out.println("\n----- Full HashMap -----");
        System.out.println(studentMap);

        sc.close();
    }
}