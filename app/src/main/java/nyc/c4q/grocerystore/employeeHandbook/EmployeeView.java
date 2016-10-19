package nyc.c4q.grocerystore.employeeHandbook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import nyc.c4q.grocerystore.AndresFragment;
import nyc.c4q.grocerystore.R;

public class EmployeeView extends AppCompatActivity {
    private String First_Fragment_ID;
    private String TAG = "SWAG";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_view);
            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.employee_view,new AndresFragment(),First_Fragment_ID)
                    .commit();

    }
}
