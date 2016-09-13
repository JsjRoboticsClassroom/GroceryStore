package nyc.c4q.group3;

import nyc.c4q.instructor.Customer;

import java.util.List;
import java.util.Map;
import java.util.Stack;

public interface ColdCase<T> {
    void acceptCustomers(List<Customer> customers);
    Map<T,String> getMenu();
    Stack<T> getCurrentSelection();
}
