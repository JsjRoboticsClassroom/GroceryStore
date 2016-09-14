package nyc.c4q.taGroup;

import nyc.c4q.instructor.GroceryItem;


/**
 * Created by BLEED on 9/13/2016.
 */
public abstract class ItemsAtCheckout extends GroceryItem {
     Type type;
     int amount;

    public ItemsAtCheckout(Type type, int amount){
        this.type = type;
        this.amount = amount;
}

}
