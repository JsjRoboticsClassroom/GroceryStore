package nyc.c4q.instructor;

import nyc.c4q.group1.BakedGood;
import nyc.c4q.group1.Bakery;
import nyc.c4q.group2.Butcher;
import nyc.c4q.group2.Meat;
import nyc.c4q.group3.ChilledItem;
import nyc.c4q.group3.ColdCase;
import nyc.c4q.group4.HotBar;
import nyc.c4q.group4.HotFood;
import nyc.c4q.group5.PizzaSlice;
import nyc.c4q.group5.Pizzeria;
import nyc.c4q.group6.FrozenFood;
import nyc.c4q.group6.PopUpStation;
import nyc.c4q.group7.Sushi;
import nyc.c4q.group7.SushiRoll;

import java.util.List;

public class JohnsonGroceryStore implements GroceryStore {
    private PopUpStation<FrozenFood> mPopUpStation;
    private Checkout mCheckout;
    private Butcher<Meat> mButcher;
    private Bakery<BakedGood> mBakery;
    private ColdCase<ChilledItem> mColdCase;
    private HotBar<HotFood> mHotBar;
    private Pizzeria<PizzaSlice> mPizzeria;
    private Sushi<SushiRoll> mSushi;

    @Override
    public void acceptCustomers(List<Customer> customers) {

    }

    @Override
    public void sendToPopUpStation(List<Customer> customers) {
        mPopUpStation.acceptCustomers(customers);
    }

    @Override
    public void sendToButcher(List<Customer> customers) {
        mButcher.acceptCustomers(customers);
    }

    @Override
    public void sendToBakery(List<Customer> customers) {
        mBakery.acceptCustomers(customers);
    }

    @Override
    public void sendToColdCase(List<Customer> customers) {
        mColdCase.acceptCustomers(customers);
    }

    @Override
    public void sendToHotBar(List<Customer> customers) {
        mHotBar.acceptCustomers(customers);
    }

    @Override
    public void sendToPizzeria(List<Customer> customers) {
        mPizzeria.acceptCustomers(customers);
    }

    @Override
    public void sendToSushi(List<Customer> customers) {
        mSushi.acceptCustomers(customers);
    }
}
