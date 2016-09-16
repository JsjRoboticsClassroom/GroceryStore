package nyc.c4q.instructor;

import java.util.Map;

public abstract class GroceryItem {
    abstract String getName();
    abstract float getWeight();
    abstract int getPrice();
    abstract int getDescription();
    abstract Map<NutritionElement, String> getNutritionLabel();
}
