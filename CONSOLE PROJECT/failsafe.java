package Task_5;

import java.util.*;

public class failsafe {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>();

        numbers.add(1);
        numbers.add(2);

        for (Integer n : numbers) {
            System.out.println("Reading: " + n);
            numbers.add(3);
        }
        System.out.println("Final List: " + numbers);
    }
}