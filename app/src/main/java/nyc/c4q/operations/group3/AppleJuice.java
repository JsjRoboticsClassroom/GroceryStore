package nyc.c4q.operations.group3;

import java.util.Map;

import nyc.c4q.operations.instructor.NutritionElement;

public class AppleJuice extends ChilledItem {
    public AppleJuice() {
        super(Type.DRINK, 45);
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
