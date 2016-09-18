package nyc.c4q.operations.group4.foods;

import java.util.Map;

import nyc.c4q.operations.group4.HotFood;
import nyc.c4q.operations.group4.Type;
import nyc.c4q.operations.instructor.NutritionElement;

/**
 * Created by rusili on 9/13/16.
 */
public class HotWings extends HotFood {

    public HotWings() {
        super(Type.SPICY, 1);
    } // Spicy
    public String getName(){
        return null;
    }

    public float getWeight(){
        return 0;
    }

    public int getPrice(){
        return 0;
    }

    public int getDescription(){
        return 0;
    }

    public Map<NutritionElement, String> getNutritionLabel(){
        return null;
    }
}
