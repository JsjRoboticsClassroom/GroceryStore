package nyc.c4q.operations.instructor;

import java.util.List;

public interface Customer {
    String getName();
    ShoppingCart getCart();
    int makeSelection(List<Integer> options);

    void buildShoppingList(List<String> storeManifest);
    List<String> getShoppingList();
}
