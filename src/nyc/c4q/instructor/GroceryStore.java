package nyc.c4q.instructor;

import java.util.List;

public interface GroceryStore {
    void acceptCustomers(List<Customer> customers);
    void sendToPopUpStation(List<Customer> customers);
    void sendToButcher(List<Customer> customers);
    void sendToBakery(List<Customer> customers);
    void sendToColdCase(List<Customer> customers);
    void sendToHotBar(List<Customer> customers);
    void sendToPizzeria(List<Customer> customers);
    void sendToSushi(List<Customer> customers);
    void sendToBagelCounter(List<Customer> customers);
}
