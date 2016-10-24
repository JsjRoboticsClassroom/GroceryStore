package nyc.c4q.grocerystore.hotBar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import nyc.c4q.grocerystore.R;

public class HotMeat extends AppCompatActivity {

    Button hotBarMenu;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hot_foods);

        hotBarMenu = (Button) findViewById(R.id.buttonMenu);
        hotBarMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                toIntent();

            }
        });

    }

    private void toIntent() {
        Intent toMenu = new Intent(HotMeat.this, HotMenu.class);
        startActivity(toMenu);
    }
}
