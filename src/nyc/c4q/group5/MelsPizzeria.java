package nyc.c4q.group5;

import nyc.c4q.instructor.Customer;

import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Created by meltemyildirim on 9/13/16.
 */
public class MelsPizzeria implements Pizzeria <PizzaSlice>{

  @Override
  public void acceptCustomers(List<Customer> customers) {

  }

  @Override
  public Map<PizzaSlice, String> getMenu() {
    return null;
  }

  @Override
  public Stack<PizzaSlice> getCurrentSelection() {
    return null;
  }
}
