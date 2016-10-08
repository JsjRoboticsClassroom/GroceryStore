package nyc.c4q.grocerystore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AndresFragProfile extends AppCompatActivity {
    private String First_Fragment_ID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ablank_layout);
        getFragmentManager()
                .beginTransaction()
                .add(R.id.ablank_layout,new AndresFragment(),First_Fragment_ID)
                .commit();
    }
}
