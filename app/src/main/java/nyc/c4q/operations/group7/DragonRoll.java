package nyc.c4q.operations.group7;

import java.util.Map;

import nyc.c4q.operations.instructor.NutritionElement;

/**
 * Created by leighdouglas on 9/13/16.
 */
public class DragonRoll extends SushiRoll {
    public DragonRoll(){
        super(Type.SNAPPER, Sauce.WASABI);
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
