package nyc.c4q.operations.taGroup;

import java.util.Map;

import nyc.c4q.operations.instructor.NutritionElement;

/**
 * Created by BLEED on 9/13/2016.
 */
public class Gum extends ItemsAtCheckout {


    public Gum() {
        super(Type.Food, 10);
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
