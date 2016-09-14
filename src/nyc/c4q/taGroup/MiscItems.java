package nyc.c4q.taGroup;

import nyc.c4q.instructor.Customer;

import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Created by BLEED on 9/13/2016.
 */
public interface MiscItems<T> {
    void acceptCustomers(List<Customer> customers);
    Map<T,String> getMenu();
    Stack<T> getCurrentSelection();
}
