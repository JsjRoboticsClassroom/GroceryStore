package nyc.c4q.grocerystore.employeeHandbook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import nyc.c4q.grocerystore.R;

public class EmployeeHandbookActivity extends AppCompatActivity{

    private RecyclerView mRecyclerView;
    private TextView mEmployeeCount;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_handbook);
        mRecyclerView = (RecyclerView) findViewById(R.id.employeeList);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,3));
        mRecyclerView.setAdapter(new EmployeeListAdapter());
        mEmployeeCount = (TextView) findViewById(R.id.select_an_employee);
        Integer employeeCount = mRecyclerView.getAdapter().getItemCount();
        mEmployeeCount.setText(getString(R.string.select_an_employee, employeeCount));
    }
}
