package nyc.c4q.operations.group6;

import nyc.c4q.operations.instructor.Customer;
import nyc.c4q.operations.instructor.StoreSection;

import java.util.List;
import java.util.Map;
import java.util.Stack;

public interface PopUpStation<T> extends StoreSection{
    void acceptCustomers(List<Customer> customers);
    Map<T,String> getMenu();
    Stack<T> getCurrentSelection();

}
