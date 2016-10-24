package nyc.c4q.operations.group4.foods;

import java.util.Map;

import nyc.c4q.operations.group4.HotFood;
import nyc.c4q.operations.group4.Type;
import nyc.c4q.operations.instructor.NutritionElement;

/**
 * Created by rusili on 9/13/16.
 */
public class FriedChicken extends HotFood {


    public FriedChicken() {
        super(Type.SAVORY, 3);
    }

    @Override
    public String getName(){
        return null;
    }

    @Override
    public float getWeight(){
        return 0;
    }

    @Override
    public int getPrice(){
        return 0;
    }

    @Override
    public int getDescription(){
        return 0;
    }

    @Override
    public Map<NutritionElement, String> getNutritionLabel(){
        return null;
    }
}

