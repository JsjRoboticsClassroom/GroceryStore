package nyc.c4q.operations.taGroup;

import nyc.c4q.operations.instructor.GroceryItem;


/**
 * Created by BLEED on 9/13/2016.
 */
public abstract class ItemsAtCheckout extends GroceryItem {
     private Type type;
     private int amount;

    public ItemsAtCheckout(Type type, int amount){
        this.type = type;
        this.amount = amount;
}

}
