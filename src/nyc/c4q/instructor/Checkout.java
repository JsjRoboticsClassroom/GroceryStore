package nyc.c4q.instructor;

import java.util.List;

public class Checkout {
    private ShoppingCart shoppingCart;

    public void acceptCustomers(List<Customer> customers) {
        for( Customer customer : customers){
            shoppingCart = customer.getCart();
            List<String> shoppingList = customer.getShoppingList();
            for (String item : shoppingList){
                if (!shoppingCart.contains(item)){
                    System.out.println("I see you couldn't find " + item);
                    throw new TerribleCustomerServiceException(customer);
                }
            }

            System.out.println(customer.getName() + " found everything on their shopping list");
        }
    }
}
