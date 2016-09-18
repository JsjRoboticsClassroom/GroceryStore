package nyc.c4q.operations.group8;

import java.util.Map;

import nyc.c4q.operations.instructor.NutritionElement;

public class PoppyBagel extends Bagel {
    public PoppyBagel() {
        super(Browning.LIGHT, Spreads.CHEESE);
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
