package nyc.c4q.operations.group4.foods;

import java.util.Map;

import nyc.c4q.operations.group4.HotFood;
import nyc.c4q.operations.group4.Type;
import nyc.c4q.operations.instructor.NutritionElement;

/**
 * Created by rusili on 9/13/16.
 */
public class SweetPotatoes extends HotFood {

    public SweetPotatoes() {
        super(Type.SWEET, 10);
    } // Sweet
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
