package Task_3;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeDirectory {
    public static void main(String[] args) {

        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(01, "Sufiya");
        employees.put(02, "Hajra");
        employees.put(49, "Fatima");
        employees.put(23, "Ayesha");
        employees.put(15, "Nabila");

        System.out.println("--- Sorted Directory ---");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
