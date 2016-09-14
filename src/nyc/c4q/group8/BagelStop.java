package nyc.c4q.group8;

import nyc.c4q.instructor.Customer;

import java.util.List;
import java.util.Map;
import java.util.Stack;

public class BagelStop implements BagelOrder<Bagel> {
    @Override
    public void acceptCustomers(List<Customer> customers) {

    }

    @Override
    public Map<Bagel, String> getMenu() {
        return null;
    }

    @Override
    public Stack<Bagel> getCurrentSelection() {
        return null;
    }
}
