package nyc.c4q.operations.group7;

import nyc.c4q.operations.instructor.Customer;
import nyc.c4q.operations.instructor.GroceryItem;

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
    public List<String> getSectionOfferings() {
        return null;
    }

    @Override
    public GroceryItem getItemFromSection(String name) {
        return null;
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
