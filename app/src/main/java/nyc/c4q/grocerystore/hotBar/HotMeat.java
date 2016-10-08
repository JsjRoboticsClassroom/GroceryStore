package nyc.c4q.grocerystore.hotBar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import nyc.c4q.grocerystore.R;

public class HotMeat extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        final Button bMenu = (Button) findViewById(R.id.buttonMenu);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.hot_foods);

        bMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toMenu = new Intent(HotMeat.this, HotMenu.class);
                startActivity(toMenu);
            }
        });

    }
}
