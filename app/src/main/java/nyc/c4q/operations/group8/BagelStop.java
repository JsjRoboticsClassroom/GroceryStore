package nyc.c4q.operations.group8;

import nyc.c4q.operations.instructor.Customer;
import nyc.c4q.operations.instructor.GroceryItem;

import java.util.List;
import java.util.Map;
import java.util.Stack;

public class BagelStop implements BagelOrder<Bagel> {
    @Override
    public void acceptCustomers(List<Customer> customers) {

    }

    @Override
    public List<String> getSectionOfferings() {
        return null;
    }

    @Override
    public GroceryItem getItemFromSection(String name) {
        return null;
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
