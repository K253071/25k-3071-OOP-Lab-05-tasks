import java.util.ArrayList;
import java.util.Collections;

class OnlineStore {
    public static void main(String[] args) {

        // Dynamic list of orders
        ArrayList<Double> orders = new ArrayList<>();

        // Adding order values
        orders.add(200.0);
        orders.add(800.0);
        orders.add(6000.0);
        orders.add(450.0);
        orders.add(7200.0);
        orders.add(1500.0);

        // Remove orders below 500
        orders.removeIf(order -> order < 500);

        // Apply 10% discount to orders above 5000
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i) > 5000) {
                double discounted = orders.get(i) * 0.9;
                orders.set(i, discounted);
            }
        }

        // Calculate total revenue
        double total = 0;
        for (double order : orders) {
            total += order;
        }

        // Sort orders (ascending)
        Collections.sort(orders);

        // Display results
        System.out.println("Sorted Orders: " + orders);
        System.out.println("Total Revenue: " + total);
    }
}