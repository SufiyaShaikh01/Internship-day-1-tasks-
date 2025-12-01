package Task_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Hajra");
        names.add("Sufiya");
        names.add("Farzaan");
        names.add("Maaz");
        names.add("Zaid");
        names.add("Shahid");
        names.add("Sufiya");

        System.out.println(names);

        // Remove duplicates using HashSet
        Set<String> uniqueNames = new HashSet<>(names);

        // Display the set with unique values
        System.out.println(uniqueNames);

        List<String> uniqueList = new ArrayList<>(uniqueNames);
        System.out.println(uniqueList);

    }
}
