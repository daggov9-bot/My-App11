package app;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String product1 = "smartphone";
        int quantity1 = 59;
        double price1 = 205.99;
        int days1 = 5;

        String product2 = "laptop";
        int quantity2 = 5;
        double price2 = 2097.37;
        int days2 = 7;

        double total1 = quantity1 * price1;
        double salesByDay1 = total1 / days1;

        double total2 = quantity2 * price2;
        double salesByDay2 = total2 / days2;

        System.out.printf(Locale.GERMANY,
                "Product No 1: %s,%n", product1);
        System.out.printf(Locale.GERMANY,
                "total sales for %d days is EUR %.2f,%n", days1, total1);
        System.out.printf(Locale.GERMANY,
                "sales by day is EUR %.2f.%n", salesByDay1);

        System.out.printf(Locale.GERMANY,
                "Product No 2: %s,%n", product2);
        System.out.printf(Locale.GERMANY,
                "total sales for %d days is EUR %.2f,%n", days2, total2);
        System.out.printf(Locale.GERMANY,
                "sales by day is EUR %.2f.%n", salesByDay2);
    }
}