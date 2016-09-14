package nyc.c4q.group5;

import nyc.c4q.instructor.GroceryItem;

public abstract class PizzaSlice extends GroceryItem {
  private EnumCrust crust;
  private EnumType type;


  public PizzaSlice( EnumType eType, EnumCrust eCrust) {
    crust = eCrust;
    type = eType;
  }


}
