package nyc.c4q.grocerystore.employeeHandbook;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.grocerystore.R;

/**
 * Created by helenchan on 10/20/16.
 */
public class Helen extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.helen_chan, container, false);
    }
}

