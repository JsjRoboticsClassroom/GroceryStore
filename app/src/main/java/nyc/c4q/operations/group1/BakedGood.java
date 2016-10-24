package nyc.c4q.operations.group1;

import nyc.c4q.operations.instructor.GroceryItem;

public abstract class BakedGood extends GroceryItem {
    private Type mType;
    private int mSlicesPerUnit;

    public BakedGood (Type type, int slicesPerUnit) {
        this.mType = type;
        this.mSlicesPerUnit = slicesPerUnit;
    }
}
