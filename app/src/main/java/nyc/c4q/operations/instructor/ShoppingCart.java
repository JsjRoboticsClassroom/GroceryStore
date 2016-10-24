package nyc.c4q.operations.instructor;

public interface ShoppingCart {
    void addItem(GroceryItem item);
    void removeItem(GroceryItem item);

    boolean contains(String item);
}
