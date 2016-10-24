package nyc.c4q.operations.group2;

import java.util.Map;

import nyc.c4q.operations.instructor.NutritionElement;

/**
 * Created by ashiquechowdhury on 9/13/16.
 */
public class Goat extends Meat {
    public Goat(){
        super(Animal.GOAT, Cut.FLANK);
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
