package nyc.c4q.group1;

import nyc.c4q.instructor.GroceryItem;

public abstract class BakedGood extends GroceryItem {
    private Type mType;
    private int mSlicesPerUnit;

    public BakedGood (Type type, int slicesPerUnit) {
        this.mType = type;
        this.mSlicesPerUnit = slicesPerUnit;
    }
}
