package Task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class scenario {
    public static void main(String[] args) {

        List<String> doctorList = new ArrayList<>();
        doctorList.add("Dr. A");
        doctorList.add("Dr. B");

        CopyOnWriteArrayList<String> liveDoctorList = new CopyOnWriteArrayList<>();
        liveDoctorList.add("Dr. X");
        liveDoctorList.add("Dr. Y");

        System.out.println("--------- Fail-Fast Doctor List ---------");
        try {
            for (String d : doctorList) {
                System.out.println("Processing: " + d);

                doctorList.add("Dr. C");
            }
        } catch (Exception e)
        {
            System.out.println("Exception: " + e);
        }

        System.out.println("\n--------- Fail-Safe Doctor List ---------");

        for (String d : liveDoctorList) {
            System.out.println("Processing: " + d);

            liveDoctorList.add("Dr. Z");
        }
        System.out.println("Final Live Doctor List: " + liveDoctorList);
    }
}
