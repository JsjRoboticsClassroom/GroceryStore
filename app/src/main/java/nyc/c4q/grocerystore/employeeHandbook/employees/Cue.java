package nyc.c4q.grocerystore.employeeHandbook.employees;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.grocerystore.R;

/**
 * Created by queenabergen on 10/24/16.
 */

public class Cue extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.queenabergen,container,false);
    }
}
