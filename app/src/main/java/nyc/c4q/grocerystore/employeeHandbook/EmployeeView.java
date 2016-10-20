package nyc.c4q.grocerystore.employeeHandbook;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import nyc.c4q.grocerystore.R;
import nyc.c4q.grocerystore.employeeHandbook.employees.Ashique;
import nyc.c4q.grocerystore.employeeHandbook.employees.Danny;

public class EmployeeView extends AppCompatActivity {
    public static final String EMPLOYEE_NAME = "extra.employee.name";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_view);
        String employee = getIntent().getStringExtra(EMPLOYEE_NAME);
        if(employee != null){
            // call a function
            if (employee.equals("Danny"))
                showDanny();
        }
    }

    private void showAshique(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile,new Ashique());
        fragmentTransaction.commit();
    }

    private void showDanny(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile,new Danny());
        fragmentTransaction.commit();
    }
}
