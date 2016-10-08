package nyc.c4q.demonstrations;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import nyc.c4q.grocerystore.R;

public class Calculator extends AppCompatActivity {

    private static final String FILENAME = "shared_preference_file";
    private static final String FIRST_TIME_OPENED = "boolean_key";
    private EditText mEditText;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greeting_calculator);
        if (savedInstanceState == null){
            // first time app started
        } else {
            // Orientation change
        }
        mEditText = (EditText) findViewById(R.id.editText);
        SharedPreferences sharedPreferences = getSharedPreferences(FILENAME,0);
        boolean firstTimeOpened = sharedPreferences.getBoolean(FIRST_TIME_OPENED, true);
        if (firstTimeOpened){
            showHelloToast();
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean(FIRST_TIME_OPENED, false);
            editor.commit();
        } else {
            showSeenYouBefore();
        }

    }

    private void showSeenYouBefore() {
        mEditText.setText("Seen you before");
    }

    private void showHelloToast() {
        mEditText.setText("Hello new user");
    }
}
