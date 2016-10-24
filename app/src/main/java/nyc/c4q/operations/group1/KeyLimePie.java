package nyc.c4q.operations.group1;

import java.util.Map;

import nyc.c4q.operations.instructor.NutritionElement;

/**
 * Created by Rafael on 9/13/16.
 */
public class KeyLimePie extends BakedGood {
    public KeyLimePie() {
        super(Type.PIE, 10);
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
