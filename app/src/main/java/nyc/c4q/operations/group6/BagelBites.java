package nyc.c4q.operations.group6;

import java.util.Map;

import nyc.c4q.operations.instructor.NutritionElement;

/**
 * Created by mathcore on 9/14/16.
 */
public class BagelBites extends FrozenFood {
    public BagelBites() {
        super(Appliance.TOASTEROVEN, 12);
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
