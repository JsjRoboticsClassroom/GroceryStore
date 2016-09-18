package nyc.c4q.operations.instructor;

import java.util.Map;

public abstract class GroceryItem {
    public abstract String getName();
    public abstract float getWeight();
    public abstract int getPrice();
    public abstract int getDescription();
    public abstract Map<NutritionElement, String> getNutritionLabel();
}
