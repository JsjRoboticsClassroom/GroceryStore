package nyc.c4q.grocerystore.employeeHandbook.employees;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.grocerystore.R;

/**
 * Created by jordansmith on 10/19/16.
 */

public class Jordan extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.jordan_smith,container,false);
    }
}
