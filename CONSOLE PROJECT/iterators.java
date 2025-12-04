package Task_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task1_Iterators {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Sufiya");
        list.add("Hajra");
        list.add("Fatima");

        // 1 : Using Iterator
        System.out.println("Using Iterator:");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        // 2 : Using Enhanced For-each Loop
        System.out.println("\nUsing For-each Loop:");

        for (String item : list) {
            System.out.println(item);
        }
        // 3 : Using ListIterator for Reverse Traversal
        System.out.println("\nUsing ListIterator (Reverse Traversal):");

        ListIterator<String> listItr = list.listIterator(list.size());

        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }
    }
}