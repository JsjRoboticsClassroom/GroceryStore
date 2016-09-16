package nyc.c4q.instructor;

import java.util.List;
import java.util.Map;

public interface StoreSection {
    void acceptCustomers(List<Customer> customers);
    Map<String, String> getSectionOfferings();
    GroceryItem getItemFromSection(String name);
}
