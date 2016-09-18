package nyc.c4q.operations;

import java.util.Arrays;
import java.util.List;

import nyc.c4q.operations.customers.FirstPicker;
import nyc.c4q.operations.customers.LastPicker;
import nyc.c4q.operations.instructor.Customer;

public class CustomerBuilder {
    public static List<Customer> buildCustomers() {
        return Arrays.asList(
                new FirstPicker(),
                new LastPicker()
        );
    }
}
