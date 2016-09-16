package nyc.c4q.group7;

import nyc.c4q.instructor.Customer;

import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Created by leighdouglas on 9/13/16.
 */
public class SushiShop implements Sushi<SushiRoll> {

    @Override
    public void acceptCustomers(List<Customer> customers) {

    }

    @Override
    public Map<SushiRoll, String> getMenu() {
        return null;
    }

    @Override
    public Stack<SushiRoll> getCurrentSelection() {
        return null;
    }
}
