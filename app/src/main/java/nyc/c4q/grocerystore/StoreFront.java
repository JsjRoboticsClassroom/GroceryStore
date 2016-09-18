package nyc.c4q.grocerystore;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StoreFront extends AppCompatActivity {

    private Button mEnterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store_front);
        mEnterButton = (Button) findViewById(R.id.enter_button);
    }

    @Override
    public void onResume(){
        super.onResume();
        mEnterButton.setOnClickListener(buildEnterButtonListener());
    }

    private View.OnClickListener buildEnterButtonListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchStoreMenuIntent(view.getContext());
            }
        };
    }

    private void launchStoreMenuIntent(Context context) {
        Intent intent = new Intent(context, StoreDirectory.class);
        context.startActivity(intent);
    }

}
