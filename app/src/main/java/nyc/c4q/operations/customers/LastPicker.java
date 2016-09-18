package nyc.c4q.operations.customers;

import nyc.c4q.operations.instructor.JohnsonsShoppingCart;
import nyc.c4q.operations.instructor.Customer;
import nyc.c4q.operations.instructor.ShoppingCart;

import java.util.List;

public class LastPicker implements Customer {
    private ShoppingCart mCart = new JohnsonsShoppingCart();
    private List<String> mList;

    @Override
    public String getName() {
        return "LastPicker";
    }

    @Override
    public ShoppingCart getCart() {
        return mCart;
    }

    @Override
    public int makeSelection(List<Integer> options) {
        return options.get(options.size()-1);
    }

    @Override
    public void buildShoppingList(List<String> storeManifest) {
        mList = ShopperUtils.buildShoppingList(storeManifest);
    }

    @Override
    public List<String> getShoppingList() {
        return mList;
    }
}
