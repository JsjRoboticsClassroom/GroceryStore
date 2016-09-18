package nyc.c4q.grocerystore.bagleShop;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import nyc.c4q.grocerystore.R;
import nyc.c4q.operations.CustomerBuilder;
import nyc.c4q.operations.GroceryStoreOwner;

public class Bagels extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bagel_shop);
    }

    @Override
    public void onResume(){
        super.onResume();
        GroceryStoreOwner.getInstance().sendToBagelCounter(CustomerBuilder.buildCustomers());
    }
}
