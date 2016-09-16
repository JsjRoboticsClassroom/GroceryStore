package nyc.c4q.group8;

import nyc.c4q.instructor.Customer;
import nyc.c4q.instructor.StoreSection;

import java.util.List;
import java.util.Map;
import java.util.Stack;

public interface BagelOrder<T> extends StoreSection {
    void acceptCustomers(List<Customer> customers);
    Map<T,String> getMenu();
    Stack<T> getCurrentSelection();
}
