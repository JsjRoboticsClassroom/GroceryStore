package nyc.c4q.group5;

import nyc.c4q.instructor.Customer;

import java.util.List;
import java.util.Map;
import java.util.Stack;

public interface Pizzeria<T> {
    void acceptCustomers(List<Customer> customers);
    Map<T,String> getMenu();
    Stack<T> getCurrentSelection();
}
