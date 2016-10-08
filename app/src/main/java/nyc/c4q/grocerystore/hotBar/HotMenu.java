package nyc.c4q.grocerystore.hotBar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import nyc.c4q.grocerystore.R;

/**
 * Created by rusili on 9/24/16.
 */
public class HotMenu extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        final Button bMenu = (Button) findViewById(R.id.buttonMenu);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.hot_menu);

        bMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

    }
}
