package nyc.c4q.grocerystore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;
import java.util.List;

import nyc.c4q.grocerystore.bagleShop.Bagels;
import nyc.c4q.grocerystore.bakery.MilasBakery;
import nyc.c4q.grocerystore.butcher.GenericsButcherShop;
import nyc.c4q.grocerystore.coldCase.TenBelow;
import nyc.c4q.grocerystore.employeeHandbook.EmployeeHandbookActivity;
import nyc.c4q.grocerystore.freezer.FroZone;
import nyc.c4q.grocerystore.hotBar.HotMeat;
import nyc.c4q.grocerystore.pizzaShop.JohnsonsPizzeria;
import nyc.c4q.grocerystore.sushiShop.SushiYa;

public class StoreDirectory extends AppCompatActivity{
    private Button mGotoBakery;
    private Button mGotoBagels;
    private Button mGotoButcher;
    private Button mGotoColdCase;
    private Button mGotoFreezer;
    private Button mGotoHotBar;
    private Button mGotoPizzaShop;
    private Button mGotoSushi;
    private Button mGotoEmployeeHandbook;
    private List<Button> mNavigationButtons;


    private List<String> mButtonNames = Arrays.asList(
        "Goto Bakery",
        "Goto Bagels",
        "Goto Butcher",
        "Goto ColdCase",
        "Goto Freezer",
        "Goto Hot Bar",
        "Goto Pizza Shop",
        "Goto Sushi Shop",
        "Exit"
    );

    private List<StoreSection> mStoreSections = Arrays.asList(
        StoreSection.BAKERY,
        StoreSection.BAGEL_SHOP,
        StoreSection.BUTCHER,
        StoreSection.COLD_CASE,
        StoreSection.FREEZER,
        StoreSection.HOT_BAR,
        StoreSection.PIZZA_SHOP,
        StoreSection.SUSHI_SHOP
    );


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store_menu);
        mGotoBakery = (Button) findViewById(R.id.button1);
        mGotoBagels = (Button) findViewById(R.id.button2);
        mGotoButcher = (Button) findViewById(R.id.button3);
        mGotoColdCase = (Button) findViewById(R.id.button4);
        mGotoFreezer = (Button) findViewById(R.id.button5);
        mGotoHotBar = (Button) findViewById(R.id.button6);
        mGotoPizzaShop = (Button) findViewById(R.id.button7);
        mGotoSushi = (Button) findViewById(R.id.button8);
        mGotoEmployeeHandbook = (Button) findViewById(R.id.employeeHandbook);

        mNavigationButtons = Arrays.asList(
            mGotoBakery,
            mGotoBagels,
            mGotoButcher,
            mGotoColdCase,
            mGotoFreezer,
            mGotoHotBar,
            mGotoPizzaShop,
            mGotoSushi
        ) ;
    }

    @Override
    public void onResume(){
        super.onResume();
        for (int index = 0; index < mNavigationButtons.size(); index++){
            Button button = mNavigationButtons.get(index);
            String buttonName = mButtonNames.get(index);
            StoreSection section = mStoreSections.get(index);
            button.setOnClickListener(buildClickListener(section));
            button.setText(buttonName);
        }
        setupEmployeeHanbook();
    }

    private void setupEmployeeHanbook() {
        mGotoEmployeeHandbook.setText("Employee Handbook");
        mGotoEmployeeHandbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), EmployeeHandbookActivity.class);
                view.getContext().startActivity(intent);
            }
        });
    }


    private View.OnClickListener buildClickListener(final StoreSection storeSection){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Class<?> sectionToGoto;
                switch (storeSection){
                    case BAGEL_SHOP:
                        sectionToGoto = Bagels.class;
                        break;
                    case BAKERY:
                        sectionToGoto = MilasBakery.class;
                        break;
                    case BUTCHER:
                        sectionToGoto = GenericsButcherShop.class;
                        break;
                    case COLD_CASE:
                        sectionToGoto = TenBelow.class;
                        break;
                    case FREEZER:
                        sectionToGoto = FroZone.class;
                        break;
                    case HOT_BAR:
                        sectionToGoto = HotMeat.class;
                        break;
                    case PIZZA_SHOP:
                        sectionToGoto = JohnsonsPizzeria.class;
                        break;
                    case SUSHI_SHOP:
                        sectionToGoto = SushiYa.class;
                        break;
                    default:
                        throw new IllegalArgumentException("You Fool!!!");
                }

                Intent intent = new Intent(view.getContext(), sectionToGoto);
                view.getContext().startActivity(intent);
            }
        };
    }
}
