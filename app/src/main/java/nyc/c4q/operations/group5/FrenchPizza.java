package nyc.c4q.operations.group5;

import java.util.Map;

import nyc.c4q.operations.instructor.NutritionElement;

/**
 * Created by meltemyildirim on 9/13/16.
 */
public class FrenchPizza extends PizzaSlice{

  public FrenchPizza() {
    super(Type.CHEESE, Crust.THIN);
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
