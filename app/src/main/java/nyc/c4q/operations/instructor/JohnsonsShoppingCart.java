package nyc.c4q.operations.instructor;

import java.util.ArrayList;
import java.util.List;

public class JohnsonsShoppingCart implements ShoppingCart {
    private List<GroceryItem> mCart = new ArrayList<>();

    @Override
    public void addItem(GroceryItem item) {
        mCart.add(item);
    }

    @Override
    public void removeItem(GroceryItem item) {
        mCart.remove(item);
    }

    @Override
    public boolean contains(String name) {
        for (GroceryItem item : mCart){
            if (item.getName().toLowerCase().equals(name.toLowerCase())){
                return true;
            }
        }
        return false;
    }
}
