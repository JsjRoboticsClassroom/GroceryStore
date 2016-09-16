package nyc.c4q.instructor;

import nyc.c4q.group1.BakedGood;
import nyc.c4q.group1.Bakery;
import nyc.c4q.group1.JohnsonsBakery;
import nyc.c4q.group2.Butcher;
import nyc.c4q.group2.JohnsonsButcher;
import nyc.c4q.group2.Meat;
import nyc.c4q.group3.ChilledItem;
import nyc.c4q.group3.ColdCase;
import nyc.c4q.group3.JohnsonsChilledItems;
import nyc.c4q.group4.HotBar;
import nyc.c4q.group4.HotFood;
import nyc.c4q.group4.JohnsonsHotFood;
import nyc.c4q.group5.MelsPizzeria;
import nyc.c4q.group5.PizzaSlice;
import nyc.c4q.group5.Pizzeria;
import nyc.c4q.group6.FrozenFood;
import nyc.c4q.group6.JohnsonsFrozenFood;
import nyc.c4q.group6.PopUpStation;
import nyc.c4q.group7.Sushi;
import nyc.c4q.group7.SushiRoll;
import nyc.c4q.group7.SushiShop;
import nyc.c4q.group8.Bagel;
import nyc.c4q.group8.BagelOrder;
import nyc.c4q.group8.BagelStop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JohnsonGroceryStore implements GroceryStore {
    private PopUpStation<FrozenFood> mPopUpStation = new JohnsonsFrozenFood();
    private Checkout mCheckout = new Checkout();
    private Butcher<Meat> mButcher = new JohnsonsButcher();
    private Bakery<BakedGood> mBakery = new JohnsonsBakery();
    private ColdCase<ChilledItem> mColdCase = new JohnsonsChilledItems();
    private HotBar<HotFood> mHotBar = new JohnsonsHotFood();
    private Pizzeria<PizzaSlice> mPizzeria = new MelsPizzeria();
    private Sushi<SushiRoll> mSushi = new SushiShop();
    private BagelOrder<Bagel> mBagel = new BagelStop();

    List<StoreSection> sections = Arrays.asList(
            mPopUpStation,
            mButcher,
            mBakery,
            mColdCase,
            mHotBar,
            mPizzeria,
            mSushi,
            mBagel
    );
    @Override
    public void acceptCustomers(List<Customer> customers) {
        ArrayList<String> storeManifest = new ArrayList<>();
        for (StoreSection section : sections){
            section.getSectionOfferings().keySet();
        }
        for(int index = 0; index < storeManifest.size(); index++){
            System.out.print(storeManifest + "\t");
            if(index > 0 && index% 3 == 0){
                System.out.print("\n");
            }
        }

        for(Customer customer : customers){
            customer.buildShoppingList(storeManifest);
        }

        for (StoreSection section : sections){
            section.acceptCustomers(customers);
        }

        mCheckout.acceptCustomers(customers);
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

    @Override
    public void sendToBagelCounter(List<Customer> customers) {
        mBagel.acceptCustomers(customers);
    }
}
