package nyc.c4q.grocerystore.employeeHandbook.employees;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.grocerystore.R;

/**
 * Created by andresarango on 9/27/16.
 */

public class AndresFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.andres_arango,container,false);
        return view;
    }
}
