package Task_2;

import java.util.Set;
import java.util.TreeSet;

public class SortedProductPrices {
    public static void main(String[] args) {

        // TreeSet stores values in sorted order
        Set<Double> productPrices = new TreeSet<>();

        productPrices.add(498.99);
        productPrices.add(399.29);
        productPrices.add(499.70);
        productPrices.add(879.90);
        productPrices.add(429.39);
        productPrices.add(769.69);

        // Displaying sorted prices
        System.out.println("Sorted Product Prices:");
        for (Double price : productPrices) {
            System.out.println(price);
        }
    }
}
