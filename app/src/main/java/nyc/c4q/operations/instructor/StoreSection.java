package nyc.c4q.operations.instructor;

import java.util.List;

public interface StoreSection {
    void acceptCustomers(List<Customer> customers);
    List<String> getSectionOfferings();
    GroceryItem getItemFromSection(String name);
}
