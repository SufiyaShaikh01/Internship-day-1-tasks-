package Task_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapcollection {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("----- Add  Words and Their Meanings -----");

        for (int i = 0; i < 2; i++) {

            System.out.print("Enter a Key (word): ");
            String key = sc.nextLine();

            System.out.print("Enter a Value (meaning): ");
            String value = sc.nextLine();

            map.put(key, value);
        }

        /*
        map.put("Sad", "Feeling Lonely");
        map.put("Hot", "High Temperature");
        map.put("Cold", "Low temperature");
        map.put("Small", "Small in size");
        map.put("fast", "move quickly");
        */

        System.out.println("\n----- Search a Word -----");

        System.out.print("Enter a word to search: ");
        String word = sc.nextLine();

        if (map.containsKey(word))
        {
            System.out.println("Meaning: " + map.get(word));
        } else {
            System.out.println("Word not found!");
        }

        System.out.println("\n--------------- Displaying Data -------------");

        System.out.println("All Entries (key=value): " + map.entrySet());

        // keySet() → returns only keys
        System.out.println("All Keys: " + map.keySet());

        // values() → returns only values
        System.out.println("All Values: " + map.values());

        // returns all in random orders
        System.out.println(map);

        sc.close();
    }
}
