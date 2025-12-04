package Task_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        // Scenario 1: Maintain order of attendance list
        LinkedList<String> attendance = new LinkedList<>();
        attendance.add("Sufiya");
        attendance.add("Fatima");
        attendance.add("Ayesha");

        System.out.println(attendance);

        // Scenario 2: Remove duplicates from exam submissions
        HashSet<String> submissions = new HashSet<>();
        submissions.add("Demo1.pdf");
        submissions.add("Demo1.pdf");

        System.out.println(submissions);


        // Scenario 3: College timetable → sorted by time
        TreeMap<String, String> timetable = new TreeMap<>();
        timetable.put("08:00", "python");
        timetable.put("8:30", "java");
        timetable.put("9:00", "C++");

        System.out.println(timetable);

        // Scenario 4: Student roll number & name lookup
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Hajra");
        studentMap.put(102, "Mubashira");

        System.out.println(studentMap.get(101));

        // Scenario 5: Manage print queue jobs
        Queue<String> printQueue = new LinkedList<>();
        printQueue.add("Job1");
        printQueue.add("Job2");

        System.out.println(printQueue.poll());

        // Scenario 6: Keep browser back–forward history
        Stack<String> history = new Stack<>();
        history.push("Home");
        history.push("Profile");
        history.push("Settings");

        System.out.println(history.pop()); // Settings

        // Scenario 7: Store leaderboard scores sorted
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(80);
        scores.add(86);
        scores.add(80);

        System.out.println(scores);

        // Scenario 8: Store products in ecommerce
        ArrayList<String> products = new ArrayList<>();
        products.add("Smartphone");
        products.add("wallet");
        products.add("laptop");

        System.out.println(products);

        // Scenario 9: Cache with insertion order
        LinkedHashMap<Integer, String> cache = new LinkedHashMap<>();
        cache.put(1, "Home");
        cache.put(2, "About");

        System.out.println(cache);

        // Scenario 10: Manage tasks by priority
        PriorityQueue<Integer> tasks = new PriorityQueue<>();
        tasks.add(7);
        tasks.add(1);

        System.out.println(tasks.poll()); 

    }
}
