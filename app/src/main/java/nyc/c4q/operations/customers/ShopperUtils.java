package nyc.c4q.operations.customers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShopperUtils {
    public static List<String> buildShoppingList(List<String> storeManifest) {
        ArrayList<String> result = new ArrayList<>();
        Random random = new Random();
        for (String s : storeManifest){
            if (random.nextBoolean()){
                result.add(s);
            }
        }
        return result;
    }
}
