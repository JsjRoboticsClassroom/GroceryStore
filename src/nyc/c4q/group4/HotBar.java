package nyc.c4q.group4;

import nyc.c4q.instructor.Customer;

import java.util.List;
import java.util.Map;
import java.util.Stack;

public interface HotBar<T> {
    void acceptCustomers(List<Customer> customers);
    Map<T,String> getMenu();
    Stack<T> getCurrentSelection();
}
