package nyc.c4q.operations;

import nyc.c4q.operations.customers.FirstPicker;
import nyc.c4q.operations.customers.LastPicker;
import nyc.c4q.operations.instructor.Customer;
import nyc.c4q.operations.instructor.GroceryStore;
import nyc.c4q.operations.instructor.JohnsonGroceryStore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GroceryStoreOwner {

    private static GroceryStore sGroceryStore;

    public static GroceryStore getInstance() {
        if (sGroceryStore == null){
            sGroceryStore = new JohnsonGroceryStore();
        }
        return sGroceryStore;
    }
}
