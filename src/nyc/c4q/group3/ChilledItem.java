package nyc.c4q.group3;

import nyc.c4q.instructor.GroceryItem;

public abstract class ChilledItem extends GroceryItem {
    private Type item;
    private int temp;

    public ChilledItem(Type item, int temp) {
        this.item = item;
        this.temp = temp;
    }
}
