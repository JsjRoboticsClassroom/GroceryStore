package nyc.c4q.operations.group5;

import nyc.c4q.operations.instructor.GroceryItem;

public abstract class PizzaSlice extends GroceryItem {
  private Crust crust;
  private Type type;


  public PizzaSlice(Type eType, Crust eCrust) {
    crust = eCrust;
    type = eType;
  }


}
