package nyc.c4q.group6;

import nyc.c4q.instructor.Customer;

import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Created by mathcore on 9/13/16.
 */
public class JohnsonsFrozenFood implements PopUpStation<FrozenFood> {

    @Override
    public void acceptCustomers(List<Customer> customers) {

    }

    @Override
    public Map<FrozenFood, String> getMenu() {
        return null;
    }

    @Override
    public Stack<FrozenFood> getCurrentSelection() {
        return null;
    }
}
