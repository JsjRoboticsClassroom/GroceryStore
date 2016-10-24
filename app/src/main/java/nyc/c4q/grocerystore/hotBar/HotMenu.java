package nyc.c4q.grocerystore.hotBar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Spinner;

import nyc.c4q.grocerystore.R;

public class HotMenu extends AppCompatActivity  {
//implements View.OnClickListener
    private Button menuCheckout;
    private Spinner listView1;
    private Spinner listView2;
    private Spinner listView3;
    private Button bMinus;
    private Button bPlus;
    private Button bMinus2;
    private Button bPlus2;
    private Button bMinus3;
    private Button bPlus3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hot_menu);
//        listeners();
    }
//    private void listeners() {
//        menuCheckout = (Button) findViewById(R.id.hotmenu_checkout);
//        menuCheckout.setOnClickListener(this);
//        listView1 = (Spinner) findViewById(listviewFlavor1);
//        listView1.setOnClickListener(this);
//        listView2= (Spinner) findViewById(listviewFlavor2);
//        listView2.setOnClickListener(this);
//        listView3 = (Spinner) findViewById(listviewFlavor3);
//        listView3.setOnClickListener(this);
//        bMinus = (Button) findViewById(buttonMinus);
//        bMinus.setOnClickListener(this);
//        bPlus = (Button) findViewById(buttonPlus);
//        bPlus.setOnClickListener(this);
//        bMinus2 = (Button) findViewById(buttonMinus2);
//        bMinus2.setOnClickListener(this);
//        bPlus2 = (Button) findViewById(buttonPlus2);
//        bPlus2.setOnClickListener(this);
//        bMinus3 = (Button) findViewById(buttonMinus3);
//        bMinus3.setOnClickListener(this);
//        bPlus3 = (Button) findViewById(buttonPlus3);
//        bPlus3.setOnClickListener(this);
//    }
//    @Override
//    public void onClick(View view) {
//        switch(view.getId()){
//            case hotmenu_checkout:
//                break;
////            case listviewFlavor1:
////                break;
////            case listviewFlavor2:
////                break;
////            case listviewFlavor3:
////                break;
//            case buttonMinus:
//                break;
//            case buttonMinus2:
//                break;
//            case buttonMinus3:
//                break;
//            case buttonPlus:
//                break;
//            case buttonPlus2:
//                break;
//            case buttonPlus3:
//                break;
//        }
//    }
}
