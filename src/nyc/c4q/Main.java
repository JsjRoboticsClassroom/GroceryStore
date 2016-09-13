package nyc.c4q;

import nyc.c4q.instructor.Customer;
import nyc.c4q.instructor.GroceryStore;
import nyc.c4q.instructor.JohnsonGroceryStore;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GroceryStore store = new JohnsonGroceryStore();
        store.acceptCustomers(buildCustomers());
    }

    private static List<Customer> buildCustomers() {
        return Collections.emptyList();
    }
}
