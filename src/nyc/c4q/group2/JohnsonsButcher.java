package nyc.c4q.group2;

import nyc.c4q.instructor.Customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Created by ashiquechowdhury on 9/13/16.
 */
public class JohnsonsButcher implements Butcher<Meat> {

    @Override
    public void acceptCustomers(List<Customer> customers) {

    }

    @Override
    public Map<Meat, String> getMenu() {
        Map<Meat, String> menu = new HashMap<>();
        return null;
    }

    @Override
    public Stack<Meat> getCurrentSelection() {
        return null;
    }
}
