package Task_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2_FailFast {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());

            list.add("New");
        }
    }
}