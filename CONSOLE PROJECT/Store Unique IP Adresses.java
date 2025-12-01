package Task_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueIPAddresses {
    public static void main(String[] args) {

        List<String> ipAddresses = new ArrayList<>();

        ipAddresses.add("182.169.2.1");
        ipAddresses.add("11.8.0.4");
        ipAddresses.add("182.168.1.2");
        ipAddresses.add("122.17.0.2");
        ipAddresses.add("16.0.9.5");
        ipAddresses.add("192.168.1.3");
        ipAddresses.add("182.169.2.1");
        ipAddresses.add("162.15.8.1");
        ipAddresses.add("163.198.1.6");
        ipAddresses.add("178.198.7.5");

        System.out.println("Original IP List:");
        for (String ip : ipAddresses) {
            System.out.println(ip);
        }

        Set<String> uniqueIPs = new HashSet<>(ipAddresses);

        System.out.println("\nUnique IP Addresses (After Removing Duplicates):");
        for (String ip : uniqueIPs) {
            System.out.println(ip);
        }
    }
}